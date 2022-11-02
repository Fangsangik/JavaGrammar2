package Day6;

import java.util.ArrayList;

/*
아래의 클래스 다이어그램을 참고하여, 출력 예와 같은 결과를 얻으시오.
[엘프] Name: 티란데, HP: 100
[하이엘프] Name: 말퓨리온, HP: 160, MP: 100
[엘프로드] Name: 마이에브, HP: 230, MP: 140, SH: 100
 */
public class Final {
    public static void main(String[] args){
       Elf a = new Elf("티란데", 100);
        System.out.println(a.toString());

        HighElf b= new HighElf("말퓨리온",160, 100);
        System.out.println(b.toString());

        MyElf m = new MyElf("마이에브",230,140,100);
        System.out.println(m.toString());

        /* 리팩토링 = 코드를 계선하는 작업
        //Upcasting
        Elf g = new Elf("티란데", 100);
        Elf h= new HighElf("말퓨리온",160, 100);
        Elf k = new MyElf("마이에브",230,140,100);

//upcasting을 통해서 간결하게 만듬
        Elf[] elves ={g,h,k};

        for (int i=0; i< elves.length; i++){
            System.out.println(elves[i]);
        }



        Elf g = new Elf("티란데", 100);
        Elf h= new HighElf("말퓨리온",160, 100);
        Elf k = new MyElf("마이에브",230,140,100);
        Elf[] elves ={g,h,k};
        ArrayList<Elf> list =new ArrayList<Elf>();
        list.add(a);
        list.add(b);
        list.add(m);

        for(int i=0; i< list.size(); i++){
            System.out.println(list.get(i).toString());
        }*/
    }
}

class Elf{
    protected String name;
    protected int hp;

    Elf(String name, int hp){
        this.name=name;
        this.hp=hp;
    }

    public String toString(){
        return String.format("[엘프] Name:%s, HP:%d", this.name,this.hp);
    }
}

class HighElf extends Elf {
    protected int mp;

    public HighElf(String name, int hp, int mp) {
        super(name, hp);
        this.mp=mp;
    }

    public String toString(){
        return String.format("[하이페리온] Name:%s, HP:%d , MP:%d" , this.name,this.hp, this.mp);
    }
}
class MyElf extends HighElf{
    protected int sp;

    public MyElf (String name, int hp, int mp, int sp){
        super(name, hp, mp);
        this.sp=sp;
    }

    public String toString(){
        return String.format("[엘프로드] Name:%s, HP:%d , MP:%d, SP:%d" , this.name,this.hp, this.mp, this.sp);
    }
}
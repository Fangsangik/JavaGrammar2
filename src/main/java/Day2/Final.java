package Day2;
/*
주어진 시나리오를 참조하여, 출력 예와 같은 결과를 만드시오.
[레이너]의 스팀팩! HP: 80 -> 70
[모랄레스]의 치유! => [레이너] HP(70 -> 80)

name: 모랄레스 heal
hp : 60
mp 60 -> 50

name : 레이너 stimpack
hp 80->70->60
 */
public class Final {
    public static void main(String[] args){
    Marine marine =new Marine("레이너", 80);
    Madic madic = new Madic("모랄레스" , 60 , 60);
    }
}

class Madic{
    String name;
    int hp;
    int mp;

    Madic(String n , int i, int p){
        name = n;
        hp = i;
        mp=p;
    }
    void Heal(Marine target){

        System.out.printf("[%s]의 heal!! => [%s] H{(%d => %d\n ", name, target.name, target.hp);
        target.hp += 10;
        System.out.printf("%d\n", target.hp);
    }


}
class Marine{
    String name;
    int hp;

    Marine(String a, int h){
        name =a;
        hp =h;
    }

    void Steampack(){
        System.out.printf("[%s]의 스팀팩!! : HP: %d -> %d\n ", name , hp, hp);
        hp -= 10;
        System.out.printf("%d\n", hp);
    }
}
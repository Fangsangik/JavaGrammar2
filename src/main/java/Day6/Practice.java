package Day6;

import com.sun.jdi.connect.spi.TransportService;

/*
주어진 다이어그램과 코드를 토대로 프로그램을 동작시키려 한다.

주어진 코드의 수행결과가 출력 예와 같도록, Wizard 클래스를 완성하시오.

출력 예
[프로도]의 펀치!!
[해리포터]의 펀치!!
[해리포터]의 파이어볼@@

2.
주어진 코드는 Animal과 Pet 클래스를 정의하고 있다.
아래의 클래스 다이어그램을 참고하여 상속 통해 중복된 코드를 제거하고, 출력 예와 같은 결과를 얻으시오.

출력 예
Pet { name: 차우차우, age: 3세, price: 2200000원 }

4.
주어진 코드는 Knight 및 Thief 클래스를 정의하고 있다.
두 클래스의 공통 요소를 추출하여 부모 클래스 Adventurer를 작성하고, 출력 예와 같은 결과를 얻으시오.

출력 예
[아서스] HP: 180
[발리라] HP: 120

5.
주어진 코드로 정사각형, 삼각형, 원의 넓이를 구하려 한다.
이를 위해 아래와 같은 클래스 구조를 구현한 상황이다.
출력 예와 같은 결과를 얻도록, 메소드 오버라이딩을 통한 각 도형의 넓이를 구하시오.

출력 예
정사각형의 넓이 -> 25.00
삼각형의 넓이 -> 6.00
원의 넓이 -> 50.27

6.
주어진 코드로 농구, 축구, 탁구에 대한 설명을 출력하려 한다. 이를 위해 아래와 같은 클래스 구조를 만들어 놓았다.
하지만, private 필드로 인해 접근이 불가능한 상황이다. protected 키워드를 사용하여 이를 해결하고, 또 메소드 오버라이딩을 통해 출력 예와 같은 결과를 만드시오.

출력 예
[농구]는 손으로 공을 던져 골을 넣는 운동이다.
[축구]는 주로 발로 공을 차 넣는 운동이다.
[탁구]는 공을 번갈아가며 주고 받는 운동이다.

7.
주어진 코드를 분석 및 수정하여, 출력 예와 같은 결과를 얻으시오.

출력 예
Orc { name: 오크, hp: 80 }
OrcWarrior { name: 오크전사, hp: 120, amor: 3 }
 */
public class Practice {
    public static void main(String[] args){

        Novice novice = new Novice();
        novice.name = "프로도";
        novice.hp=100;

        Wizard wizard = new Wizard();
        wizard.name = "해리포터";
        wizard.mp =100;
        wizard.hp=120;

        novice.punch();
        wizard.punch();
        wizard.fireball();

        Pet pet = new Pet();
        pet.name="차우차우";
        pet.age = 3;
        pet.price=220000;

        System.out.printf("Pet { name: %s, age: %d세, price: %d원 }", pet.name, pet.age, pet.price);

        Thief thief = new Thief();
        thief.name = "루팡";
        thief.agility = 140;
        thief.hp = 120;

        Knight knight = new Knight();
        knight.name = "기사단";
        knight.hp = 180;
        knight.Strength= 50;

        Adventure adv0 = knight;
        Adventure adv1 = thief;
        Adventure[] advs = {adv0, adv1};


        for (int i=0; i< advs.length; i++){
            System.out.println(advs[i].toString());
        }

        Square s = new Square();
        s.name = "정사각형";
        s.length = 5;

        Triangle t = new Triangle();
        t.name = "정삼각형";
        t.base = 4;
        t.height = 3;

        Circle c = new Circle();
        c.name = "원";
        c.radius = 4;

        Shape[] shapes = {s,t,c};

        for (int i=0; i< shapes.length; i++){
            Shape tmp = shapes[i];
            System.out.printf("%s의 넓이 -> %.2f\n", tmp.name, tmp.area());
        }

        Basketball b = new Basketball();
        Soccer soccer = new Soccer();
        PingPong p =new PingPong();

        b.name = "농구";
        s.name="축구";
        p.name ="탁구";

        Sprots[] sprots = {b,soccer,p};

        for(int i=0; i<sprots.length; i++){
            Sprots tmp = sprots[i];
            tmp.description();
        }

        Orc orc = new Orc("오크" , 80);
        System.out.println(orc.toString());
        OrcWarrior orcWarrior = new OrcWarrior("존사 오크" , 120 ,123);
        System.out.println(orcWarrior.toString());




    }
}

class Novice{
    String name;
    int hp;

    public void punch(){
        System.out.printf("[%s]의 펀치!!\n", name);
    }
}

class Wizard extends Novice{
    int mp;

    public void fireball(){

    }
}

class Animal{
    String name;

    public void cry(){
        System.out.println("동물이 웁니다");
    }
}

class Pet extends  Animal{
    int age;
    int price;

    public void play(){
        System.out.println("동물이 놉니다");
    }
}

class Adventure {
    String name;
    int hp;

    public void punch(){
        System.out.printf("[%s]의 펀치!!\n", name);
    }
}

class Thief extends Adventure{
    int agility;

    public String toString(){
        return String.format("[%s] HP: %d", name, hp);
    }
    public void sharpen() {
        System.out.println("크리티컬 확률이 증가합니다.");
    }

}
class Knight extends  Adventure{
    int Strength;

}
class Shape{
    String name;

    public double area(){
        return 0;
    }
}
class Square extends Shape{
    int length;
    public double area(){
        return length*length;
    }
}

class Circle extends Shape{
    int radius;
    public double area(){
        return Math.PI*radius;
    }
}

class Triangle extends Shape{
    int base;
    int height;
    public double area(){
        return base*height*2.0;
    }
}

class Sprots{ // 같은 공간에 있는 것들 사용 가능
    protected String name;

    public void description(){
        System.out.printf("[%s]는 여가/경기/체력 단련 등을 위한 신체 운동입니다.\n", name);
    }
}

class Basketball extends Sprots{

}

class Soccer extends Sprots{

}

class PingPong extends Sprots{

}

class Orc {
    protected String name;
    protected int hp;

    public Orc(String name, int hp) {
        this.name = name;
        this.hp = hp;
    }

    public String toString() {
        return String.format("Orc { name: %s, hp: %d }", this.name, this.hp);
    }
}

class OrcWarrior extends Orc{
    protected int amor;

    public OrcWarrior(String name, int hp, int amor){
        super(name, hp);
        this.amor=amor;
    } // super을 사용함으로써 객체 초기화

    public String toString(){
        return String.format("OrcWarrior { name: %s, hp: %d, amor: %d }", super.name, super.hp, this.amor);
    }
}
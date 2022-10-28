package Day1;
/*
1.
주어진 코드는 두 개의 클래스, Main과 Dog로 이루어져있다. 아래의 클래스 다이어그램을 참조하여 Dog 클래스를 완성하고, 출력 예와 같은 결과를 얻으시오.
(Main 클래스의 코드 그대로 사용 할 것)

2.
네로는 3살 된 페르시안 고양이다. 주어진 코드를 통해 이를 출력하려 한다. 하지만 현재 결과는 아래와 같다.

이름: null
품종: null
나이: 0

객체의 필드 값을 변경하여, 출력 예와 같은 결과를 얻으시오.
이름: 네로
품종: 페르시안
나이: 3

3.
주어진 코드는 Bicycle 객체 b1을 생성하고 그 정보를 출력하는 코드이다.
해당 코드를 수정하여, 출력 예와 같은 결과를 얻으시오.

4.
주어진 코드는 고양이 객체에게 meow() 메소드를 수행토록 명령하여, 아래와 같은 결과를 출력한다.

야옹~
야옹~
claw() 메소드를 완성 및 호출하여, 출력 예와 같은 결과를 얻으시오.

5.
주어진 코드의 두 고양이 객체는, 각각 meow() 메소드를 아래와 같이 동작한다.

cat1.meow(); // [네로]의 야옹~
cat2.meow(); // [나비]의 야옹~
하지만 claw() 메소드의 경우, 어느 고양이가 할퀴었는지 구분할 수 없는 상황이다.

cat1.claw(); // 할퀴기! 샥샥~
cat2.claw(); // 할퀴기! 샥샥~
이를 구분키 위해 claw() 메소드를 수정하고, 출력 예와 같은 결과를 얻으시오.

 6.
출력 예와 같은 결과를 얻도록, 주어진 코드의 흐름 분석 및 수정하시오.

출력 예
사이다
맥주
 */


public class Practice1 {
    public static void main(String[] args){
        //객체 생성
        //new로 인하여 Dog에 대한 객체가 생성이 되고
        // Dog d는 만들어진 객체에다가 d를 입힌다
        Dog d = new Dog();

        //Dog에 대한 필드값 출력
        //d.name , d.breeds, d.age => d라는 변수 명을 타고 해당 객체에 접근이 가능
        System.out.printf("이름: %s\n", d.name);
        System.out.printf("품종: %s\n", d.breeds);
        System.out.printf("나이: %s\n", d.age);

        Cat c2 = new Cat();
        Cat c =new Cat();
        c.name="네로";
        c.age=3;
        c.breeds="페르시안";
        c2.meow();
        c2.claw();
        c.claw();
        c.meow();
        System.out.printf("이름: %s\n", c.name);
        System.out.printf("품종: %s\n", c.breeds);
        System.out.printf("나이: %s\n", c.age);

        Bicycle b1 = new Bicycle();
        b1.name = "로드형 자전거";
        b1.weight=7.25;
        b1.price = 326000;

        Bicycle b2 = new Bicycle();
        b2.name = "산악형 자전거";
        b2.price=429000;
        b2.weight=10.68;

        System.out.printf("b1->{%s, %.2f, %d}\n", b1.name, b1.weight, b1.price);
        System.out.printf("b2->{%s, %.2f, %d}\n", b2.name, b2.weight, b2.price);

        Cat2 cat1 = new Cat2();
        Cat2 cat2 = new Cat2();

        cat2.name = "네로";
        cat1.name = "나비";
        cat2.age=10;
        cat1.age=7;
        cat1.breeds = "페르시안";
        cat2.breeds = "먼치킨";
        cat1.claw();
        cat1.meow();
        cat2.meow();
        cat2.claw();


        DrinkMuchine machine1 = new DrinkMuchine();
        DrinkMuchine machine2 = new DrinkMuchine();

        machine2.printOutput();
        machine1.printOutput();

        machine2.pushButton(1);
        machine1.pushButton(2);
    }
}

//Dog class
//클래스가 있으면 객체를 만들 수 있다.
class Dog{
    //fields
    String name;
    String breeds;
    int age;

    //methods
    void wag(){
        System.out.println("꼬리치기");
    }

    void  bark(){
        System.out.println("짖기");
    }
}

// String type에 값이 대입이 안되면 = null
// int 값에 대입이 없으면 = 0

class Cat{
    String name;
    String breeds;
    int age;

    void claw(){
        System.out.println("할퀴기 쓱싹");
    }
    void meow(){
        System.out.println("야옹");
    }


}

class Bicycle{
    String name;
    double weight;
    int price;

    void move(){
        System.out.println("이동");
    }
    void horn(){
        System.out.println("띠링띠링");
    }

}
class Cat2{
    String name;
    String breeds;
    int age;

    void meow(){
        System.out.printf("[%s]의 야옹\n" , name);
    }

    void claw(){
        System.out.printf("[%s]의 샥샥" , name);
    }
}

class DrinkMuchine{
    String output;

    void pushButton(int num){
        String[] drinks ={"콜라" , "사이다", "맥주"};
        output = drinks[num];
    }

    void printOutput(){
        System.out.println(output);
    }
}
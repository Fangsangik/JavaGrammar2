package Day5;

import java.util.ArrayList;
import java.util.Random;

/*
1.
주어진 코드로 두 개의 주사위 눈 값 A(1 ~ 6)와 B(1 ~ 6)를 출력하려한다.
클라우드스터딩-자바-API-주사위의-눈-Math-Random

출력 예와 같은 결과를 얻도록, 코드를 완성하시오.

출력 예
A와 B의 값은 변할 수 있음. (단, 두 주사위 값의 범위는 1 ~ 6)

A: 2
B: 5

2.
주어진 코드는 주사위 A와 B의 눈의 값을 출력한다.
주사위 A와 B를 동시에 100회 던진 결과의 합을 토대로, 출력 예와 같은 결과를 만드시오.

출력 예
아래의 합계 별 출력 횟수는 그때 그때 다름!

 2 => #
 3 => #####
 4 => ##########
 5 => ############
 6 => ###########
 7 => ####################
 8 => ################
 9 => ###########
10 => #####
11 => #######
12 => ##
힌트
배열에 값을 기록
반복문을 통한 출력

3.
주어진 코드를 완성하여, 출력 예와 같은 결과를 얻으려 한다. 주석을 힌트 삼아 코드를 완성하시오.

출력 예
names.get(0) -> Kim
names.get(1) -> Lee
names.get(2) -> Park
names.get(3) -> Choi
names.get(4) -> Hong
names.get(5) -> No

4.
ArrayList에 Book 객체들을 담고, 이를 출력하려 한다. 출력 예와 같은 결과를 얻도록 코드를 완성하시오.

출력 예
list.get(0) -> Book { name: 원피스, price: 4500 }
list.get(1) -> Book { name: 나루토, price: 4000 }
list.get(2) -> Book { name: 자바 프로그래밍, price: 24000 }

5.
주어진 코드로 ArrayList의 요소를 변경하는 연습을 하려 한다. 출력 예와 같은 결과를 얻도록, 코드를 완성하시오.

출력 예
=== 변경 전 ===
Monster { name: 슬라임, level: 1 }
Monster { name: 오크, level: 3 }
Monster { name: 골렘, level: 8 }
=== 변경 후 ===
Monster { name: 토끼, level: 1 }
Monster { name: 오크, level: 3 }
Monster { name: 골렘, level: 8 }

6.
라면(Ramen) 객체를 ArrayList에 담고, 담겨진 라면의 총합을 구하시오.

출력 예
Ramen { name: 신라면, price: 800 }
Ramen { name: 진라면, price: 700 }
Ramen { name: 비빔면, price: 600 }
================================
합계 : 2100원
 */
public class Practice {
    public static void main(String[] args){
        int[] counts =new int[13]; // 0~12

        for (int i=0; i<100; i++){
        int a = DieA.roll();
        int b = DieB.roll();
        counts[a+b]++;

        }
        //counts 결과 출력
        for (int row =2; row<counts.length; row++){
            System.out.printf("%d => " , row);
            //#을 출력
            for (int cal =0; cal<counts[row]; cal++){
                System.out.printf("#");
            }
            System.out.println();
        }

        ArrayList<String> names = new ArrayList<String>();
        names.add("Kim");
        names.add("Park");
        names.add("Lee");
        names.add("Choi");
        names.add("Hong");
        names.add("NO");

        //배열의 경우 size
        for (int i=0; i< names.size(); i++){
            System.out.printf("\"list.get(%d) -> %s\n",i,names.get(0));
        }

        ArrayList<Book> list = new ArrayList<Book>();
        Book book =new Book("원피스",4500);
        Book book1 = new Book("나루토" , 5000);
        Book book2 = new Book("드래곤볼", 5000);
        //ArrayList 객체에 book 객체 담기
        list.add(book);
        list.add(book1);
        list.add(book2);

        for (int i=0; i<list.size(); i++){
            System.out.printf("list.get(%d) -> %s\n0" , i ,list.get(i));
        }


      //  System.out.printf("list.get(%d) -> %s\n0" , 1 ,list.get(1));
        //System.out.printf("list.get(%d) -> %s\n0" , 2 ,list.get(2));

        ArrayList<Monster> list1 = new ArrayList<Monster>();
        Monster monster = new Monster("슬라임", 1);
        Monster monster1 = new Monster("오크" , 3);
        Monster monster2 = new Monster("골렘" , 6);

        list1.add(monster1);
        list1.add(monster2);
        list1.add(monster);

        System.out.println("==변경전==");
        System.out.println(list1.get(0).toString());
        System.out.println(list1.get(1).toString());
        System.out.println(list1.get(2).toString());

        Monster monster3 = new Monster("토끼",1);
        list1.set(0, monster3);

        System.out.println("==변경후==");
        System.out.println(list1.get(0).toString());
        System.out.println(list1.get(1).toString());
        System.out.println(list1.get(2).toString());

        ArrayList<Noodle> list2 = new ArrayList<Noodle>();
        Noodle noodle = new Noodle("신라면",800);
        Noodle noodle1 = new Noodle("진리먄" , 700);
        Noodle noodle2 = new Noodle("비빔면" , 600);

        list2.add(noodle);
        list2.add(noodle1);
        list2.add(noodle2);

        System.out.println(list2.get(0).toString());
        System.out.println(list2.get(1).toString());
        System.out.println(list2.get(2).toString());

        int sum=0;
        sum+=list2.get(0).getPrice(); // get0 자리에 800이 들어감
        sum+=list2.get(1).getPrice();
        sum+=list2.get(2).getPrice();

        System.out.printf("총합 %d" ,sum);
    }

}

class DieA{ // random을 사용했기에 A의 값 변화함
    public static int roll() {
        double r = Math.random() * 6;
        int randInt = (int) r;
        return randInt + 1;
    }
}

class DieB{
    public static int roll(){
        Random random = new Random();
        int randInt=random.nextInt(6); // 0~5 까지 이기에 +1을 더해주어야 함
        return randInt +1;
    }
}

class Book{
    String name;
    int price;

    Book(String name, int price){
        this.name=name;
        this.price=price;
    }

    public String toString(){
        return String.format("Book { name: %s, price: %d }", name, price);
    }
}

class Monster {
    String name;
    int level;

    Monster(String name, int level) {
        this.name = name;
        this.level = level;
    }

    public String toString() {
        return String.format("Monster { name: %s, level: %d }", name, level);
    }
}

class Noodle{
    private String name;
    private int price;

    Noodle(String name, int price){
        this.name=name;
        this.price=price;
    }

    public int getPrice(){
        return price;
    }

    public void setPrice(int price){
        this.price=price;
    }

    public String toString(){
        return String.format("noddle { name: %s, price: %d }", name, price);
    }
}
package Day7;
/*
1.
주어진 코드의 SmartPhone 클래스는 Phone 인터페이스를 구현하기로 선언되어있다.
hone 인터페이스를 오버라이딩(재정의)하여, 출력 예와 같은 결과를 얻으시오.

출력 예
010-1234-5678로 전화를 겁니다!
전화벨이 울립니다~

2.
주어진 코드의 Alarm 인터페이스를 SmartPhone 클래스에 구현하고, 출력 예와 같은 결과가 나오도록 코드를 완성하시오.
출력 예
삐빕! 삐비비빕~!
[상어송]을 재생합니다.

3.
문제
주어진 코드의 두 인터페이스 Tanker와 Healer를 HolyKnight 클래스에 부여하고, 출력 예와 같은 결과를 얻도록 코드를 완성하시오.

출력 예
전체 체력 +50 증가시킵니다.
체력을 +30 회복합니다.

4.
쓰리잡 인생 홍팍이는 3가지의 직업(개발자, 강사, 마사지사)을 가지고 있다.
출력 예와 같이 홍팍이가 쓰리잡을 뛸 수있도록, 뼈대코드 수정하시오.

출력 예
홍팍 -> Java 프로그래밍 중!
홍팍 -> 자료구조 수업 중!
홍팍 -> 마사지 중!

5.
주어진 코드에는 Flyable 인터페이스를 구현하고 있는 서로 다른 3개의 클래스들이 존재한다.
출력 예와 같은 결과를 얻도록, Flyable 인터페이스를 각 클래스에 구현하여 코드를 완성하시오.

출력 예
<새>가 날개를 퍼덕이며 날아갑니다!
<헬기>가 프로펠러를 힘차게 돌리며 날아갑니다!
<로켓>이 제트 엔진을 분출하며 날아갑니다!

6.
홍팍이는 마트에서 족발과 에어팟, 그리고 셔츠를 구매하였다. 각각의 정가는 아래와 같다.

족발: 19,800원
에어팟: 199,000원
셔츠: 49,900원
그런데 이게 왠걸, 아래와 같이 할인률이 적용된다 한다.

음식: 10%
전자기기: 20%
의류: 30%
주어진 코드를 활용하여 할인률이 적용된 총합을 계산하고, 출력 예와 같은 결과를 얻으시오.

출력 예
총합: 211950원
 */

import javax.crypto.spec.PSource;
import java.util.ArrayList;

public class Practice {
    public void main(String[] args) {
        SmartPhone smartPhone = new SmartPhone("아이폰", "010-1234-5678");
        smartPhone.call("010-1234-5678");
        smartPhone.ring();

        Computer computer = new Computer("윈도우");
        computer.beep();
        computer.playMusic("fkfkfkfkffk");

        HollyKnight hollyKnight = new HollyKnight("아서스", 180);
//uptake
        Tanker tanker = hollyKnight;
        tanker.increaseHP();

        Healler healler = hollyKnight;
        healler.heal();


        Hwnag person = new Hwnag("상익");

        Developer developer = person;
        person.programming("Java");
        Massage massage = person;
        person.massage();
        Instructor instructor = person;
        person.teach("java");

        Bird bird = new Bird();
        Helicopter copter = new Helicopter();
        Rocket rocket = new Rocket();

        // 인터페이스 타입으로 그룹화
        Flyabel[] flyableThings = {bird, copter, rocket};

        // 모든 날것들을 날림
        for (int i = 0; i < flyableThings.length; i++) {
            Flyabel temp = flyableThings[i];
            temp.fly();
        }

        Orderable orderable = new Food("족발", 19800);
        Electronics electronics = new Electronics("에어팟", 199000);
        Clothing clothing = new Clothing("셔츠", 495000);

        ArrayList<Orderable> list = new ArrayList<Orderable>();
        list.add(orderable);
        list.add(electronics);
        list.add(clothing);

        int sum = 0;
        for (int i = 0; i <= list.size(); i++) {
            sum += orderable.discountedPrice();
        }
    }
}

    // 스마트폰 => 폰 (implements) ==> phone interface가 가지고 있는 것을 스마트 폰에서 overriding
    interface Phone {
        public void call(String targetNumber);

        public void ring();

    }

    interface Alarm {
        public void beep();

        public void playMusic(String title);
    }

    class Computer implements Alarm {
        private String name;

        public Computer(String name) {
            this.name = name;
        }

        public void beep() {
            System.out.println("삐삐삐삐삐삐삐");
        }

        public void playMusic(String title) {
            System.out.println("F라라ㅏㄹ라라");
        }
    }


    class SmartPhone implements Phone {
        protected String name;
        protected String phoneNumber;

        public SmartPhone(String name, String phoneNumber) {
            this.name = name;
            this.phoneNumber = phoneNumber;
        }

        public void call(String targetNumber) {
            System.out.printf("%s 전화를 겁니다\n", targetNumber);
        }

        public void ring() {
            System.out.println("전화밸이 울립니다.");
        }

    }

    interface Tanker {
        public void increaseHP();
    }

    interface Healler {
        public void heal();
    }

    class HollyKnight implements Tanker, Healler {
        private String name;
        private int hp;

        public HollyKnight(String name, int hp) {
            this.name = name;
            this.hp = hp;
        }

        public void increaseHP() {
            System.out.println("전체 체력 +50");
        }

        public void heal() {
            System.out.println("체력 30 회복");
        }
    }

    interface Developer {
        public void programming(String lang);

    }

    interface Instructor {
        public void teach(String subject);

    }

    interface Massage {
        public void massage();
    }

    class Hwnag implements Developer, Instructor, Massage {
        private String name;

        public Hwnag(String name) {
            this.name = name;
        }

        public void programming(String lang) {
            System.out.printf("%s => %s 프로그래밍 중\n", name, lang);
        }

        public void teach(String subject) {
            System.out.printf("%s => %s 수업중\n", name, subject);
        }

        public void massage() {
            System.out.printf("%s => 마사지 증\n", name);
        }
    }

    interface Flyabel {
        public void fly();
    }

    class Bird implements Flyabel {
        public void fly() {
            System.out.println("새가 날개를 퍼덕임");
        }

    }

    class Helicopter implements Flyabel {
        public void fly() {
            System.out.println("헬기 남");
        }
    }

    class Rocket implements Flyabel {
        public void fly() {
            System.out.println("로켓 빠름");
        }
    }

    interface Orderable {
        public int discountedPrice();
    }

    class Food implements Orderable {
        private String name;
        private int price;

        public Food(String name, int price) {
            this.name = name;
            this.price = price;
        }

        public int discountedPrice() {
            return price;
        }

    }

    class Electronics implements Orderable {
        private String name;
        private int price;

        public Electronics(String name, int price) {
            this.name = name;
            this.price = price;
        }

        public int discountedPrice() {
            return (int) (price * 0.9);
        }
    }

    class Clothing implements Orderable {
        private String name;
        private int price;

        public Clothing(String name, int price) {
            this.name = name;
            this.price = price;
        }

        public int discountedPrice() {
            return (int) (price * 0.8);
        }
    }





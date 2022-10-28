package Day2;
/*
1.
주어진 코드는 자전거 객체를 생성하고, 그 정보를 아래와 같이 출력한다.

Bicycle { 부릉2, 21.74kg, 899000원 }
또 하나의 객체를 추가하여, 출력 예와 같은 결과를 얻으시오.

출력 예
Bicycle { 부릉2, 21.74kg, 899000원 }
Bicycle { 씽씽2, 12.57kg, 495000원 }

2.
아래는 우리 동네 고로케 전문점에서 가장 잘 나가는 TOP 3 다.

피자 고로케(1000원)
야채 고로케(800원)
팥 고로케(500원)
주어진 Goroke 클래스를 활용하여 피자, 야채, 팥 고로케를 객체로 만들고,
출력 예와 같은 결과를 얻으시오.

출력 예
Goroke { name: 피자, price: 1000원 }
Goroke { name: 야채, price: 800원 }
Goroke { name: 팥, price: 500원 }

3.
아래와 같은 4개의 Hero 객체를 생성하고, 이들에 대한 정보를 출력하려 한다.
주어진 Hero 클래스에 생성자를 완성하여, 출력 예와 같은 결과를 얻으시오.

아이언맨(hp: 80)
타노스(hp: 160)
토르(hp: 150)
그루트(hp: 40)
출력 예
Hero { name: 아이언맨, hp: 80 }
Hero { name: 타노스, hp: 160 }
Hero { name: 토르, hp: 150 }
Hero { name: 그루트, hp: 40 }

3.
주어진 코드가 실행되지 않는 이유를 분석하고 수정하여, 출력 예와 같은 결과를 얻으시오.
Drink { name: 포카리, price: 1000 }
Drink { name: 박카스, price: 800 }

4.
아래와 같은 노래 목록이 있다.

별헤는 밤 - 유재하
비상 - 임재범
비밀 - 박완규
이들을 객체 배열로 만들어, 반복문을 통해 출력 예와 같은 결과를 얻으시오.

출력 예
Song { name: 별헤는 밤, singer: 유재하 }
Song { name: 비상, singer: 임재범 }
Song { name: 비밀, singer: 박완규 }

5.
주어진 코드를 실행하면 토르가 펀치를 한다.

[토르]의 펀치!!
펀치 대상의 정보가 함께 나타나도록, 코드를 추가하여 출력 예와 같은 결과를 얻으시오.

출력 예
[토르]의 펀치!! 타노스의 HP: 160 -> 150
[타노스]의 펀치!! 토르의 HP: 150 -> 140
[타노스]의 펀치!! 토르의 HP: 140 -> 130
 */
public class Practice { // 시나리오 작성
    public static void main(String [] args) {
        Bicycle b1 = new Bicycle("부릉", 21.74, 890000);
        Bicycle b2 = new Bicycle("씽씽", 12.57, 4950000);
        System.out.printf("Bicycle { %s, %.2fkg, %d원 }\n", b1.name, b1.weight, b1.price);
        System.out.printf("Bicycle { %s, %.2fkg, %d원 }\n", b2.name, b2.weight, b2.price);

        Groke groke = new Groke("피자",1000);
        Groke groke1 = new Groke("야채" , 800);
        Groke groke2 = new Groke("팥", 500);

        System.out.println(groke1.str());
        System.out.println(groke2.str());
        System.out.println(groke.str());

        //groke.str => 해당 str 메소드를 호출한다.


        Hero hero = new Hero("아이언맨",80);
        Hero hero1 = new Hero("타노스", 160);
        Hero hero2 = new Hero("토르" , 150 );
        Hero hero3 = new Hero("그루트" , 40);

        System.out.println(hero.str());
        System.out.println(hero1.str());
        System.out.println(hero2.str());
        System.out.println(hero3.str());

        Drink d1 = new Drink(); //디폴트 생성자가 없기 때문에 error 발생
        d1.price=1000;
        d1.name="포카리";

        Drink d2 = new Drink("박카스" , 800);


        System.out.println(d1.str());
        System.out.println(d2.str());

        Song s = new Song("별해는 밤" ,"유재하");
        Song s1 = new Song("비상" , "임재범");
        Song s2 = new Song("비밀", "박완규");

        Song[] songs = {s,s1,s2};
        for (int i=0; i< songs.length; i++){
            System.out.println(songs[i].str());
            //0부터 모든 배열을 돌면서 모든 객체를 반환 받으면서 출력
        }


        Hero2 thor = new Hero2("토르" , 150);
        Hero2 thanos = new Hero2("타노스" , 160);

        thor.punch(thanos);// thanos가 enemy로 받는다.
        thanos.punch(thor);
        thanos.punch(thor);
    }
}

class  Bicycle{ // 객체를 생성하기 위해 설계도
    String name;
    double weight;
    int price;

    Bicycle(String n, double w, int p){
        name = n;
        weight = w;
        price = p;
    }
}

class Groke{
    String name;
    int price;

    Groke(String n, int p){
        name = n;
        price = p;
    }

    String str(){ //객체의 메소드인 str (고로케 객체의 필드 정보를 문자열로 변환)
        return String.format("Goroke {name;%s, price:%d원}" , name, price);
    }
}

class Hero{
    String name;
    int hp;

    Hero(String n, int h){
        name = n;
        hp = h;
    }

    String str(){
        return String.format("hero{name:%s, hp:%d}" , name, hp);
    }
}

class Drink {
    String name;
    int price;

    Drink(){
    }

    Drink(String n, int p){ //두개의 생성자를 갖음
        name =n ;
        price = p;
    }

    String str(){
        return String.format("Drink { name: %s, price: %d }", name, price);
    }
}

class Song{
    String name;
    String artist;

    public Song (String n, String a){
        name = n;
        artist = a;
    }

    String str(){
        return String.format("Song { name: %s, singer: %s }", name, artist);
    }
}

class Hero2 {
    String name;
    int hp;

    Hero2(String n, int i){
        name= n;
        hp = i ;
    }

    void punch(Hero2 enemy){
        System.out.printf("[%s]의 펀치!! ", name);
        System.out.printf("%s의 HP;%d ->", enemy.name ,enemy.hp);

        enemy.hp -= 10;
        System.out.printf("%d\n", enemy.hp);
    }

}

package Day3;
/*
1.

이번 한 주, 직원들의 요일별 근무 시간이 아래에 정리되어있다.

#	일	월	화	수	목	금	토
직원0	2	4	3	4	5	8	8
직원1	7	3	4	3	3	4	4
직원2	3	3	4	3	3	2	2
직원3	9	3	4	7	3	4	1
직원4	3	5	4	3	6	3	8
직원5	3	4	4	6	3	4	4
직원6	3	7	4	8	3	8	4
직원7	6	3	5	9	2	7	9

출력 예
직원0 -> 34 시간
직원1 -> 28 시간
직원2 -> 20 시간
직원3 -> 31 시간
직원4 -> 32 시간
직원5 -> 28 시간
직원6 -> 37 시간
직원7 -> 41 시간

2.
양궁 국가 대표 선발전 결과가 아래와 같다.

선수명	득점 상황
Kim	10, 9, 9, 8
Lee	9, 10, 9, 9
Park	10, 9, 10, 10

출력 예와 같은 결과를 얻도록, 코드를 완성하시오.

출력 예
Kim -> 36점
Lee -> 37점
Park -> 39점

3.
양궁 국가 대항전의 득점 현황은 아래와 같다.

대한민국 선수단	득점 현황
Kim	9, 8, 10
Lee	10, 9, 10
Park	8, 10, 9
중국 선수단	득점 현황
Xiao	10, 9, 10
Yu	8, 9, 10
Xui	8, 9, 9
주어진 코드를 분석 및 수정하여, 출력 예와 같은 결과를 얻으시오.

출력 예
KOREA -> 83 points
CHINA -> 82 points

4.샘숭전자의 갤럭시 스마트폰은 고유의 시리얼 넘버를 가지고 있다. 이 시리얼 넘버는 임의의 알파벳과 생성 순서를 번호로 가진다.

// 시리얼 넘버 예
Galaxy { serialNum: I-1 } // 1번째 객체
Galaxy { serialNum: V-2 } // 2번째 객체
Galaxy { serialNum: U-3 } // 3번째 객체
그런데 주어진 코드의 시리얼 넘버에는 문제가 있다.
생성 순서에 따른 번호가 아닌 모두 1을 출력하고 있다.

Galaxy { serialNum: I-1 }
Galaxy { serialNum: V-1 }
Galaxy { serialNum: U-1 }
Galaxy { serialNum: P-1 }
Galaxy { serialNum: S-1 }
=========================
Galaxy 객체의 개수: ?
주어진 코드에 클래스 변수를 적용하여, 출력 예와 같은 결과를 얻으시오.

출력 예
Galaxy { serialNum: I-1 }
Galaxy { serialNum: V-2 }
Galaxy { serialNum: U-3 }
Galaxy { serialNum: P-4 }
Galaxy { serialNum: S-5 }
=========================
Galaxy 객체의 개수: 5

5.
주어진 코드는 아래와 같은 결과를 출력한다.

[팥] 붕어빵
[고구마] 붕어빵
==============
붕어빵 객체 수: ?
이를 분석 및 수정하여, 출력 예와 같은 결과를 얻으시오.

출력 예
[팥] 붕어빵
[고구마] 붕어빵
[치즈] 붕어빵
[슈크림] 붕어빵
==============
붕어빵 객체 수: 4

5.
주어진 코드의 출력 결과는 아래와 같다.

Circle { 중심: (0, 0), 반지름: 3 } => 넓이: 0.00
Circle { 중심: (2, 3), 반지름: 4 } => 넓이: 0.00
코드를 분석 및 수정하여, 두 써클 객체 c1, c2의 넓이를 출력 예와 같이 얻으시오.

출력 예
Circle { 중심: (0, 0), 반지름: 3 } => 넓이: 28.27
Circle { 중심: (2, 3), 반지름: 4 } => 넓이: 50.27
 */
public class Practice {
    public static void main(String[] args) {
        int hours0[] = {2, 3, 4, 5, 8, 8,};
        int hours1[] = {7, 3, 4, 3, 3, 4, 4};
        Emplyoee e0 = new Emplyoee("직원0", hours0); // 객체를 생성
        Emplyoee e1 = new Emplyoee("직원1", hours1);
        Emplyoee[] emplyoees = {e0, e1}; // 배열에다가 담음 => 한칸짜리 배열
        for (int i = 0; i < emplyoees.length; i++) { // 0번째 위치한 놈에
            emplyoees[i].printTotalHours(); // printTotalHours
        }

        int[] score0 = {10, 9, 9, 8};
        int[] score1 = {9, 10, 9, 9};
        int[] score2 = {10, 9, 10, 10};
        Player player0 = new Player("Kim", score0);
        Player player1 = new Player("lee", score1);
        Player player2 = new Player("pakr", score2);
        Player[] players = {player0, player1, player2};
        for (int i = 0; i < players.length; i++) {
            players[i].PrintTotalScore();
        }

        Player2 player20 = new Player2("kim", new int[]{9, 8, 10});
        Player2 player21 = new Player2("lee", new int[]{10, 9, 10});
        Player2 player22 = new Player2("park", new int[]{8, 10, 9});

        Player2 player23 = new Player2("kim", new int[]{10, 9, 10});
        Player2 player24 = new Player2("lee", new int[]{8, 9, 10});
        Player2 player25 = new Player2("park", new int[]{8, 9, 9});

        Player2[] koreaPlayer = {player20, player21, player22};
        Player2[] chinaPlayer = {player23, player24, player25};

        Team China = new Team("China", chinaPlayer);
        Team Korea = new Team("Korea", koreaPlayer);
        Korea.printTeamPoints();
        China.printTeamPoints();


        Galaxy[] phones = new Galaxy[5]; //5칸 크기의 객체 배열을 생성

        //반복문을 통해 객체를 5개 생성
        for (int i = 0; i < phones.length; i++) {
            phones[i] = new Galaxy();
        }

        //모든 객체의 정보를 출력, print method를 통해서
        for (int i = 0; i < phones.length; i++) {
            phones[i].print();
        }
        System.out.println("=========================");
        System.out.printf("Galaxy 객체의 개수: ?");


        FishBread[] breads = new FishBread[4];
        breads[0] = new FishBread(0);
        breads[1] = new FishBread(1);
        breads[2] = new FishBread(2);
        breads[3] = new FishBread(3);

        for (int i = 0; i < FishBread.count; i++) {
            breads[i].print();
        }
        System.out.println("===============");
        System.out.printf("붕어빵 객체 수:%d", FishBread.count );

        //Circle 객체 생성
        Circle c1 = new Circle(0,0,3);
        Circle c2 = new Circle(2,3,4);

        //넓이를 구하는 영역 Circle 클레스에 c1 연결 됨.
        double area1 =Circle.area(c1) ;
        double area2 = Circle.area(c2);

        System.out.printf("%s => 넓이: %.2f\n", c1.toStr(), area1);
        System.out.printf("%s => 넓이: %.2f\n", c2.toStr(), area2);

    }
}


class Emplyoee {
    String name;
    int[] hours ;

    Emplyoee (String a, int[] h){
        name = a;
        hours = h;
    }

    void printTotalHours(){
        System.out.printf("%s -> %d 시간\n", name, totalHours());
    }

    int totalHours(){ //요일별 일한 시간을 갖고 있는 배열을 모두 더해서 반환
        int sum =0;
        for (int i=0; i<hours.length; i++){
            sum += hours[i];
        }
        return sum;
    }
}

class Player{
    String name;
    int [] score;

    Player (String a, int [] s){
        name=a;
        score=s;
    }

    void PrintTotalScore(){
        System.out.printf("?? -> ??\n", name , TotalScore());
    }

    int TotalScore() {
        int sum = 0;
        for (int i = 0; i < score.length; i++) {
            sum += score[i];
        }
        return sum;
    }
}

class Team{ // 하나의 Teamclass 생성이 되고 그 안에 객체들이 하나씩 생성
    String nation;
    Player2[] player2s;

    Team (String t, Player2[] arr){
        nation =t;
        player2s =arr;
    }

    void printTeamPoints(){
        int sum =0 ;
        for (int i=0; i<player2s.length; i++){
            sum += player2s[i].totalPotin();
        }
        System.out.printf("%s -> %d points\n" , nation , sum);
    }
}
class Player2{
    String name;
    int[] point;

    Player2(String n, int[] p){
        name = n;
        point = p;
    }

    int totalPotin() {
        int sum =0;
        for (int i =0; i<point.length; i++){
            sum += point[i];
        }
        return sum;
    }
}

class Galaxy{
    String serialnum;
   static int count =0; // static을 사용하면 객체 안에 있는 것이 아닌 클레스 여영으로 count 변수 이동

    Galaxy(){ // new galaxy에서 옴
        count ++; // count = galaxy field, field가 인스턴스 변수 따라서 어떤 객체 내부에 count를 갖고 있는 것
        char C = randomAlphabet();
        serialnum = String.format("%c-%d" ,C ,count);
    }

    char randomAlphabet(){
        return (char) ('A' + Math.random() * 26); //A to Z
    }
    void print() {
        System.out.printf("Galaxy { serialNum: %s }\n", serialnum);
    }
}

class FishBread{
    String name;
    static int count = 0 ;

    public FishBread(int n){ //n의 값에 따라서 name으로 들어가게 됨
        String[] arrr ={"팥", "고구마", "치즈", "슈크림"};
        name = arrr[n];

        FishBread.count++;
    }

    void print(){
        System.out.printf("[%s] 붕어빵\n", name);
    }
}

class Circle{
    int x;
    int y;
    int z;

    Circle(int centerX, int centerY, int centerZ){ //생성자로 정의
        x=centerX;
        y=centerY;
        z=centerZ;
    }

    String toStr(){
        return String.format("Circle { 중심: (%d, %d), 반지름: %d }", x, y, z);
    }

    static double area(Circle c){
        return Math.PI* c.z * c.z;
    }
}
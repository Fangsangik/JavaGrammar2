/*
객체-Object
지향-Oriented
프로그래밍-Programming

Oop를 사용 하는 이유
1. 관리가 편함
2. 객체를 재사용 할 수 있다.
3. 프로그램 확징이 편리

프로그램은 객체를 조합해서 만든다
객체는 class를 통해 만든다
class는 객체를 만들기 위한 설계도
class를 통해 객체를 만드는 과정 => instance화

class 만들기
field & Method
field - 상태
Method - 동작

ex)
class - cat
fields - name,breeds,weight
methods - claw, meow

method에는 public static X

클래스 구현하기
1. 설계(class + fields + methods)

class Cat // 클래스
String name;
String breeds
double weight;
                // fields
void claw();
sout("할퀴기");
void meow();
sout("울기);
                // methods

객체 생성과 필드 값 변경
클래스 다이어그램을 통해 코드를 완성 후 객체를 만들 수 있다
Dog(개) 클래스 예
class Dog {
     필드 영역
    String name;   // 이름
    double weight; // 무게
      메소드 영역
    void bark() {
        System.out.println("멍멍!");
    }
}

객체를 만들때는 new라는 키워드에 클래스 이름을 적음
new Dog();

객체 생성 후 변수화
객체를 다시 사용하기 위해 이를 변수화 함
객체를 만든 것을 대입한다 type에 대한 변수
Dog dog1 = new Dog(); => Dog라는 객체가 생성이 되고 객체를 다시 사용 하기 위해 이름을 붙여준다
                         Dog type에 dog1이라는 이름을 붙여주면 객체에 접근할때 dog1이라는 변수를 통해 해당 객체로 접근 가능
일반 변수
int score = 86;

생성된 객체는 연경된 변수와 "."연산자를 통해 접근이 가능
dog1.name = "멍멍이"
dog1.weight = 4.27;

System.out.printf("이름: %s\n", dog1.name);
System.out.printf("무게: %.2fkg\n", dog1.weight);

하나에 설계된 클래스에 여러개 객체 생성 할 수 있다.
Bicycle 클래스에 두 객체를 생성
Bicycle b1 = new Bicycle();
Bicycle b2 = new Bicycle();

인스턴스 메소드 호출
클래스를 통해 생성된 객체 = 인스턴스
인스턴스 메소드는 meow
Cat cat1 = new Cat();
cat1.meow();

클래스 스코프
필드의 활동 영역은 클래스의 전체
메소드 호출 시 필드를 사용 할 수 있음

class Dog{
String name;
int age;
        //fields
void bark
        // 메소드

sout(name+"의 멍멍") => name이라는 변수는 필드에서 가져온 변서

필드의 활동영역은 전체이기에 어디서든 활용 가능하다
이렇게 변수가 활동하는 영역은 스코프라고 한다.

파라미터와 지역변수의 경우, 메소드 스코프를 갖음.
다시말해 이들의 해당 메소드는 내부로 제한.
지역변수란 메소드 내부에 선언된 변수

class DrinkMachine{
String output;
                //fields의 경우 클래스 스코프
void pushButton (int num){ // 파라미터 num o => 이 변수는 해당 변수 내에서만 활동 가능
String[] drinks(지역변수 = 메소드 내부 선언된 변수)  = {"콜라", "사이다", "맥주"};
output = drinks[num];
                    // 파라미터와 지역변수는 메소드 스코프
void printOutput(){
sout(output);
}
 */
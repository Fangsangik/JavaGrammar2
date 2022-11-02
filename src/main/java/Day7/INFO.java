/*
interface
일종의 역할 - 각 역할을 세분화

interface Aram{
public void beep();
public void playMusic();
=> 프로토타입을 묶어서 하나의 인터페이스로 나타냄

implements
class SmartPhone implements Alarm{
프로토타입 메소드를 오버라이딩
}

프로토타입 메소드는 내용이 없는 껍대기

인터페이스를 사용 이유
1. 프로그램 설계의 명확성
2. 서로다른 객체에게 연관 관계를 구현 가능 => upcasting 가능 (자식객체를 부모 객체에게 구현)

인터페이스는 일종의 역할로서 프로토타입 메소드로 구성
프로토타입 메소드는 추상 메소드
인터페이스는 클래스로 부터 구현

경보음을 위한 Alarm이라는 역할은 아래와 같이 만들 수 있습니다.

interface Alarm {
  // 내용 생략..
}

동작을 만들어 주어야 한다.
프로토타입 메소드란, 중괄호 내용이 없는 껍대기 메소드(=추상 메소드)

interface Alarm {
  // 비프음을 냈으면 좋겠어? 어떻게? 그건 나중에 정할께!
  public void beep();
  // 음악을 재생했으면 좋겠어! 어떻게? 그건 나중에 정할께!
  public void playMusic();
}

// SmartPhone 클래스는 Alarm 인터페이스를 구현하기로 한다!
class SmartPhone implements Alarm { //스마트폰 클레스는 알람이라는 역할을 받음
  내용 생략..

// 오버라이딩
class SmartPhone implements Alarm {
  // beep음은 이렇게 낼거야!
  public void beep() {
    System.out.println("삐빅~ 삐비비비빅!");
  }
  // 음악 재생은 이렇게 할거야!
  public void playMusic() {
    System.out.println("동해물과 백두산이~🎶");
  }
}

인터페이스는 특정 역할에 대한 대략적 정의
// 힐러 역할
interface Healer {
  public void healing(); // 체력 회복
  public void shield();  // 보호막 생성
  => 추상 메소드
}

해당 인터페이스를 특정 클래스에 부여
implements
// 마법사 클래스에게 Healer 인터페이스를 부여
class Wizard implements Healer { ... }

부연하기로 했다면 중괄호 메스드에 재정의 해주어야 한다.
class Wizard implements Healer {
  // 메소드 오버라이딩(재정의)
  public void healing() {
    System.out.println("체력을 회복시킵니다!");
  }
  // 메소드 오버라이딩(재정의)
  public void shield() {
    System.out.println("보호막을 생성합니다!");
  }
}

인터페이스와 다형성 문제
하나의 클래스가 여러 인터페이스를 구현 가능
폰<=스마트폰 => 알람

class SmartPhone implements Alarm, Phone, Messenger {
  // 내부 생략..
}
또한 스마트폰 객체는 upCasting 될 수 있다.

// 스마트폰 객체 생성
SmartPhone sp = new SmartPhone();
// 스마트폰을 다양하게 해석(업캐스팅 - 상위 타입으로 해석)
Alarm a = sp; // 스마트폰은 알람이다. (O)
Phone p = sp; // 스마트폰은 전화기이다. (O)
Messenger m = sp; // 스마트폰은 메신저이다 (O)

따라서 다양한 타입으로 해석되는 것을 다형성이라고 함

하나의 크래스가 여러개 인터페이스 구현

interface AAA {
  public void aaa();
}
interface BBB {
  public void bbb();
}
interface CCC {
  public void ccc();
}
// Foo 클래스는 총 3가지 역할(AAA, BBB, CCC)을 수행!
class Foo implements AAA, BBB, CCC {
  ...
}

// 객체 생성
Foo obj = new Foo();
// 인터페이스 타입으로 업캐스팅(해석)
AAA a = obj;
BBB b = obj;
CCC c = obj;

인터페이스별 메소드 수행이 가능

인터페이스 & 업케스팅
업 케스팅이란 자식객체를 부모클래스로 해석
Cat cat = new Cat();
Aminal a =Cat;

마찬가지로 인터페이스를 구현하는 객체는 인터페이스 타입으로 업케스팅 할 수 있음
Bird bird = new Bird();
Flyable f0 = bird;

업케스팅을 사용하면 그룹화가 가능함

// 다양한 객체 생성
Bird bird = new Bird();
Helicopter copter = new Helicopter();
Rocket rocket = new Rocket();
// 인터페이스 타입으로 그룹화
Flyable[] flyableThings = { bird, copter, rocket };

인터페이스와 ArrayList
하위의 객체들을 상위의 인터페이스 타입으로 ArrayList 가능

// Flyable 타입을 저장할 ArrayList 생성
ArrayList<Flyable> list = new ArrayList<Flyable>();
// 인터페이스를 통한 다양한 하위 객체들을 저장
Flyable b = new Bird();
Flyable h = new Helicopter();
Flyable r = new Rocket();
list.add(b);
list.add(h);
list.add(r);
 */
/*
상속
기존 클래스를 확장하는 개념
기존 클래스의 개념을 물려받는 개념

class Novice {
private String name;
private int hp;

public void punch();
sout("펀치");
    }
}

class Wizard extends Novice{ // extends을 통해서 Novice 클래스를 상속을 받게 됨

public void fireball(){
sout
}

상속의 장점
-코드 중복 제거, 프로그램 확장

상속은 기존 클래스를 확장하여 새로운 클래스를 만든느 것
extends 키워드를 사용하고, 확장된 클래스는 기존 클래스의 모든 속성을 물려 받음

// 기존 클래스
class A{}

// 확장된 새로운 클래스 (A를 토대로 확장 해서 B를 만드는 것)
class B extends A
즉 A가 가지고 있는 필드랑 메소드를 갖게 되는 것이다.

class B {
String name;

public void pedal() {
sout
}
}

class M extends B{
int battery

public void motor() {
sout
}
}

M mb = new M();
mb.name;
mb,battery

mb.pedal();
mb.motor

B가 갖고 있는 속성을 M이 그대로 가져가 활용 가능하고 새로운 객체 생성이 가능 하다.


서로다른 두 클래스에 중복 속성을 상속을 통해 제거 가능

아래는 중복 코드가 존재하는 두 클래스(Product, Pants)의 예입니다.

// 상품 클래스
class Product {
  String name; // 이름
  int price;   // 가격
  // 가격 출력
  void printPrice() {
    System.out.printf("%d원 입니다.\n", price); -- 중복
  }
}
// 바지 클래스
class Pants {
  String name;     // 이름
  int price;       // 가격
  ---------------------------- 중복
  int waistSize;   // 허리둘레
  // 가격 출력
  void printPrice() {
    System.out.printf("%d원 입니다.\n", price); --- 중복
  }
  // 허리둘레 출력
  void printWaistSize() {
    System.out.printf("허리둘레: %d인치\n", waistSize);
  }
}

중복 되는 속성을 지워주고 extends Product를 하면 된다

위의 클래스를 상속을 통해 새롭게 정의하면 다음과 같습니다. 먼저 근간이 되는 상품 클래스를 그대로 둡니다.

// 상품 클래스
class Product {
  String name; // 이름
  int price;   // 가격
  // 가격 출력
  void printPrice() {
    System.out.printf("%d원 입니다.\n", price);
  }
}

상속을 통해 제거
// 바지 클래스
class Pants extends Product {
  int waistSize;   // 허리둘레
  // 허리둘레 출력
  void printWaistSize() {
    System.out.printf("허리둘레: %d인치\n", waistSize);
  }
}

자식 클래스와 부모 클래스
// 부모 클래스
class Parent { ... }
// 자식 클래스 - 부모 클래스로부터 파생
class Child extends Parent { ... }

업케스팅과 오버라이딩

업케스팅
자식 객체를 부모의 타입으로 해석 하는 것

class Animal { ... }
class Cat extends Animal { ... }
class Dog extends Animal { ... }
class Horse extends Animal { ... }

Cat의 인스턴스(객체)는 Animal로 해석 될 수있음

// 고양이 객체 생성
Cat c = new Cat();
// 고양이는 동물이다(O)
Animal a = c; // 고양이 객체를 동물로 해석

고양이 객체이면서 Animal 객체로 해석
cat은 Animal의 자식 객체이기 때문

주의
역으로는 해석이 불가능 하다.

업케스팅을 하는 이유는
다양한 객체들을 부모의 타입으로 관리 할 수 있게 함

Animal c = new Cat();   // 고양이는 동물이다
Animal d = new Dog();   // 개는 동물이다
Animal h = new Horse(); // 말은 동물이다
// 동물 배열 - 고양이, 개, 말
Animal[] animals = { c, d, h };

오버라이딩
부모의 메소드를 자식 클래스에서 새롭게 재정의 하는 것

class Wizard {
  public void fireball() {
    System.out.println("10 데미지를 줍니다");
  }
}

이때 사용하는 개념이 메소드 오버라이딩입니다.
아래의 GreateWizard 클래스는 부모 Wizard의 fireball() 메소드를 새롭게 재정의합니다.

class GreatWizard extends Wizard {
  // 메소드 오버라이딩(재정의)
  public void fireball() {
    System.out.println("30 데미지를 줍니다");
  }
}

Wizard w = new Wizard();
w.fireball(); // 10 데미지를 줍니다
GreatWizard gw = new GreatWizard();
gw.fireball(); // 30 데미지를 줍니다

Protected 접근제한자
protected는 상속 관계의 클레스까지 접근을 허용함

class A {
  protected String name;
}
class B extends A {
  public void printName() {
    // 부모클래스 A의 필드 name을 출력
    System.out.println(name);
  }
}

if private일 경우 name 값을 가져다가 쓸 수 없음

Super - 상속과 생성자
자식 객체를 생성하면서 동시에 초기화 하려먼 먼저 부모의 생성자가 호출 되어야 함

// 생성자 호출 영역
Wizard w = new Wizard("프로도", 100, 80);

// 생성자 정의 영역
class Novice {
  protected String name;
  protected int hp;
  public Novice(String name, int hp) {
    this.name = name;
    this.hp = hp;
  }
}

class Wizard extends Novice {
  protected int mp
  public Wizard(String name, int hp, int mp) {
    super(name, hp); // 부모 클래스 생성자 호출 => Novice 생성자를 호출 하게 되는 것
    this.mp = mp;
  }
}

Wizard 객체는 Novice 객체 안에 존재 한다
부모 객체 + 자식 객체 => Wizard 형성


 */
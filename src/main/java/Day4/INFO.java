/*
접근제한자
외부 접근을 허용할지 말지 결정하는 것
프로그램을 외부로 부터 보호해야하 할때
private - 비공개
default - 패키지 내부 공개
protected - 상속 공개
public - 완전 공개
공개 범위 결정

은행 system => 고객 정보 관리
계좌 번호 = open
통장 내역 = 비공개

private으로 감춰진 것들은 접근 할 수 없지만 => Getter와 Setter를 통해 우회해서 접근 가능
getter method => private 필드를 반환 (get)
setter method => private 필드를 변경

접근제한자가 없다면 객체의 정보를 외부로 부터 보호X, 데이터 함부로 변경 될 수 있다
이러한 문제를 예방하기 위해서는 적절한 접근 제한자 필요
필드와 메소드에 적용 가능

class AAA {
private String aaa;   // 비공개
        int bbb;              // 디폴트 공개
protected double ccc; // 상속 공개
public boolean ddd;   // 완전 공개

private void eee() {}     // 비공개
        int fff() {}              // 디폴트 공개
protected double ggg() {} // 상속 공개
public boolean hhh() {}   // 비공개
        }

private 키워드는 외부 접근을 차단

class Account {
  public int number;       // 완전 공개 필드
  private String password; // 비공개 필드
  private int balance;     // 비공개 필드
  // 비공개 메소드 - 외부 호출 불가
  private void somthing() {}
}

감춰진 필드 가져오기
private은 외부 접근을 허용 하지 않음
getter와 setter라는 값으로 우회 하여 가져옴

getter는 private field를 위회적 접근

class SmartPhone {
  // private 필드 - 외부 접근 불가
  private int number;
  // 게터 메소드 - number를 우회하여 반환
  public int getNumber() {
    return number;
  }
}

게터의 메소드
private 필드를 반환
public
메소드명은 get + 필드명

세터
세터(setter)는, private 필드를 우회적으로 변경(write)합니다.

class SmartPhone {
  // private 필드
  private int number;
  // 세터 메소드
  public void setNumber(int n) { // 외부 접근을 위함 & 파라미터가 존재해야 하고, 대입
    number = n;
  }
}

세터 메소드
private 필드를 변경한다.
public 이다.
메소드명은 반환하려는 private 필드명 앞쪽에 set을 붙인다.

Scope & this
스코프란 변수의 활동 영역이다
스코프는 두 종류로
메소드 스코프 => 메소드 내부에서 활동 (파라미터 , 지역변수)
클래스 스코프 => 클래스 전역에서 활동 (필드)

스코프 관련하여 주의할 점은, 변수의 이름이 같은 경우입니다.

class Whatever {
  public void cool(int score) {
    String result = "";
    ...
  }
  public void great(int score) {
    String result = "";
    ...
  }
}
// 파라미터 score & 지역변수 result 중복이 되어 있지만 다른 개념
왜냐하면 이 둘의 메소드가 서로 다르기 때문이다.

scope & this
클레스의 필드와 메소드의 파라미터가 같은경우 문제 발생

// 호출 영역
Cookie c = new Cookie("버터링", 1500);
// 정의 영역
class Cookie {
  private String name;
  private int price;

  public Cookie(String name, int price) {
    name = name; // 인스턴스 변수 name 초기화(X)
    price = price; // 인스턴스 변수 price 초기화(X)
  }
}

생상자 호출이 일어날때 메소드 스코프가 잡힘
객체에 존재하는 것과 생성자에 존재하는 것은 엄현히 다름
필드와 파라미터 이름이 같은경우 발생 => this 키워드를 사용하면서 해결 할 수 있음
this 키워드는 메소드의 수행 주체 객체를 나타내기 때문

// 호출 영역
Cookie c = new Cookie("버터링", 1500);
c.setPrice(2000);
// 정의 영역
class Cookie {
  private String name;
  private int price;
// 생성자
public Cookie(String name, int price) {
this.name = name;   // this.name -> 인스턴스 변수
this.price = price; // this.price -> 인스턴스 변수
  }
// 세터
 public void setName(String name) {
 this.name = name; // this.name -> 인스턴스 변수
  }
}

생성자 수행의 주체의 객체가 되기 때문이다.
1. 쿠키 객체를 만듬 => name, price
2. 생성자 => name, price
this.name, this.price => this = 주체가 됨 / name & price = 객체가 된다

 */
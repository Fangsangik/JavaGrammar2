/*
레퍼런스
자바 타입의 큰 범주 => 카테고리
자바에서 변수의 타입

1) 레퍼런스형
= 클레스 타입, 사용자 정의형 타입 : 이는 객체를 변수에 연결 하기 위해 사용

Marine {클레스 타입(레퍼런스 타입)} marine(레퍼런스 변수) = new Marine ("레이너", 80)

레퍼런스 변수는 객체를 간접적으로 나타내는 형태
레퍼런스 변수는 대문ㄴ자로 시작

2)기본형
기본 변수는 객체가 아닌 값을 직접 갖음
기본 변수는 소문자로 시작

Static
공유의 개념이 담긴 키워드

1) class 변수 (static field) => 객체 밖에 존재
2) instance 변수 (non-static field) => 객체 내부에 존재

Student => (id name), (id name), (id name)
count =3

class Student{ //클레스 공유 변수
static int count = 0; // 인스턴스 변수
int id;
String name;
}

1) Class method = static method
클레스가 동작시키는 메소드
간편 기능 구현에 유용
Math.random();

2)인스턴스 메소드 = non-static method
주 객체가 동작하는 메소드
특정 객체의 동작 구현시 유리

레퍼런스 변수란 객체를 가르키는 변수

아래의 변수 e0는 레퍼런스 변수이며, 그 타입은 Employee 입니다.
따라서 e0는 Employee 객체를 가리킬 수 있습니다.

int[] hours = { 2, 4, 3, 4, 5, 8, 8 };
Employee e0(e0의 타입은 Employee) = new Employee("직원", hours);

객체 조합하기
한 객체 내부에 또 다른 객체 존재 가능

// 팀
class Team { // 팀이라는 객체 내부에
  String nation; // 국가
  Player[] players; // 선수들(객체 배열) Player 라는 클레스에 배열을 설정
}

클레스 변수 vs 인스턴스 변수
클레스 변수 - static 키워드가 필드에 적용된것, 객체 밖 & 클레스에 존재 따라서 다양한 객체에서 공유 가능
인스턴스 변수 - non static필드 , 즉 , static이 없는 일반벅인 필트는 인스턴스, 객체 내부

class Student {
  // 클래스 변수(static 필드)
  static int count = 0;
  // 인스턴스 변수(non-static 필드)
  int stdNum;
  String name;
}

클래스 변수의 사용은, 아래와 같이 클래스 이름을 통해 접근 가능합니다.

System.out.printf("총 학생 수: ");
System.out.printf("%d\n", Student.count);

클레스 메소드는 static이 적용된 메소드 / 타입 앞에 static이 없으면 인스턴스 메소드

// 클래스 메소드(static 메소드)
static void callClassMethod() {
  System.out.println("스태틱 메소드 호출!");
}
// 인스턴스 메소드(non-static 메소드)
void callInstanceMethod() {
  System.out.println("인스턴스 메소드 호출!");
}

두 메소드의 차이는 "주체 객체가 있는가"의 여부
클레스 메소드의 경우, 주체객체 없이 클레스명으로 호출
//Math 클레스 메소드 random
double rand = Math.random(); // 객체 생성 없이 클레스 이름에 random 호출

스턴스 메소드는 먼저 주체 객체를 생성해야만 하고, 이를 통해 메소드 호출이 이루어집니다.
// 주체 객체 생성
Hero h1 = new Hero("닥터 스트레인지", 80);
// 주체 객체를 통한 인스턴스 메소드 호출
h1.teleport();
 */
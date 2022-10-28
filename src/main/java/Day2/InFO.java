/*
생성자
클래스로 부터 객체를 만드는 특별한 메소드
클래스를 통해 객체를 만들기 위해서는 생성자를 호출해야 한다
Cat cat1 = new Cat{생성자}()
생성자는 클래스로 부터 객체를 만들어 냄
생성자는 field를 초기화 함
생성자를 초기화 하면 코드를 줄일 수 있다
Cat cat1 = new Cat("네로" , 3.77, 3);

생성자 사용법
호출 ================ 정의
호출시 앞부분에 new => 클래스 - 타입 변수명 = new 클래스 - 이름 (전달값);

정의(리턴 타입 없음)
클래스 -이름(파라미터) {
~
}

생성자 호출
클래스 타입 변수명 = new 클래스 이름 (전달값);
Bicycle b = new Bicycle("부릉2", 21.74, 899000); => 자전거 객체 생성 & 동시에 초기화
new Bicycle = > 객체 생성 및 초기화
Bicycle b => 만들어진 객체에 연결 & 수행

String.format 메소드
형식 문자열을 만들어 주는 메소드 = printf() 메소드와 유사
하지만 출력은 하지 않고 문자열만 출력

String name = "피자맛";
int price = 1200;
String str = String.format("Goroke { %s, %d원 }", name, price); => Goroke { %s, %d원 } = 형식 문자열 &
                                                                   name과 price를 삽입하여 하니의 문자열을 만들어 주는 것
printf vs String.format => 출력의 유무
System.out.println(str);
// => "Goroke { 피자맛, 1200원 }"

생성자 정의하기
생성자를 정의하면 객체 생성 뿐만 아닌 동시에 초기화 까지 가능하다
초기화란 객체의 초기상태를 설정

Cola c1 =new Cola("코크" , 2000);


class Cola {
  String name;
  int price;
  // 생성자: 이름과 가격을 입력 받아 객체를 초기화
  Cola(String n, int p) { // "코크" , 2000 전달 됨
    name = n;
    price = p;
  }
}

사라진 디폴트 생성자
생성자가 없는 클래스의 경우 객체를 만들 수 있다.
디폴트 생성자를 형성할 경우

class Hero { // 생성자가 없지만 자동으로 만들어준다
  String name;
  int hp;
  }

  // 디폴트 생성자
  // - 파라미터 및 중괄호 내부 없음
  // - 생성자가 없는 경우, 자동 기입 됨
  Hero() { }
}

객체배열 만들기
객체 또한 배열에 담길 수 있다

Book naruto = new Book("나루토");
Book onepiece = new Book("원피스");
Book slamdunk = new Book("슬램덩크");
Book[] comics = { naruto, onepiece, slamdunk }; => 앞에서 만든 요소들을 각각 넣어준다.

파라미터로 객체 전달
객체 또한 메소드의 파라미터로 전달 가능

class Hero {
  String name;
  int hp;
  Hero(String n, int h) {
    name = n;
    hp = h;
  }
  void punch(Hero enemy) { // 전달 값으로 히어로 객체를 받을 수 있다. & enemy의 대한 객체는 아이언맨 => 캡틴 / 캡틴 => 아이언맨
    // 내용 생략
  }
}

객체를 파라미터로 전달
위 punch() 메소드는 아래와 같이 호출할 수 있습니다.

// 객체 생성
Hero ironMan = new Hero("아이언 맨", 30);
Hero captain = new Hero("캡틴 아메리카", 30);
// 아이언 맨의 펀치 -> 캡틴 아메리카 //아이언맨 객체가 주체가 되어서 펀치 메소드를 수행해서 입력 값으로 캡틴 아메리카 객체를 던지고 있다.
ironMan.punch(captain);
// 캡틴 아메리카의 펀치 -> 아이언맨
captain.punch(ironMan);
 */
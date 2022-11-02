/*
API
프로그래밍을 위해 만들어진 도구들
상황별로 여러 클래스들이 존재 = JAVA API
JAVA API는 페키지 형태로 구성
package는 class를 구분 함

ex)
Math - 수학관련 기능들이 구성
import java.lang.(페키지)Math(클래스)
Random - 난수 생성을 위한 클래스
ArrayList - 객체를 담는 보관함
객체를 저장하고 삭제하는 것
ArrayList<String> names = new ArrayList<String>();
name.add("");
sout(name.get());
name.remove();
sout(name.size());

자바 API 가져오기
자바 API를 사용하기 위해서는 먼저 해당 클래스를 가져와야 함
이때 import 키워드를 사용

// java.util 패키지의 Random 클래스를 불러옴
import java.util.Random;

Random 클래스로 객체를 만들면, 다양한 난수 생성이 가능합니다.
Random random = new Random(); // 객체 생성

난수 생성
임의의 정수 및 실수 또는 참/거짓 값을 만들 수 있습니다.

// 0 이상 N 미만인 임의의 정수
int N = 10;
int randInt = random.nextInt(N); // 0, 1, 2, ..., 9 중 택 1 (N이라는 값을 집어 넣으면 0~N-1)

// 0.0 이상 1.0 미만의 임의의 실수
double randDouble = random.nextDouble();

// 임의의 참 또는 거짓
boolean randBoolean = random.nextBoolean();

객체 저장소 ArrayList
ArrayList는 객체를 담기 위한 클래스

// ArrayList 불러오기
import java.util.ArrayList;

ArrayList를 사용하기 위해서는 객체를 만들어야 하는데 저장할 객체의 타입을 <> 안에 적어 주어야 한다
이 기법을 generic 기법

// String 저장을 위한 객체 생성
ArrayList<String> names = new ArrayList<String>(); => String이 names라는 변수를 담음

ArrayList 객체가 만들어지면 객체를 추가하거나, 가져오늘 등의 동작을 할 수 있습니다.

// 객체 추가
names.add("Park");
names.add("Kim");
names.add("Paul");
=> 하나씩 칸에 이름이 채워진다고 생각하면 됨


// 객체 획득
System.out.println(names.get(0)); // Park
System.out.println(names.get(1)); // Kim
System.out.println(names.get(2)); // Pual
// 객체 수 반환
System.out.println(names.size()); // 3

ArrayList 객체를 담기위해서는 객체 타입(클래스 타입)을 명시

// Employee 객체를 담기 위한 ArrayList 생성
ArrayList<Employee> list = new ArrayList<Employee>(); => 꺾쇄 사이에 employee 타입을 담을 것이다

명시된 타입의 객체를 담는 add 메소드 사용

// Employee 객체 생성
Employee emp1 = new Employee();
Employee emp2 = new Employee();
Employee emp3 = new Employee();

// ArrayList에 담기
list.add(emp1); // list -> { emp1 }
list.add(emp2); // list -> { emp1, emp2 }
list.add(emp3); // list -> { emp1, emp2, emp3 }

인덱스 값을 변경할땐 set(int index, E element) 메소드를 사용

ArrayList 요소 변경하기
set(int index, E element) 메소드는 ArrayList에 담긴 객체를 변경함

ArrayList<String> names = new ArrayList<String>(); // names -> {}

names.add("Kim"); // names -> { "Kim" } => 0번째 index
names.add("Lee"); // names -> { "Kim", "Lee" } => 1번째 index
names.add("Choi"); // names -> { "Kim", "Lee", "Choi" } => 2번째 index

// 0번째 요소를 "Park"으로 변경: "Kim" => "Park"

names.set(0, "Park"); // names -> { "Park", "Lee", "Choi" }

ArrayList 무작위로 사용
Collections 클래스에 shuffle() 이라는 메소드를 활용

// 불러오기
import java.util.Collections;
// 리스트 섞기
ArrayList<Integer> list = new ArrayList<Integer>();
list.add(1);
list.add(2);
list.add(3);
list.add(4);
Collections.shuffle(list)

배열 간편 출력하기

// 불러오기
import java.util.Arrays;
// 배열의 문자열화
int[] arr = { 1, 2, 3, 4 };
String result = Arrays.toString(arr); // "[1, 2, 3, 4]"
 */
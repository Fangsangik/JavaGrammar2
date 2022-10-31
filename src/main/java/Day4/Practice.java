package Day4;
/*
주어진 코드는 Account와 Hacker 클래스로 동작한다. 초기 계좌에는 백만원(1,000,000원)이 입력되어있는데,
이를 0원으로 변경하려 한다.

출력 예와 같은 결과를 얻도록, Hacker 클래스의 malcious() 메소드를 완성하시오.

출력 예
Account { balance: 1000000 }
Account { balance: 0 }

2.
주어진 코드는 Theif 와 Wallet 클래스로 구성되어있다.

지갑속 삼만원이 분실되지 않도록 Wallet 객체의 필드를 보호하여, 출력 예와 같은 결과를 얻으시오.

출력 예
error: money has private access in Wallet
    target.money = 0;
          ^
1 error

3.
주어진 코드는 Person 객체의 이름과 연락처를 출력하려한다. 하지만 아래와 같은 에러가 발생하고 있다.

PersonTest.java:7: error: name has private access in Person
    System.out.printf("이 름: %s\n", park.name);
                                       ^
PersonTest.java:8: error: phoneNumber has private access in Person
    System.out.printf("연락처: %s\n", park.phoneNumber);
                                       ^
2 errors
출력 예와 같은 결과를 얻도록, 프로그램을 완성하시오.

출력 예
이 름: 홍팍
연락처: 010-1234-5678

3.
주어진 코드는 생성된 Lock 객체의 비밀번호를 변경하는 코드이다.
하지만 아래와 같은 에러가 발생한다.

LockTest.java:7: error: password has private access in Lock
    lock.password = "654#@!";
        ^
1 error
세터(setter)를 활용하여 출력 예와 같은 결과를 얻으시오.

출력 예
Lock { password: 654#@! }

4.
주어진 코드를 실행하고, 그 결과를 분석하시오.

출력 예
score = 88 in main()
score = 78 in foo()
score = 88 in main()

5.
주어진 코드로 커피 객체를 생성하고, 또 그 가격을 인상하려 한다.
해당 코드 문제를 찾아 수정하여, 출력 예와 같은 결과 얻으시오.

출력 예
커피값 인상 전 => Coffee { name: 아메리카노, price: 1500 }
커피값 인상 후 => Coffee { name: 아메리카노, price: 1800 }
 */
public class Practice {
    public static void main(String[] args){
        Account myAccount = new Account(1000000);
        System.out.println(myAccount.toString());

        Hacker.malcious(myAccount);

        System.out.println(myAccount.toString());

        Wallet wallet = new Wallet(30000);
        System.out.println(wallet.toString());

        Theif.steal(wallet);

        System.out.println("->" + wallet.toString());

        Person person = new Person("상익", "01012345678");

        System.out.printf("이 름: %s\n", person.getName());
        System.out.printf("연락처: %s\n", person.getNumber());

        Lock lock = new Lock("8888");

        lock.setPassWord("1234");

        System.out.println(lock.toString());

        int score = 88;
        System.out.printf("score = %d in main()\n", score);

        Record.foo(score); // => public static void foo(int score){ 던짐


        System.out.printf("score = %d in main()\n", score); // 같은 메인 메소드에서 값을 찾기 때문에 88이 출력이 된다.

        Coffee coffee = new Coffee("아메리카노" , 1000);
        System.out.printf("커피값 인상 전 => %s\n", coffee.toStr());

        coffee.setPrice(1800);
        System.out.printf("커피값 인상 후 => %s\n", coffee.toStr());
    }
}

class Account{
    int balance;

    public Account (int balance){
        this.balance =balance;
    }

    public String toString(){
        return String.format("Account { balance:%d}", balance);
    }
}

class Hacker{
    public static void malcious(Account account) {
        account.balance = 0;
    }

}
class Wallet {
    //money field는 외부에 있는 클레스 접근 불가능
    //private
    int money;

    public Wallet(int i){
        money = i;
    }

    public String toString(){
        return String.format("Wallet {money :%d}" ,money);
    }
}

class Theif{
    public static void steal(Wallet target){
        target.money = 0;
    }
}

class Person{
    private String name;
    private String number;

    public Person(String n, String nm){
        name = n;
        number = nm;
    }

    public String getName(){
        return name;
    }

    public String getNumber(){
        return number;
    }
}

class Lock{
    private String passWord;

    public Lock(String pw){
        passWord = pw;
    }

    public String toString(){
        return String.format("Lock { password: %s }", passWord);
    }

    public String getPassWord(){
        return passWord;
    }

    public void setPassWord(String pw){
        this.passWord=pw;
    }
}

class Record{
    public static void foo(int score){ // 위의 score와 다르지만 값은 같은 것이다.
        score -= 10;
        System.out.printf("score = %d in foo()\n", score); // class Record의 score
    }
}

class Coffee {
    private String name;
    private int price;

    public Coffee(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String toStr(){
        return String.format("Coffee { name: %s, price: %d }", name, price);
    }


    public void setPrice(int price) {
        this.price = price;
    }
}


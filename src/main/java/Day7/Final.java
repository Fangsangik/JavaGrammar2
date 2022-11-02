package Day7;

import java.util.ArrayList;

/*
개는 “멍멍!”, 아기는 “응애!”, 호랑이는 “어흥!”, 로보트는 “삐빕!” 각자 다른 소리를 내는 객체들이 있다. 이를 도식화 하면 아래와 같다.
Sounding 인터페이스를 구현하는 Dog, Baby, Tiger, Robot 클래스를 작성하고, 메소드 오버라이딩을 통해 출력 예와 같은 결과를 만드시오.

출력 예
Dog: 멍멍!
Baby: 응애!
Tiger: 어흥!
Robot: 삐빕!
 */
public class Final {
    public static void main (String [] args){
        Sounding sounding = new Dog();
        Sounding sounding1 = new Robot();
        Sounding sounding2 = new Tiger();

        ArrayList<Sounding> list = new ArrayList<Sounding>();
        list.add(sounding);
        list.add(sounding1);
        list.add(sounding2);

        //Sounding[] arr = {sounding, sounding1, sounding2};

        for (int i=0; i< list.size(); i++){
            list.get(i).Sound();
        }
    }
}

interface Sounding{
    public void Sound();
}

class Dog implements Sounding{
    public void Sound(){
        System.out.println("멍멍");
    }
}

class Robot implements Sounding{
    public void Sound(){
        System.out.println("응애");
    }
}

class Tiger implements Sounding{
    public void Sound(){
        System.out.println("어흥");
    }
}
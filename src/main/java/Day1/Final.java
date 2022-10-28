package Day1;
/*
정사각형 클래스를 구현하려 한다.
이는 한 변의 길이를 가지며, 그 넓이를 반환할 수 있다.
class name = Square
fields = length
methods = area
위 클래스다이어그램을 참고하여 이를 만들고, 해당 객체를 활용하여 출력 예와 같은 결과를 얻으시오.

출력 예
한 변의 길이가 4인 정사각형의 넓이: 16
 */
public class Final {
    public static void main (String [] args){
        Square s = new Square();
        s.length=4;
        System.out.printf ("한변의 길이가 %d인 정사각형 넓이: %d" , s.length, s.area());
    }
}

class Square{
    int length;

    int area(){
        return length*length;
    }
}


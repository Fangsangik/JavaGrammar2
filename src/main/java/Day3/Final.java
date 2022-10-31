package Day3;

/*
주어진 코드로 이차원 평면상의 두 점 A(0, 0)와 B(3, 4)의 거리를 구하려 한다
출력 예와 같은 결과를 얻도록, Point의 클래스를 완성하시오.

출력 예
두 점 A(0, 0), B(3, 4) 사이의 거리: 5.00
힌트
피타고라스의 정의
피타고라스의 정의를 통해, 두 점 P1(x1, y1), P2(x2, y2)의 거리를 구할 수 있습니다.

distance : 두 점 P1, P2 사이의 거리
𝜟𝒙 : x축 변화량(x1 - x2)
𝜟𝒚 : y축 변화량(y1 - y2)
Math.sqrt(double) 메소드
Math.sqrt() 메소드는 입력 값의 제곱근을 반환합니다.

double result = Math.sqrt(9); // 3.0
 */
public class Final {
    public static void main(String[] args) {
        Point p1 = new Point(0,0);
        Point p2 = new Point(3,4);

        double dist = Point.distance(p1, p2);

        System.out.printf("두 점 A%s, B%s 사이의 거리: %.2f", p1. str(), p2.str(), dist);
    }
}

class Point {
    int x;
    int y;

    Point(int _x, int _y) {
        x = _x;
        y = _y;
    }

    String str(){
        return String.format("(%d,%d)",x ,y);
    }

    static double distance(Point p, Point q){
        double dX = p.x - q.x;
        double dY = p.x - q.y;
        return Math.sqrt((dX*dX) + (dY*dY));
    }
}

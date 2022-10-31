package Day4;
/*
아래의 시나리오를 토대로 기사 객체를 생성하고, 체력을 변경하려 한다. 출력 예와 같은 결과를 얻도록, 프로그램을 작성하시오.
class - Knight
private - name, hp
public - getHp(), setHp()

생성자 호출
name = 돈키호테 hp = 30 => name = 돈키호테 hp = 60


[객체 생성]
    Knight { name: 돈키호테, hp: 30 }
[체력 증가 +30]
    Knight { name: 돈키호테, hp: 60 }
 */
public class Final {
    public static void main(String[] args){
        Knight knight =new Knight("돈키호테" , 30);
        System.out.printf("[객체생성]");
        System.out.printf("%s\n" , knight.toString());

        knight.setHp(knight.getHp() +30);//해당 hp 값을 가져온 상태에서 setHp 해라
        System.out.printf("[체력증가 +30]");
        System.out.printf("%s\n" , knight.toString());


    }
}

class Knight {
    private String name;
    private int hp;

    public void setHp(int hp){
        this.hp =hp;
    }

    Knight(String name, int hp){
        this.name = name;
        this.hp = hp;
    }
    public String toString(){
        return String.format("Knight{name: %s, hp:%d}", this.name, this.hp);
    }

    public int getHp(){
        return hp;
    }

    }

package Day5;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/*
로또 번호(1 ~ 45) 중 임의의 6가지 수를 생성하는 프로그램을 만드시오.

출력 예
매 실행 시, 번호는 바뀔 수 있음.

자동 생성 번호: [34, 14, 15, 31, 20, 37]
 */
public class Final {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i <= 45; i++) {
            list.add(i); //1~45
        }

        Collections.shuffle(list); // 섞고 싶은 애들 무작위로 섞는 것, list에 있는 수들이 섞이게 됨

        int[] picked = new int[6];
        for (int i = 0; i <= 6; i++) {
            picked[i] = list.get(i);
        }
        System.out.printf("자동생성 번호: %s", Arrays.toString(picked));//Arrays.toString => 배열을 문자열로 변형
    }
}



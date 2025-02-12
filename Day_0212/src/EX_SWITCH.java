/*
    제어문 - 조건문
    - case문: 정수, 문자1개, 문자열 3종류만 가능!!
 */

import java.util.Scanner;

public class EX_SWITCH {

    public static  void main(String[] args) {

        // 학점 출력
        Scanner input = new Scanner(System.in);
        System.out.print("점수 입력 [100 ~ 0]: ");

        int jumsu = input.nextInt();
        char score;

        input.close();

        // 스위치문 사용
        // 스위치는 비교를 할 수 없은
        // case:에는 정수, 문자1개, 문자열만 올 수 있음.
        // 점수의 몫을 이용하면 학점을 부여할 수 있음.
        // A: 9, 10     B: 8    C: 7    D: 6    E: 나머지
        switch (jumsu/10) {
            case 10:    // 10, 9는 중복. break가 없기때문에 아래를 따름.
                // score = 'A';
                // break;
            case 9:
                score = 'A';
                break;
            case 8:
                score = 'B';
                break;
            case 7:
                score = 'C';
                break;
            case 6:
                score = 'D';
                break;
            default:
                score = 'F';
                break;
        }

        System.out.printf("점수 %d점 의 학점은 %c 입니다 \n\n", jumsu, score);

    }
}

/*
    제어문 - while 반복문
 */

import java.util.Scanner;

public class EX_WHILE_01 {

    public static void main(String[] args) {

        // 키보드로 숫자를 입력 받은 후 평균, 합계 출력
        // 단, 0 입력 시 입력 받기 종료

        Scanner keyboard = new Scanner(System.in);

        // 반복 횟수, 입력 값 저장 변수
        int count=0, total=0, data = 0;
        float avg = 0.f;

        // cmd 확인용
        System.out.print("숫자 입력: ");

        while ((data=keyboard.nextInt())!=0) {
            // 계속 입력을 받아야함.
            System.out.print("숫자 입력: ");

            total += data;
            count++;
        }

        // 평균 계산
        avg = (float)total / count;
        System.out.printf("반복횟수: %d\n합계: %d, 평균: %f \n", count, total, avg);

        // end
        keyboard.close();

    }
}

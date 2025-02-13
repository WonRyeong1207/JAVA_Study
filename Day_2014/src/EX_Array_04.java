/*
    배열 (Array) 선언 및 활용
    : 동일한 데이터 타입의 데이터를 연속된 메모리 공간에 저장하는 것
    : 배열 원소 활용
 */

import java.util.Scanner;

public class EX_Array_04 {

    public static void main(String[] args) {

        // 사용자로부터 3과목 점수를 입력받아서 배열에 저장
        // 합계와 평균을 구하시오.

        // 변수선언
        Scanner input = new Scanner(System.in);
        int total=0, cnt=0;
        float avg=0.f;
        int score[] = new int[3];

        // 점수 입력받기
        for (int i=0; i<3; i++) {
            System.out.print("점수를 입력: ");
            score[i] = input.nextInt();
            total += score[i];
            cnt++;
        }
        input.close();
        System.out.println();
        // 배열의 길이 : score.length

        // 평균계산
        avg = (float)total / cnt;

        // 출력
        System.out.printf("입력한 과목 수 : %d \n", cnt);
        System.out.printf("과목의 합계 : %d 점\n", total);
        System.out.printf("과목의 평균 : %.2f 점\n\n", avg);

    }

}

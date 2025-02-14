/*
    제어문 - 다중 조건문
 */

import java.util.Scanner;

public class EX_IF_02 {

    public static  void main(String[] args) {

        // 학점 출력
        Scanner input = new Scanner(System.in);
        System.out.print("점수 입력: ");

        int jumsu = input.nextInt();
        char grade, score;

        input.close();

        // 다중 if문 사용
        if (jumsu >= 90) {
            grade = 'A';
        } else if (jumsu >= 80) {
            grade = 'B';
        } else if (jumsu >= 70) {
            grade = 'C';
        } else if (jumsu >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }
        System.out.printf("점수 %d의 학점은 %c 입니다 \n\n", jumsu, grade);

        // 스위치문 사용
        switch (jumsu){
            case 90:
                score = 'A';
                break;
            case 80:
                score = 'B';
                break;
            case 70:
                score = 'C';
                break;
            case 60:
                score = 'D';
                break;
            default:
                score = 'F';
        }
        System.out.printf("점수 %d의 학점은 %c 입니다 \n\n", jumsu, score);

    }
}

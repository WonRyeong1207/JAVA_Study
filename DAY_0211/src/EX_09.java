/*
    연산자 - 복합연산자 / 대입연산자
    - 2개의 연산자와 함께 사용
    - 일반연산자와 대입연산자(=) 함께 사용
 */

import java.util.Scanner;

public class EX_09 {

    public  static void main(String[] args) {

        // 키보드 입력을 스캐너에 연결한 객체 생성
        Scanner input = new Scanner(System.in);

        // 숫자 1개 입력 받기
        System.out.print("숫자 입력: ");

        // 숫자 가져오기
        int data = input.nextInt();

        // 복합 연산자
        System.out.printf("%d에 10을 더함 -> %d \n", data, data+=10);   // data = data + 10
        System.out.printf("현재 data : %d \n\n", data);

        System.out.printf("%d에 2를 곱함 -> %d \n", data, data*=2);     // data = data * 2
        System.out.printf("현재 data : %d \n\n", data);

        // close
        input.close();
    }
}

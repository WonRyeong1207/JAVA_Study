package com.exception;

import java.util.Scanner;

/**
 * @PackageName : com.exception
 * @FileName : EX_01
 * @Date : 25. 2. 27.
 * @Description <p>
 * <pre>
 * =========================================================
 * DATE                    AUTHOR            NOTE
 * 25. 2. 27. 오후 1:16     WonRyeong1207     FirstCreate
 * ---------------------------------------------------------</pre>
 * @class_purpose : JAVA EXCEPTION HANDLING
 * <pre>
 * - 심각성이 약한 실행 시 발생되는 에러
 * - 프로그램 중단 안 되도록 처리해주는 것</pre>
 * @class_name : EX_01
 */

public class EX_01 {

    public static void main(String[] args) {

        // 사용자에게 숫자를 입력 받아서 나눗셈 처리
        // 입력 인스턴스 생성
        Scanner keyboard = new Scanner(System.in);

        try {
            // 숫자 2개를 입력 받아서 나눗셉 결과를 화면에 출력
            System.out.print("정수 숫자 2개 입력(예: 20 4) : ");
            int num1 = keyboard.nextInt();
            int num2 = keyboard.nextInt();

            System.out.printf("%d / %d = %.2f\n", num1, num2, (float)num1/num2);

        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("적합한 데이터가 아니라 결과 못함");

        } finally {
            // 입력 스트링 중단
            keyboard.close();

        }
        System.out.println("END");

    }

}

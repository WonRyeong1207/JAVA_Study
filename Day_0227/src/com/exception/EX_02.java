package com.exception;

import java.util.Scanner;

/**
 * @PackageName : com.exception
 * @FileName : EX_02
 * @Date : 25. 2. 27.
 * @Description <p>
 * <pre>
 * =========================================================
 * DATE                    AUTHOR            NOTE
 * 25. 2. 27. 오후 1:32     WonRyeong1207     FirstCreate
 * ---------------------------------------------------------</pre>
 * @class_purpose : JAVA EXCEPTION HANDLING
 * <pre>
 * - 심각성이 약한 실행 시 발생되는 에러
 * - 프로그램 중단 안 되도록 처리해주는 것</pre>
 * @class_name : EX_02
 */

public class EX_02 {

    public static void main(String[] args) {
        // 사용자에게 입력받은 데이터를 배열에 저잘
        // 입력 인스턴스 생성
        Scanner keyboard = new Scanner(System.in);

        // 입력 데이터를 저장할 배열
        int[] num_arr = new int[5];
        int idx = 0;

        try {
            // 입력받은 숫자 중 짝수만 배열에 저장하기
            while (idx < 5) {
                System.out.print("정수 입력 : ");
                int num = keyboard.nextInt();

                if (num%2 == 0) {
                    num_arr[idx] = num;
                    idx++;
                }
            }
            System.out.println("\n모든 입력이 완료 되었습니다.\n");
            System.out.println("--- 입력받은 숫자 ---");
            for (int i : num_arr) {
                System.out.print(i+" ");
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
            System.out.println("예기치 못한 문제가 발생함");

        } finally {
            // 입력 스트링 중단
            keyboard.close();
            System.out.println("END");
        }


    }

}

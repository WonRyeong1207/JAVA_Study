/*
    키보드 입력 받아서 존건에 해당하는지 결과 여부 출력
    - Scanner 인스턴스 생성 : 표준입력 즉, System.in 스트림
 */

import java.util.Scanner;

public class EX_Test01 {

    public static void main(String[] args) {

        // scanner instance
        Scanner input = new Scanner(System.in);

        System.out.print("데이터 입력하기 (ex) d 22 3 : ");
        // int data = input.nextInt();
        // String s_data = input.next();
        // char c_data = s_data.charAt(0);
        char c_data_1 = input.next().charAt(0); // 문자열의 첫번째가 내가 입력한 문자 한개니까.
        // "string"에서 ""의 주소랑 s의 주소는 같으니까.
        int num = input.nextInt();
        char c_data_2 = input.next().charAt(0); // 한번에 받을 수는 없을까? ...? 순서대로 받으니까 어쩔수 없는 것 같음.

        // [1] 입력 받은 문자가 알파벳 대문자 여부
        System.out.printf("입력받은 문자 %s는 대문자? : %b \n\n",c_data_1, (c_data_1 >= 'A') && (c_data_1 <='Z'));

        // [2] 입력 받은 문자가 짝수인지 여부
        System.out.printf("입력받은 문자 %d는 짝수? : %b \n\n",num, (num%2 == 0));

        // [3] 입력 받은 문자가 숫자 (0 ~ 9) 여부
        System.out.printf("입력받은 문자 %s는 숫자? : %b \n\n", c_data_2, (c_data_2 >= '0') && (c_data_2 <= '9'));

        input.close();
    }
}

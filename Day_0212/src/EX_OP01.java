/*
    연산자 - 비교연산자 & 논리연산자
 */

public class EX_OP01 {

    public static void main(String[] args) {

        // 비교연산자
        int num1=30, num2=7;

        // 비교 연산 결과 화면 출력
        System.out.printf("%d > %d : %b \n", num1, num2, num1>num2);
        System.out.printf("%d < %d : %b \n", num1, num2, num1<num2);
        System.out.printf("%d >= %d : %b \n", num1, num2, num1>=num2);
        System.out.printf("%d <= %d : %b \n", num1, num2, num1<=num2);
        System.out.printf("%d == %d : %b \n", num1, num2, num1==num2);
        System.out.printf("%d != %d : %b \n\n", num1, num2, num1!=num2);

        // 논리 연산자
        int num3 = 10;

        // 논리 연산 결과 화면 출력
        // num1이 짝수이면서 30이하의 숫자인지 여부
        // num1 % 2 == 0 짝수, 1 홀수
        // num1 >= 30
        System.out.println(num1%2 == 0);
        System.out.println(num1<=30);
        System.out.printf("and 논리 연산자 (&&) : %b \n", (num1%2 == 0)&&(num1 <=30));
        System.out.printf("and 논리 연산자 (&&) : %b \n\n", (num1%2 == 1)&&(num1 <= 30));

        // or 연산자
        System.out.printf("or 논리 연산자 (||) : %b \n", (num1%2 == 0)||(num1 <= 30));
        System.out.printf("or 논리 연산자 (||) : %b \n\n", (num1%2 == 1)||(num1 <= 30));

        // xor 연산자 (^) : 조건이 서로 달라야 true, 같으면 false
        System.out.printf("xor 논리 연산자 (^) : %b \n", (num1%2 == 0)^(num1<=30));
        System.out.printf("xor 논리 연산자 (^) : %b \n\n", (num1%2 == 1)^(num1<=30));

        // not 연산자 / 토글 연산자 (!) : 현재 결과의 반대를 만듦
        System.out.printf("현재 결과: %b \n", num1<=30);
        System.out.printf("not 논리 연산자 (!) : %b \n\n",!(num1<=30));

        // num1이 30대 인지 체크 -> 30 ~ 39
        // num1 >= 30, num1 < 40 -> 30<= num1 <40
        // System.out.printf("num1은 30대? : %b \n", 30<=num1<40); Error
        System.out.printf("num1은 30대? : %b \n", (num1 >=30)&&(num1<40));

    }
}

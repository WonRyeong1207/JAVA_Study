/*
    연산자 - 산술연산자
    - 덧셈 +
    - 뺄셈 -
    - 곰셈 *
    - 나눗셈 / : 몫을 추출
    - 나머지 %
 */

public class EX_07 {

    public static void main(String[] args) {

        // 변수 선언 및 초기화
        int num1 = 13;
        int num2 = 5;
        // int num1 = 13, num2 = 5;

        // 산술 연산 결과 출력
        System.out.printf("%d + %d = %d\n", num1, num2, num1+num2);
        System.out.printf("%d - %d = %d\n", num1, num2, num1-num2);
        System.out.printf("%d * %d = %d\n", num1, num2, num1*num2);
        System.out.printf("%d / %d = %d\n", num1, num2, num1/num2);     // int / int = int 몫만 추출
        System.out.printf("%d %% %d = %d\n", num1, num2, num1%num2);    // int % int = int 나머지
        System.out.printf("%d / %d = %f\n", num1, num2, (double)num1/num2); // 하나를 강제로 형변환을 해주면 결과가 소수로나옴
                                                                        // (double or float)int / int = double or float
                                                                        // 큰 데이터 타입으로 자동 형변환 후 계산 진행
    }
}

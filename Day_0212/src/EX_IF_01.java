/*
    제어문 - 조건문
 */

public class EX_IF_01 {

    public static void main(String[] args) {

        // 짝수 홀수 구분
        int num = 11;

        // 짝수 홀수 여부 출력
        if (num%2 == 0) {
            System.out.println("짝수");
        }
        else {
            System.out.println("홀수");
        }

        // 삼항 연산자 (조건) ? (true) : (false)
        String msg = (num%2 ==0) ? "짝수" : "홀수";
        System.out.printf("num %d는 %s 입니다 \n", num, msg);
    }
}

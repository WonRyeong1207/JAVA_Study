/*
    연산자 - 증감 연산자
    - ++ 1증가
    - -- 1감소
 */

public class EX_08 {

    public static void main(String[] args) {

        // 변수 선언 및 초기화
        int num = 100;

        // 화면에 출력
        System.out.printf("(0) num is %d\n", num);
        System.out.printf("(1) num is %d\n", ++num);    // 먼저 1증가 후에 %d에 전달 : 선증가
        System.out.printf("(2) num is %d\n", num);
        System.out.printf("(3) num is %d\n", num--);    // %d에 전달 후 1감소 : 후감소
        System.out.printf("(4) num is %d\n", num);
    }
}

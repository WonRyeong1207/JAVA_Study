/*
    제어문 - 반복문 for문
    for (반복 시작; 반복 중단 조건; 증감)
    {
        code
    }
 */

public class EX_FOR_02 {

    public static void main(String[] args) {

        // 10 ~ 100까지 10단위로 출력
        int i = 10;

        for (; i<101; i+=10) {
            System.out.printf("i의 값은 %d 입니다. \n", i);
        }
        System.out.print("\n\n");

        // 10부터 1까지 출력
        // i가 100이니까 초기화
        for (i=10; i>=0; i--) {
            System.out.printf("i의 값은 %d 입니다\n", i);
        }


    }
}

/*
    제어문 - 반복문 for문
    for (반복 시작; 반복 중단 조건; 증감)
    {
        code
    }
 */

public class EX_FOR_01 {

    public static void main(String[] args) {

        // 1 ~ 10까지 화면에 출력
        for (int i = 1; i<=10; i++) {
            System.out.printf("i의 값은 %d 입니다.\n", i);
        }
        System.out.println();

        // for 밖에서 선언해서 사용할 수 ㅣㅇㅆ음.
        int idx = 1;
        for (; idx<=10; idx++){
            System.out.printf("idx의 값은 %d 입니다.\n", idx);
        }
    }
}

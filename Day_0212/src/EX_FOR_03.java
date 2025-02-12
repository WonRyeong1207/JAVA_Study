/*
    제어문 - 반복문 for문
    for (반복 시작; 반복 중단 조건; 증감)
    {
        code
    }
 */

public class EX_FOR_03 {

    public static void main(String[] args) {

        // 아무것도 반복하지 않는 반복문
        // 시간 지연용
        System.out.println("START");

        for (int i=0; i<10000000; i++); // python pass
        for (int j=0; j<10000000; j++){}

        System.out.println("END");

        // 무한 반복문
        // for(;;) {} // 컴 터질 수 있음.
        // for(int i=0; ; i++);
        System.out.println("REALLY END");

    }
}

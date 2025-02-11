/*
    리터럴: 데이터 그대로의 의미
    - 정수 리터럴: 5, 8, ..., 2진수, 8진수, 10진수, 16진수
    - 실수 리터럴: 8.5F, 8.5f, 8.5D, 8.5d
 */

public class EX_02 {

    public static void main(String[] args) {
        // 리터럴 데이터 표기법
        int num = 17;       // 10진수
        num = 0b11;         // 0b   2진수
        num = 017;          // 0    8진수
        num = 0x17;         // 0x   16진수

        long value = 100;   // 명확하게 표시 long value = 100L;

        double d = 0.1234;  // 일반적인 실수 표기법
        d = 1234E-4;        // 과학적 지수 표기법
        d = .1234D;         // 숫자D, 숫자d

        float f = 0.1234f;  // 실수 기준 double
        f = 0.1234F;        // 숫자f, 숫자F

        char c = 'A';       // 2바이트 메모리 2칸 UNICODE
        c = '\u0041';       // 유니코드

        // 화면에 표시
        System.out.println(num);
        System.out.println(value);
        System.out.println(d);
        System.out.println(f);
        System.out.println(c);
    }
}

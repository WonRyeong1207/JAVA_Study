/*
    제어문 - for 반복문
 */

public class EX_LOOP {

    public static void main(String[] args) {

        // 여러개 변수를 가지는 반복문
        for (int x=0, y=5; x<10; x++, y++) {
            System.out.printf("%d * %d = %d\n", x, y, x*y);
        }
        System.out.println();

        // 여러개 변수를 가지는 반복문
        for (int x=0, y=5; x<10 || y<8; x++, y++) {
            System.out.printf("%d * %d = %d\n", x, y, x*y);
        }
        System.out.println();

        // 여러개 변수를 가지는 반복문
        for (int x=0, y=5; x<10 && y<8; x++, y++) {
            System.out.printf("%d * %d = %d\n", x, y, x*y);
        }
        System.out.println();

        // 무한 반복문
//        for (int a=0; ; a++){
//            System.out.println(a);
//        }
//        for (;;) {
//            System.out.println("GOOD");
//        }
        for (int a=0; a<10; ) {
            System.out.println(a);
        }


    }

}

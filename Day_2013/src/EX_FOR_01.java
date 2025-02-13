/*
    반복뭉 - for 반복문
 */

public class EX_FOR_01 {

    public static void main(String[] args) {

        // 1 ~ 10까지 화면 출력
        for (int i=1; i<11; i++) {
            System.out.println(i);
        }
        System.out.println();

        // 1 ~ 50 범위에서 3의 배수만 출력
        for (int n=3; n<51; n+=3) {
            System.out.println(n);
        }
        System.out.println();

        for (int n=1; n<51; n++) {
            if (n % 3 == 0) {
                System.out.println(n);
            }
        }
        System.out.println();

    }
}

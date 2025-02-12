/*
    반복문 - 구구단
    2단 3단 4단 5단
    6단 7단 8단 9단
 */

public class EX_gugu {
    public static void main(String[] args) {

        // 구구단 출력
        // System.out.printf("---%d단--- \t", n+1);
        for (int n = 1; n<10; n++) {
            for (int i = 2; i<6; i++) {

                System.out.printf("%d * %d = %d \t", i, n, i * n);

            }
            System.out.print("\n");
        }
        System.out.print("\n");
        for (int n = 1; n<10; n++) {
            for (int i = 6; i<10; i++) {

                System.out.printf("%d * %d = %d \t", i, n, i * n);

            }
            System.out.print("\n");
        }
    }
}

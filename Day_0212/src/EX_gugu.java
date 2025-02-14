/*
    반복문 - 구구단
    2단 3단 4단 5단
    6단 7단 8단 9단
 */

public class EX_gugu {
    public static void main(String[] args) {

        // 구구단 출력
        // System.out.printf("---%d단--- \t", n+1);
        for (int n = 0; n<10; n++) {
            for (int i = 2; i<6; i++) {
                if (n==0) {
                    System.out.printf("-- %d단 --  \t", i);
                }
                else {
                    System.out.printf("%d * %d = %d \t", i, n, i * n);
                }
            }
            System.out.print("\n");
        }
        System.out.print("\n");
        for (int n = 0; n<10; n++) {
            for (int i = 6; i<10; i++) {
                if (n==0) {
                    System.out.printf("-- %d단 --  \t", i);
                }
                else {
                    System.out.printf("%d * %d = %d \t", i, n, i * n);
                }
            }
            System.out.print("\n");
        }
        System.out.print("\n\n");

        // 마름모 출력
        for (int i=0; i<5; i++) {
            for (int j=0; j<5-i; j++) {
                System.out.print(' ');
            }
            for (int k=0; k<2*i+1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i=0; i<4; i++) {
            for (int j=0; j<=i+1; j++) {
                System.out.print(' ');
            }
            for (int k=7; k>=2*i+1; k--) {
                System.out.print('*');
            }
            System.out.println();
        }
    }
}

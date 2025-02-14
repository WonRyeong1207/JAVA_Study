/*
    반복문 - for 반복문
 */

public class EX_FOR_03 {

    public static void main(String[] args) {

        // 구구단 출력
        for (int n=0; n<20; n++) {
            // int dan = 2;
            if (n==10) {
                System.out.println();
            }
            /*
                2단 3단 4단 5단
                ...
                6단 7단 8단 9단
                ...
                규칙을 찾아서 적용
                dan = 2 + (4 * (n/10))
             */
            for (int dan=2+(4*(n/10)); dan<=5+4*(n/10); dan++) {
                if (n%10 == 0) {
                    System.out.printf(" -- %d단 --", dan);
                }
                else {
                    System.out.printf("%d * %d = %d", dan, n%10, dan*(n%10));
                }
                System.out.print((dan==5||dan==9)?'\n':'\t');
            }
        }

    }

}

/*
    제어문 - continue
    - 반복을 중단하고 다음 반복으로 진행시킴
    - 아래쪽 코드 실행되지 않음

    !!주의!!
    - while/do~while에서는 무한 반복에 빠질 위험이 있음
    - !!! continue 전에 증감처리 필수 !!!
 */

public class EX_CONTINUE {

    public static void main(String[] args) {

        // 1 ~ 10 범위에서 2의 배수만 출력

        // for - continue
        System.out.println("for - continue");
        for (int n=1; n<=10; n++) {
            if (n%2 == 1) {
                continue;
            }
            System.out.printf("%d\t",n);
        }
        System.out.print("\n\n");

        // while - continue
        System.out.println("while - continue ver.1");
        int n = 1;
        while (n<=10) {
            if (n%2 == 1) {
                n++;    // 무한 반복에 걸리지 않도록
                continue;
            }
            System.out.printf("%d\t",n);
            n++;
        }
        System.out.print("\n\n");

        System.out.println("while - continue ver.2");
        n = 0;
        while (n<10) {
            n++;    // 무한 반복에 걸리지 않도록
            if (n%2 == 1) {
                continue;
            }
            System.out.printf("%d\t",n);
        }
        System.out.print("\n\n");

        // do~while - continue
        System.out.println("do~while - continue ver.1");
        int cnt = 1;
        do {
            if (cnt%2 == 1) {
                cnt++;      // 무한 반복에 걸리지 않도록
                continue;
            }
            System.out.printf("%d\t",cnt);
            cnt++;
        } while (cnt<=10);
        System.out.print("\n\n");

        System.out.println("do~while - continue ver.2");
        cnt = 0;
        do {
            cnt++;
            if (cnt%2 == 1) {
                continue;
            }
            System.out.printf("%d\t",cnt);
        } while (cnt<=10);
        System.out.print("\n\n");

    }

}

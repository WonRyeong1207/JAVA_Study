/*
    제어문 - break
    - 가장 가까이 있는 반복문만 종료함
    - 중첩의 경우 가까이 있는 1개의 반복문만 종료
 */

public class EX_BREAK {

    public static void main(String[] args) {

        // 중첩 반복문과 break 문 ---> 한개의 반복문만 종료
        // 구구단의 계산 결과가 7의 배수라면 종료
        System.out.println("구구단의 결과가 7의 배수라면 종료 : 반복문 하나만 종료");
        for (int dan=2; dan<10; dan++) {
            for (int n=1; n<10; n++) {
                if ((dan*n)%7 == 0) {
                    System.out.println("--- END ---");
                    break;
                }
                else {
                    System.out.printf("%d * %d = %d\n", dan, n, dan*n);
                }
            }
            System.out.println();
        }
        System.out.println();

        // 중첩 반복문과 break 문 --->  반복문 전체 종료
        // 구구단의 계산 결과가 7의 배수라면 종료
        // 내부의 반복문 중단 여부 알려줄 변수 -> flag 변수
        boolean isEND = false; // 기본값 false
        System.out.println("구구단의 결과가 7의 배수라면 종료 : 반복문 전체 종료");
        for (int dan=2; dan<10; dan++) {
            // isEnd == ture --> isEND 로 단순화 할 수 있음
            if (isEND) {
                break;
            }
            for (int n=1; n<10; n++) {
                if ((dan*n)%7 == 0) {
                    System.out.println("--- END ---");
                    isEND = true;
                    break;
                }
                else {
                    System.out.printf("%d * %d = %d\n", dan, n, dan*n);
                }
            }
            System.out.println();
        }
        System.out.println();

    }

}

/*
    제어문 - continue/break LABEL
    - 라벨분기 ex) C의 goto 문
    - 중첩 반복문을 한번에 빠져나가기 위해 사용
    - 가독성이 좋지않고 코드가 꼬일 수 있어서 사용을 잘 안함
 */

public class EX_BREAK_LABEL {

    public static void main(String[] args) {

        // 중첩 반복문과 break 문
        // 구구단의 계산 결과가 7의 배수라면 종료
        System.out.println("구구단의 결과가 7의 배수라면 종료 : break LABEL");
        stop:   // for문 앞에 선언하지 않으면 사용 못함 ㅠㅜ
        for (int dan=2; dan<10; dan++) {
            for (int n=1; n<10; n++) {
                if ((dan*n)%7 == 0) {
                    System.out.println("--- END ---");
                    break stop;
                }
                System.out.printf("%d * %d = %d\n", dan, n, dan*n);
            }
            System.out.println();
        }
        System.out.println("OK");

    }
}

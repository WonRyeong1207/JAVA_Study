/*
    제어문 - do ~ while 반복문
    - 최소 1번은 실행되는 반복문
 */

public class EX_DOWHILE_02 {

    public static void main(String[] args) {

        // 문자 타입과 연산
        char ch=0;

        // 숫자로 처리됨
        System.out.println(ch+1);
        System.out.println(ch+10);
        System.out.println();

        ch = 'A';   // 아스키코드 값 의미
        System.out.println(ch+1);
        System.out.printf("%d -> %c\n", ch+1, (char)(ch+1));     // 사람이 볼 수 있게 형변환
        System.out.println(ch+10);
        System.out.printf("%d -> %c\n", ch+10, (char)(ch+10));     // 사람이 볼 수 있게 형변환
        System.out.println('A'+'C');
        System.out.printf("%d -> %c\n", 'A'+'C', (char)('A'+'C'));     // 사람이 볼 수 있게 형변환

        System.out.println();

        // A ~ Z 까지 출력
        do {
            System.out.print(ch);
            ch++;
        } while (ch<='Z');
        System.out.println();

    }

}

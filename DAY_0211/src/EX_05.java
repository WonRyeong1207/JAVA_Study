/*
    키보드로 입력 받기
    - 추가 패키지 필요 : import java.util.Scanner
    - 객체 생성 필요 :  new Scanner(System.in)
 */

// package load
import java.util.Scanner;

// main class
public class EX_05 {

    public static void main(String[] args) {

        // Scanner 객체 생성
        Scanner scan = new Scanner(System.in);

        // 입력받고 싶은 요청 메시지 출력
        System.out.println("이름과 나이 입력: ");

        // Scanner로 가져오기
        String name = scan.next();    // 기본 문자열을 받음
        int n_age = scan.nextInt();     // 기본적으로 공백으로 인식하는 건가?

        System.out.println("입력된 이름: " + name);
        System.out.println("입력된 나이: " + n_age + '살');

        scan.close(); // 사용이 끝나면 닫아야함.
    }
}

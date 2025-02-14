/*
    제어문 - do ~ while 반복문
    - 최소 1번은 실행되는 반복문
 */

public class EX_DOWHILE {

    public static void main(String[] args) {

        // 회원검사 프로그램
        // 회원 번호를 입력받고 검사 후 처리
        // 임의의 회원 번호 지정
        int mem_num = 1010;

        // while
        // 먼저 검사부터 진행. 즉 조건식 만족
        while (mem_num == 2000) {
            System.out.println("반갑습니다. 고객님!");
        }

        // do ~ while
        // 먼저 실핼 후 조건식 검사
        do {
            System.out.println("우리 고객인가요?");
        } while (mem_num == 2000);

    }

}

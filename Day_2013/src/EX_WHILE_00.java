/*
    제어문 - while 반복문
    - 반복의 횟수가 정해지지 않은 경우
    - 반복의 횟수가 정해졌을 경우에도 사용함.
 */

public class EX_WHILE_00 {

    public static void main(String[] args) {

        // 1 ~ 10 while 반복문으로 출력
        int num = 1;
        while (num<10) {
            // 반복 실행 코드
            System.out.println(num);

            // 조건식에 데이터 값 업데이트 : 없으면 무한반복
            num++;
        }

    }

}

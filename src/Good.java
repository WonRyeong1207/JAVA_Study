/*
 * 여러줄 주석
 * - 파일명과 public class 이름 동일해야 함
 * - 실행 위해서는 public class 안에 main() 메서드 필수
 * - 자료형과 크기를 알았으니 이제 memory를 신경써야함.
 */
public class Good {
    // 프로그램 실행 함수 - main
    public static void main(String[] args) {

        // 지역변수 선언
        int age; // 선언
        age = 25; // 지역변수 초기화

        // 한줄로 생성
        String name = "nana";

        /*
        자료형은 따라가야함. 파이썬처럼 자료형을 자유롭게 바꿀 수 없음.
        isOK = false;
        isOK = 1; <-- Error
        isOK = true;
        */

        // 변수값 변경하기
        age = age + 9;
        // age = 30.6; <-- TypeError

        // 상수 선언 및 초기화
        final int NUM = 53; // 상수 선언을 했기에 변수처럼 값을 바꿀 수 없음

        // 모니터에 출력
        System.out.println("name: "+name);
        System.out.println("age: "+age);
        System.out.println("Hello Java!!");
        System.out.println("num: "+NUM);
    }
}

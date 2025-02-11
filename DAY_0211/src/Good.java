/*
    어제에 이어서 기본 문법
    가장 기초적인 문법
 */

public class Good {

    // public class 안에 public static void main() 메서드 존재
    // 실행 시 진입 메서드
    public static void main(String[] args) {
        // 메서드 안에 존재하는 변수 => 지역변수(Local Variable)
        // [변수 선언] 타입명 변수명;
        // [변수 초기화] 변명 = 데이터;

        // 정수형 변수
        int age; // 변수 선언
        age = 10; // 변수 초기화

        // 문자형, 단일 문자
        // 문자열 -> String
        char gender = 'F'; // 변수 선언 및 초기화

        // 화면에 출력
        System.out.println("age: " + age);
        System.out.println("gender: " + gender);

        System.out.println("5 + 7 = " + sum(5, 7));

    }

    // 사용자 정의 메서드/함수
    /*
        함수 이름: sum
        함수 목적: 2개의 정수를 입력받아 합을 반환
        매개변수 : int n, int m
        반환값 : n + m (int)
     */
    public  static  int sum(int n, int m) {
        return n+m;
    }
}

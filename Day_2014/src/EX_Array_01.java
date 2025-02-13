/*
    배열 (Array) 선언 및 활용
    : 동일한 데이터 타입의 데이터를 연속된 메모리 공간에 저장하는 것
 */

public class EX_Array_01 {

    public static void main(String[] args) {

        // 일반 변수와 배열 저장 변수
        // 10과목 점수 저장
        int kor, math, eng, sci, dance;
        int art, music, com, visual, soci;

        // 1개의 변수명으로 10 과목을 저장 => 배열
        // 두가지 선언 방법이 있음.
        int [] jumsu1;
        int jumsu2[];

        // 배열 생성 및 저장
        // 즉, 메모리 힙 영역의 주소를 저장함.
        // 배열 변수명은 배열의 메모리의 시작 주소를 저장함.
        jumsu1 = new int[10];
        jumsu2 = new int[3];    // int로 선언했다면 생성도 int만 가능

        // 배열을 선언하고 생성하는 방법 + 값을 입력하는 방법
        int jumsu3[] = new int[] {5, 7, 9};

        // 출력하기
        System.out.println("메모리 주소가 출력되는 것을 볼 수 있음.");
        System.out.println("jumsu1 " + jumsu1);
        System.out.println("jumsu2 " + jumsu2);

    }

}

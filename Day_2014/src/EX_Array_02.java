/*
    배열 (Array) 선언 및 활용
    : 동일한 데이터 타입의 데이터를 연속된 메모리 공간에 저장하는 것
 */

public class EX_Array_02 {

    public static void main(String[] args) {

        // 배열 생성 및 저장
        // 즉, 메모리 힙 영역의 주소를 저장함.
        // 배열 변수명은 배열의 메모리의 시작 주소를 저장함.
        // 배열을 선언하고 생성하는 방법 + 값을 입력하는 방법
        int jumsu3[] = new int[] {5, 7, 9}; // 크기를 지정하지 않으면 초기화 값을 보고 알아서 할당함.
        // int jumsu4[] = new int[5] {0, 1};    // 크기와 초기화 값의 수가 맞지 않으면 Error
        int jumsu4[] = {10, 20, 30};    // 알아서 할당해줌

        // 원소 출력
        System.out.println("jumsu3[0] : " + jumsu3[0]);
        System.out.println("jumsu4[1] : " + jumsu4[1]);
        // System.out.println("jumsu4[-1] : " + jumsu4[-1]);    // -index는 java에서는 지원되지 않음

        // 원소 값 변경
        jumsu3[0] = 100;
        System.out.printf("jumsu3[0] : %d\n", jumsu3[0]);

        jumsu4[1] = (int)98.f;
        System.out.printf("jumsu4[1] : %d\n", jumsu4[1]);


    }

}

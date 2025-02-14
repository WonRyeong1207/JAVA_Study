/*
    배열 (Array) 선언 및 활용
    : 동일한 데이터 타입의 데이터를 연속된 메모리 공간에 저장하는 것
    : 배열 원소 활용
 */

public class EX_Array_03 {

    public static void main(String[] args) {

        // 정수 5개 저장하는 배열 선언 및 생성
        int[] nums = new int[5];

        // 원소값 확인
        for (int i=0; i<5; i++) {
            nums[i] = i * i;    // 인덱스를 이용해서 값을 채우는 방법
            System.out.printf("배열 nums의 %d번째 원소 : %d\n", i, nums[i]);
            // nums[i] = i * i;    // 인덱스를 이용해서 값을 채우는 방법
        }
        System.out.println();

    }

}

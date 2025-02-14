/*
    배열 (Array) 선언 및 활용
     2차원 배열 => 행과 열로 구성
              => 타입명[][] 변수명;    타입명 변수명[][];
 */

public class EX_Array_07 {

    public static void main(String[] args) {

        // 2차원 배열 객체 생성 및 초기화
        // 2행 3열 2차우너 배열, 모두 정수
        int[][] num_arr = new int[2][3];

        System.out.printf("num_arr  =>  %d\n", num_arr);
        System.out.printf("num_arr[0] => %d\n", num_arr[0]);
        System.out.printf("num_arr[0][0] => %d\n", num_arr[0]);
        System.out.printf("num_arr[1] => %d\n", num_arr[1]);
        System.out.printf("num_arr[1][1] => %d\n", num_arr[1][1]);




    }

}

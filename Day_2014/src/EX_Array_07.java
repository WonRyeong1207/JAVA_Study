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

        // 값을 입력하지 않았기 때문에 %s
        // 주소를 저장하고 있기 때문에
        System.out.printf("num_arr  =>  %s\n", num_arr);
        System.out.printf("num_arr의 길이  =>  %s\n\n", num_arr.length);

        System.out.printf("num_arr[0] => %s\n", num_arr[0]);
        System.out.printf("num_arr[0][0] => %s\n\n", num_arr[0]);

        System.out.printf("num_arr[1] => %s\n", num_arr[1]);
        System.out.printf("num_arr[1][1] => %s\n\n", num_arr[1][1]);


    }

}

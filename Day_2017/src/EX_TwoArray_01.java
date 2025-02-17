/*
    이차원 배열 선언 및 활용
 */

public class EX_TwoArray_01 {

    public static void main(String[] args) {

        // 2차원 배열 선언 및 초기화
        int int_arr[][];
        int_arr = new int[2][3];    // 0으로 초기화

        // 배열 원소 값 출력
        for (int value:int_arr[0]) {
            System.out.println(value);
        }
        System.out.println();

        System.out.println("0번 행의 주소: "+int_arr[0]);
        System.out.println("0번 행의 0번 원소: "+int_arr[0][0]);

        System.out.println("1번 행의 주소: "+int_arr[1]);
        System.out.println("1번 행의 1번째 원소: "+int_arr[1][1]);
        System.out.println();

        // 배열 원소 값 넣기
        for (int i=0; i< int_arr.length; i++) {
            // 각 행 별로 원소에 값 넣기
            for (int j=0; j<int_arr[i].length; j++) {
                int_arr[i][j] = i+j;
                System.out.printf("int_arr[%d][%d] : %d\n", i, j, int_arr[i][j]);
            }
        }
        System.out.println();

        // 배열의 원소 값 모두 출력 -> for ~ each 문
        // 원소를 담을 변수명 -> 배열명
        for (int[] n : int_arr) {   // row
            // 원소를 담을 변수명 -> 1D 배열명
            for (int k: n) {    // value
                System.out.println("int_arr : "+k);
            }
        }


    }

}

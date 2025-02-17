/*
    이차원 비정방향배열 선언 및 활용
    - 비정방향 배열 : 행마다 원소 개수가 다른 배열
 */

public class EX_TwoArray_02 {

    public static void main(String[] args) {

        // 2차원 배열 선언 및 초기화
        int int_arr[][];
        int_arr = new int[2][];    // 행 개수 설정, 행별로 1D 미정

        // 행마다 원소 개수 설정
        // int_arr[0] = new int[3];
        // int_arr[1] = new int[5];

        // 값 초기화
        int_arr[0] = new int[]{10, 20, 30};
        int_arr[1] = new int[]{3, 6, 9, 12, 15};

        // 원소 출력
        // for 문
        System.out.println("for 문 사용");
        for (int i=0; i<int_arr.length; i++) {
            System.out.printf("%d행\n", i);
            for (int j=0; j<int_arr[i].length; j++) {
                System.out.printf("int_arr[%d][%d] : %d\n", i, j, int_arr[i][j]);
            }
        }
        System.out.println();

        // for ~ each 문
        System.out.println("for ~ each 문 사용");
        for (int[] row:int_arr) {
            for (int n:row) {
                System.out.printf("%d\t", n);
            }
            System.out.println();
        }
        System.out.println();


    }

}

/*
    삼차원 배열 선언 및 활용
 */

public class EX_ThreeArray_01 {

    public static void main(String[] args) {

        // 3차원 배열 선언 및 초기화
        int int_arr[][][];
        int_arr = new int[1][2][3];    // 0으로 초기화

        // 배열에서 원소 개수 파악 속성 -> length
        System.out.println("int_arr.length : "+int_arr.length+"개");
        System.out.println("int_arr[0].length : "+int_arr[0].length+"개");
        System.out.println("int_arr[0][0].length : "+int_arr[0][0].length+'개');
        System.out.println();




    }

}

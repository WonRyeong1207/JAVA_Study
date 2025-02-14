/*
    배열 (Array) 선언 및 활용
     2차원 배열 => 행과 열로 구성
              => 타입명[][] 변수명;    타입명 변수명[][];
     2차원 배열 원소 => 변수명[행][열]
 */

public class EX_Array_08 {

    public static void main(String[] args) {

        // 2차원 배열 객체 생성 및 초기화
        // 2행 3열 2차우너 배열, 모두 문자열
        String[][] name_arr = new String[][] {{"홍", "박", "이"}, {"Hong", "Park", "Lee"}};

        // 원소 출력
        for (int row=0; row< name_arr.length; row++) {
            System.out.printf("name_arr[%d] => %s\n", row, name_arr[row]);
            System.out.printf("name_arr[%d][0] => %s\n\n", row, name_arr[row][0]);
        }
        System.out.println();

        for (int row=0; row< name_arr.length; row++) {
            for (int col=0; col<name_arr[row].length; col++) {
                System.out.printf("name_arr[%d][%d] => %s\n", row, col, name_arr[row][col]);
            }
            System.out.println();
        }
        System.out.println();

    }

}

/*
    배열 (Array) 선언 및 활용
    - 순차적으로 들어있는 데이터 추출에 유용한 for-each 문
     for (타입 변수명: 배열명)
     - 변수명 : 배열의 원소가 순서대로 하나씩 저장됨
 */

public class EX_Array_06 {

    public static void main(String[] args) {

        // 배열 객체 생성 및 초기화
        int values[] = new int[] {1, 3, 5, 7, 9, 11};  // 배열

        // 배열 안의 모든 원소 출력
        System.out.println("배열 안의 모든 원소 출력");

        // (1) 일반 for 문
        // 배열의 length 속성으로 인덱스 범위 설정 가능
        // 인덱스 지정가능
        System.out.println("for 문을 사용하는 방법");
        for (int i=0; i<values.length; i++) {
            System.out.printf("%d번째 원소 : %d\n", i, values[i]);
        }
        System.out.println();

        // (2) for-each 문
        // 인덱스 지정 불가능
        System.out.println("for-each 문을 사용하는 방법");
        for (int v : values) {
            System.out.printf("values의 원소 : %d\n", v);
        }
        System.out.println();

        // 문자열 배열
        // 계절 이름을 저장 후 하나씩 출력하기
        String season_arr[] = {"초봄", "봄", "늦봄", "초여름", "여름", "늦여름",
                               "초가을", "가을", "늦가을", "초겨울", "겨울", "늦겨울"};
        System.out.println("계절이름 출력");

        // (1) 일반 for 문
        // 배열의 length 속성으로 인덱스 범위 설정 가능
        // 인덱스 지정가능
        System.out.println("for 문을 사용하는 방법");
        for (int i=0; i<season_arr.length; i++) {
            System.out.printf("%d번째 원소 : %s\n", i, season_arr[i]);
        }
        System.out.println();

        // (2) for-each 문
        // 인덱스 지정 불가능
        System.out.println("for-each 문을 사용하는 방법");
        for (String name : season_arr) {
            System.out.printf("season_err의 원소 : %s\n", name);
        }
        System.out.println();

    }

}

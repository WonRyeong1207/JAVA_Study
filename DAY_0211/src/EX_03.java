/*
    리터럴 문자
    - 숫자 사이에 '_' 삽입 => 사람을 위한 가독성
    - 바이트 코드 변환 시에는 무시됨
 */

public class EX_03 {

    public static void main(String[] args) {
        // 숫자와 '_'
        int jumin = 2010_1212;
        int num = 0b010101_00011;
        int age = 2___5;
        // Error int jumsu = 100_;  jumsu = 0b_100; <- Error
        // 숫자 사이에서만 가능
        long maxvalue = 100_0L; // maxvalue = 1000_L; or maxvalue = 100_0_L; 이 또한 Error


        // 화면 출력
        System.out.println(jumin);
        System.out.println(num);
        System.out.println(age);

    }
}

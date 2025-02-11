/*
    형식지정 (format) print
    - System.out.println("%알파벳", data)
    - 형식지정 문자
    %d : 10진수 정수 int
    %s : 문자열 String
    %f : 실수 float
    %x : 16진수 정수 int
    %b : boolean
    %o : 8진수 정수 int
    %c : 단일 문자 char
    %n : 줄바꿈
 */

public class EX_06 {

    public static void main(String[] args) {

        // 형식에 맞는 데이터 지정해서 출력
        int age = 10;
        char gender = 'M';
        String name  = "nana";
        float height = 142.6f;

        // 출력하기
        System.out.printf("이름은 %s, 나이 %d, 키 %f, 성별 %c 입니다.\n",name, age, height, gender);
        System.out.println("END");
        System.out.printf("name is %s.\n",name);
        // println 변수 하나, printf 변수 여러개
        System.out.printf("나이 %d, %x, %b %n", age, age, age);

    }
}

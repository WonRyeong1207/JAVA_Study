/*
    배열 (Array) 선언 및 활용
    : 동일한 데이터 타입의 데이터를 연속된 메모리 공간에 저장하는 것
    : 배열 객체 속성과 메서드
 */

public class EX_Array_05 {

    public static void main(String[] args) {

        // 배열 객체 생성
        int values[] = new int[5];  // 배열
        int ade = 10;               // 변수
        String name = "Hong";       // 객체

        // 배열 객체명.속성명
        // 배열 객체명.메서드명()
        System.out.println("배열의 원소 개수 : "+values.length);   // 속성
        System.out.println(values.toString());                  // 메서드

        // 객체는 메서드가 많음.
        System.out.println("문자열 원소 개수 : " + name.length());
        System.out.println(name.substring(0,2));


    }

}

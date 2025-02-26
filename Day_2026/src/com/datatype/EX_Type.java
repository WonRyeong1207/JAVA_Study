package com.datatype;

/**
 * @PackageName : com.datatype
 * @FileName : EX_Type
 * @Date : 25. 2. 26.
 * @Description <p>
 * <pre>
 * =========================================================
 * DATE                    AUTHOR            NOTE
 * 25. 2. 26. 오후 5:28     WonRyeong1207     FirstCreate
 * ---------------------------------------------------------</pre>
 * @class_purpose : 기본 자료형과 참조 자료형의 형변환 실습
 * @class_name : EX_Type
 */

public class EX_Type {

    public static void main(String[] args) {
        // [1] 기본 자료형 => 스택에 저장, int, float, char, boolean
        int num;
        float fnum = 4.555f;

        num = (int)fnum;    // 명시적 형변환. 즉, 데이터 손실 발생
        System.out.println("fnum -> num : "+num);    // 버림

        // [2] 참조 자료형 => 힙에 저장. String, Array, ... 즉, 인스턴스
        String age = "10";

        // String -> int : 인스턴스 타입 -> int 타입
        // num = (int) age;     // error
        // 인스턴스 타입 => int 인스턴스 타입 => Integer 클래스 : 랩퍼(Wrapper) 클래스
        num = Integer.parseInt(age);
        System.out.println("String -> int : "+num);


    }

}

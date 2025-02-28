package com.test;

/**
 * @PackageName : com.test
 * @FileName : EX_Wrapper01
 * @Date : 25. 2. 28.
 * @Description <p>
 * <pre>
 * =========================================================
 * DATE                    AUTHOR            NOTE
 * 25. 2. 28. 오후 2:36     WonRyeong1207     FirstCreate
 * ---------------------------------------------------------
 * - 기본데이터 ==> 클래스화 한 것, Wrapper 클래스라함
 * - int    -> Integer class
 * - float  -> Float class
 * - char   -> Charactor class</pre>
 * @class_purpose : Wrapper 클래스 실습
 * @class_name : EX_Wrapper01
 */

public class EX_Wrapper01 {
    public static void main(String[] args) {
        // int -> Integer 즉, 레퍼런스 타입으로 변환
        int num = 7;

        // Integer iNum1 = Integer.valueOf(num); -> Integer iNum1 = num; 으로 간략화 가능
        Integer iNum1 = num;
        Integer iNum2 = Integer.valueOf("7");

        System.out.printf("num   -> %d\n", num);
        System.out.printf("iNum1 -> %d\n", iNum1);
        System.out.printf("iNum2 -> %d\n\n", iNum2);

        // 문자열 -> int
        System.out.printf("'7' -> %d\n", Integer.valueOf("7").intValue());
        System.out.printf("'7' -> %d\n\n", Integer.parseInt("7"));

        // Boxing & UnBoxing 자동 형변환 : 기본타입 <-> Wrapper 타입
        int a = 10;

        // Boxing 자동화
        Integer ten = a;

        // UnBoxing 자동화
        int b = ten;

    }

}

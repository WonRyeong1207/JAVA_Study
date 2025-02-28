package com.test;

/**
 * @PackageName : com.test
 * @FileName : EX_String
 * @Date : 25. 2. 28.
 * @Description <p>
 * <pre>
 * =========================================================
 * DATE                    AUTHOR            NOTE
 * 25. 2. 28. 오후 2:58     WonRyeong1207     FirstCreate
 * ---------------------------------------------------------</pre>
 * @class_purpose : String class method
 * @class_name : EX_String
 */

public class EX_String {
    public static void main(String[] args) {

        String msg = "CookieRunKingdom Devesisters";

        // 문자열 메서드
        // 구성 문자 개수 반환
        System.out.printf("%s -> length() : %d\n\n", msg, msg.length());

        // 특정 인덱스의 문자 추출
        System.out.printf("%s -> charAt(0) : %s\n", msg, msg.charAt(0));
        int last_idx = msg.length() - 1;
        System.out.printf("%s -> charAt(%d) : %s\n\n", msg, last_idx, msg.charAt(last_idx));

        // 특정 인덱스의 문자 추출
        System.out.printf("%s -> lastIndexOf(R) : %d\n", msg, msg.lastIndexOf('R'));
        System.out.printf("%s -> charAt(lastIndexOf(e)) : %s, %d\n\n", msg, msg.charAt(msg.lastIndexOf('e')), msg.lastIndexOf('e'));

        // 특정 문자로 문자열 분리
        // 정규식을 알아야 사용 가능함
        String[] arr_msg = msg.split("\s");
        System.out.printf("\\s로 %s 분리\n", msg);
        for (String s : arr_msg) {
            System.out.printf("arr_msg : %s\n", s);
        }
        System.out.print("\n");

        //


    }
}

package com.exception;

/**
 * @PackageName : com.exception
 * @FileName : ㄸㅌ_04
 * @Date : 25. 2. 27.
 * @Description <p>
 * <pre>
 * =========================================================
 * DATE                    AUTHOR            NOTE
 * 25. 2. 27. 오후 2:22     WonRyeong1207     FirstCreate
 * ---------------------------------------------------------</pre>
 * @class_purpose : 강제 예외 발생
 * @class_name : EX_04
 */

public class EX_04 {
    // [실습] 예외 넘기고 처리하기
//    public static void main(String[] args) {
//        try {
//            // 강제 예외 발생시키기
//            // 해당 메서드를 호출한 쪽으로 예외 넘기기 -> throw exception
//            throw new Exception("Custom EXCEPTION");
//        } catch (Exception e) {
//            System.out.println("내가 했음 "+e);
//        }
//    }

    // [십습] 호출한 메서드의 예외 처리
    /**
    *   @method_purpose : 예외처리 메서드
    *   @method_name : calcNums
    *   @param
    *   @return
    *   @throws "3의 배수 에러"
    *   @Description : 합계가 3의 배수가 되면 Exception 발생됨
    */
    public static void calcNums() throws Exception{
        // 합계가 3의 배수가 되면 예외 발생

        for (int num=1, total=0; ; num++) {
            total += num;
            if (total % 3 == 0) throw new Exception("3의 배수 에러");
        }
    }

    public static void main(String[] args) {
        try {
            calcNums();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}

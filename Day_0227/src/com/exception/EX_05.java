package com.exception;

import java.time.LocalDate;

/**
 * @PackageName : com.exception
 * @FileName : EX_05
 * @Date : 25. 2. 27.
 * @Description <p>
 * <pre>
 * =========================================================
 * DATE                    AUTHOR            NOTE
 * 25. 2. 27. 오후 4:41     WonRyeong1207     FirstCreate
 * ---------------------------------------------------------</pre>
 * @class_purpose : 시간 관련 패키지 다뤄보기
 * @class_name : EX_05
 */

public class EX_05 {
    public static void main(String[] args) {
        // 날짜관련 패키지 사용
        LocalDate current = LocalDate.now();

        System.out.println(current);
    }
}

package com.kdt;

/**
 * @PackageName : com.kdt
 * @FileName : Inheritance
 * @Date : 25. 2. 21. 오후 1:14
 * @Description <p>
 * <pre>
 * =========================================================
 * DATE                    AUTHOR            NOTE
 * 25. 2. 21. 오후 1:14     WonRyeong1207     FirstCreate
 * ---------------------------------------------------------</pre>
 * @class_purpose :상속 클래스 실행 및 제어
 * @class_name : Inheritance
 */

public class Inheritance {

    public static void main(String[] args) {
        // 10명의 학생 정보 저장
        Student[] arr_std = new Student[10];
        arr_std[0] = new Student("Hong", 14, "Daegu middle school");
        arr_std[0].printInfo();


        // 문자열 배열
        String[] arr_msg = new String[10];
        arr_msg[0] = "Good";
        arr_msg[1] = new String("ok");

    }

}

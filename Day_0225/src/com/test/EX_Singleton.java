package com.test;

/**
 * @PackageName : com.test
 * @FileName : EX_Singleton
 * @Date : 25. 2. 25.
 * @Description <p>
 * <pre>
 * =========================================================
 * DATE                    AUTHOR            NOTE
 * 25. 2. 25. 오후 2:54     WonRyeong1207     FirstCreate
 * ---------------------------------------------------------</pre>
 * @class_purpose
 * <pre>
 * private 생성자 클래스와 인스턴스 생성
 * => 간접 접근을 이용하여 인스턴스를 생성함</pre>
 * @class_name : EX_Singleton
 */

public class EX_Singleton {
    public static void main(String[] args) {
        // 인스턴스 생성
        // Singleton s = new Singleton();
        // private 생성자로 외부 공개 X

        Singleton s = Singleton.getInstance();  // 인스턴스는 못 만드니까 클래스 메서드 사용
        System.out.print(s.toString()); // 간접 접근

    }
}

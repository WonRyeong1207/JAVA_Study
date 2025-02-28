package com.test;

import com.model.Point;

/**
 * @PackageName : com.test
 * @FileName : EX_Object01
 * @Date : 25. 2. 28.
 * @Description <p>
 * <pre>
 * =========================================================
 * DATE                    AUTHOR            NOTE
 * 25. 2. 28. 오후 1:29     WonRyeong1207     FirstCreate
 * ---------------------------------------------------------</pre>
 * @class_purpose : 자바 최상위 클래스 object 클래스 오버라이딩
 * @class_name : EX_Object01
 */

public class EX_Object01 {
    public static void main(String[] args) {
        // create instance
        Point p1 = new Point(5, 10);
        Point p2 = new Point(15, 10);
        Point p3 = p1;
        Point p4 = new Point(5,10);

        p1.drawing();
        System.out.println(p1.toString());  // 반환값을 주기 때문에

        // 두 인스턴스 비교 결과 출력
        System.out.println("p1 == p2 : "+(p1 == p2));
        System.out.println("p1 == p3 : "+(p1 == p3));
        System.out.println();

        System.out.println(p1.toString());
        System.out.println(p2.toString());
        System.out.println(p3.toString());
        System.out.println();

        System.out.printf("p1.equals(p2) -> %b, %s, %s\n", p1.equals(p2), p1.toString(), p2.toString());
        System.out.printf("p1.equals(p4) -> %b, %s, %s\n", p1.equals(p4), p1.toString(), p4.toString());
        System.out.println();

        //

    }
}

package com.abs;

/**
 * @PackageName : com.abs
 * @FileName : EX_Abstract
 * @Date : 25. 2. 24.
 * @Description <p>
 * <pre>
 * =========================================================
 * DATE                    AUTHOR            NOTE
 * 25. 2. 24. 오후 5:22     WonRyeong1207     FirstCreate
 * ---------------------------------------------------------</pre>
 * @class_purpose : 미완성 메서드 실습
 * @class_name : EX_Abstract
 */

public class EX_Abstract {

    public static void main(String[] args) {
        // create instance
        // Shape s1 = new Shape(); 추상 클래스는 인스턴스 생성 불가

        Line l1 = new Line();
        l1.draw();
        l1.paint(l1.getColor());

    }

}

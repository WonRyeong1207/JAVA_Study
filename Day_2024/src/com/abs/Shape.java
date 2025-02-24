package com.abs;

/**
 * @PackageName : com.abs
 * @FileName : Shape
 * @Date : 25. 2. 24.
 * @Description <p>
 * <pre>
 * =========================================================
 * DATE                    AUTHOR            NOTE
 * 25. 2. 24. 오후 5:16     WonRyeong1207     FirstCreate
 * ---------------------------------------------------------</pre>
 * @class_purpose : 미완성 클래스 실습
 * @class_name : Shape
 * @parents_class : None
 * @class_attribute : None
 * @class_function : 그리기(미완성), 칠하기
 * @class_method : generator, draw<-abstract, paint
 */

abstract public class Shape {

    // generator method
    public Shape() {}

    // member method
    /**
    *   @method_purpose : 색을 칠하기
    *   @method_name : paint
    *   @param color
    *   @return %s painting!!
    *   @Description : String color
    */
    public void paint(String color) {
        System.out.printf("%s painting!!\n", color);
    }

    // 미완성 추상 메서드
    /**
    *   @method_purpose : 미완성 메서드
    *   @method_name : draw
    *   @param
    *   @return
    *   @Description : 자식 클래스에서 구현 해야함.
    */
    abstract public void draw();

}

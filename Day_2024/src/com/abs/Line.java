package com.abs;

/**
 * @PackageName : com.abs
 * @FileName : Line
 * @Date : 25. 2. 24.
 * @Description <p>
 * <pre>
 * =========================================================
 * DATE                    AUTHOR            NOTE
 * 25. 2. 24. 오후 5:24     WonRyeong1207     FirstCreate
 * ---------------------------------------------------------</pre>
 * @class_purpose : Shape의 미완성 메서드 완성하기
 * @class_name : Line
 * @parents_class :Shape
 * @class_attribute : 선 색상(String color), 선 두께(int width), 선 길이(int length)
 * @class_function : graw 그리기 완성
 * @class_method : generate, getter/setter, draw
 */

public class Line extends Shape{
    // member attribute
    private String color;
    private int width;
    private int length;

    // generator method
    public Line() {
        this("Black", 1, 1);
    }

    public Line(String color, int width, int length) {
        this.color = color;
        this.width = width;
        this.length = length;
    }

    // getter/setter
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public int getWidth() {
        return width;
    }
    public void setWidth(int width) {
        this.width = width;
    }

    public int getLength() {
        return length;
    }
    public void setLength(int length) {
        this.length = length;
    }

    // member method
    /**
    *   @method_purpose : 구현된 draw 메서드
    *   @method_name : draw
    *   @param
    *   @return 두께 %d, 길이 %d인 %s 선 그리기
    *   @Description : 선을 그리는 것으로 구현됨
    */
    @Override
    public void draw() {
        System.out.printf("두께 %d, 길이 %d인 %s 선 그리기\n\n", this.width, this.length, this.color);
    }
}

package com.user;

/**
 * @PackageName : com.user
 * @FileName : ColorPoint
 * @Date : 25. 2. 24.
 * @Description <p>
 * <pre>
 * =========================================================
 * DATE                    AUTHOR            NOTE
 * 25. 2. 24. 오후 2:57     WonRyeong1207     FirstCreate
 * ---------------------------------------------------------</pre>
 * @class_purpose : 점에 대한 정보 저장하는 클래스
 * @class_name : ColorPoint
 * @parents_class : Point
 * @class_attribute : x(int), y(int), dim(int), color(String)
 * @class_function : 점 그리기, 정보 출력
 * @class_method : generator, getter/setter, draw, printInfo
 */
public class ColorPoint extends Point{
    // member attribute
    private String color;

    // generator method
    public ColorPoint() {
        this(0, 0, 2, "black");
    }

    public ColorPoint(int x, int y, String color) {
        super(x, y);
        this.color = color;
    }

    public ColorPoint(int x, int y, int dim, String color) {
        super(x, y, dim);
        this.color = color;
    }

    // getter/setter
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    // member method
    /**
    *   @method_purpose : 점 그리기
    *   @method_name : draw
    *   @param
    *   @return color: %s, ●
    *   @Description : 색깧 점 그리기
    */
    @Override
    public void draw() {
        System.out.printf("color: %s, ●\n\n", this.color);
    }

    /**
    *   @method_purpose : 점의 정보 출력
    *   @method_name : printInfo
    *   @param
    *   @return point is (%d, %d), %dD, color is %s
    *   @Description : 점의 좌표, 차원, 색상을 출력
    */
    @Override
    public void printInfo() {
        System.out.printf("Point is (%d, %d), %dD, color is %s\n\n", this.getX(), this.getY(), this.getDim(), this.color);
    }
}

package com.user;

/**
 * @PackageName : com.user
 * @FileName : Point
 * @Date : 25. 2. 24.
 * @Description <p>
 * <pre>
 * =========================================================
 * DATE                    AUTHOR            NOTE
 * 25. 2. 24. 오후 2:40     WonRyeong1207     FirstCreate
 * ---------------------------------------------------------</pre>
 * @class_purpose : 점에 대한 정보를 저장하는 클래스
 * @class_name : Point
 * @parents_class : None
 * @class_attribute : x(int), y(int), dim(int)
 * @class_function : 점 그리기, 점 정보 출력
 * @class_method : generator, getter/setter, draw, printInfo
 */
public class Point {
    // member attribute
    private int x;
    private int y;
    private int dim;

    // generator method
    public Point() {
        this(0, 0, 2);
    }

    public Point(int x, int y) {
       this(x, y, 2);
    }

    public Point(int x, int y, int dim) {
        this.x = x;
        this.y = y;
        this.dim = dim;
    }

    // getter/setter
    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }

    public int getDim() {
        return dim;
    }
    public void setDim(int dim) {
        this.dim = dim;
    }

    // member method
    /**
    *   @method_purpose : 점을 그린다
    *   @method_name : draw
    *   @param
    *   @return  ●
    *   @Description : 점 표시
    */
    public void draw() {
        System.out.println("●");
    }

    /**
    *   @method_purpose : 점의 정보를 출력
    *   @method_name : printInfo
    *   @param
    *   @return point is (%d, %d), %dD
    *   @Description : 점의 좌표와 차원 정보를 출력
    */
    public void printInfo() {
        System.out.printf("Point is (%d, %d), %dD\n\n", this.x, this.y, this.dim);
    }

}

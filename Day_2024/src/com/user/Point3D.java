package com.user;

/**
 * @PackageName : com.user
 * @FileName : Point3D
 * @Date : 25. 2. 24.
 * @Description <p>
 * <pre>
 * =========================================================
 * DATE                    AUTHOR            NOTE
 * 25. 2. 24. 오후 2:48     WonRyeong1207     FirstCreate
 * ---------------------------------------------------------</pre>
 * @class_purpose : 점에 대한 정보를 저장한 클래스
 * @class_name : Point3D
 * @parents_class : Point
 * @class_attribute : x(int), y(int), z(int), dim(int)
 * @class_function : 점 그리기, 정보출력
 * @class_method : generator, getter/setter, draw, printInfo
 */
public class Point3D extends Point{
    // member attribute
    private int z;

    // generator method
    public Point3D() {
        this(0, 0, 0, 3);
    }

    public Point3D(int x, int y, int z) {
        super(x, y);
        this.z = z;
        this.setDim(3);
    }

    public Point3D(int x, int y, int z, int dim) {
        super(x, y, dim);
        this.z = z;
    }

    // getter/setter
    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    // member method

    /**
    *   @method_purpose : 점 그리기
    *   @method_name : draw
    *   @param
    *   @return ◎
    *   @Description : 점 그리기
    */
    @Override
    public void draw() {
        System.out.println("◎");
    }

    /**
    *   @method_purpose : 점의 정보를 출력
    *   @method_name : printInfo
    *   @param
    *   @return point is (%d, %d, %d), %dD
    *   @Description : 점의 좌표와 차원 정보를 출력
    */
    @Override
    public void printInfo() {
        System.out.printf("Point is (%d, %d, %d), %dD\n\n", this.getX(), this.getY(), this.z, this.getDim());
    }
}

package com.user;

/**
 * @PackageName : com.user
 * @FileName : Point4D
 * @Date : 25. 2. 24.
 * @Description <p>
 * <pre>
 * =========================================================
 * DATE                    AUTHOR            NOTE
 * 25. 2. 24. 오후 4:35     WonRyeong1207     FirstCreate
 * ---------------------------------------------------------</pre>
 * @class_purpose : 점에 대한 정보 저장
 * @class_name : Point4D
 * @parents_class : Point3D
 * @class_attribute : x, y, z, t, dim
 * @class_function : 점 그리기, 정보 출력
 * @class_method : generator, getter/setter, draw, printInfo
 */
public class Point4D extends Point3D{
    // member attribute
    private int t;

    // generator method
    public Point4D() {
        this(0, 0, 0, 0, 4);
    }

    public Point4D(int x, int y, int z, int t) {
        super(x, y, z);
        this.t = t;
        this.setDim(4);
    }

    public Point4D(int x, int y, int z,int t, int dim) {
        super(x, y, z, dim);
        this.t = t;
    }

    // getter/setter
    public int getT() {
        return t;
    }

    public void setT(int t) {
        this.t = t;
    }

    // member method
    /**
     *   @method_purpose : 점 그리기
     *   @method_name : draw
     *   @param
     *   @return º
     *   @Description : 점 그리기
     */
    @Override
    public void draw() {
        System.out.println("º");
    }
    /**
     *   @method_purpose : 점의 정보를 출력
     *   @method_name : printInfo
     *   @param
     *   @return point is (%d, %d, %d, %d), %dD
     *   @Description : 점의 좌표와 차원 정보를 출력
     */
    @Override
    public void printInfo() {
        System.out.printf("Point is (%d, %d, %d, %d), %dD\n\n", this.getX(), this.getY(), this.getZ(), this.t, this.getDim());
    }
}

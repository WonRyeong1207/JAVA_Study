package com.kdt;

/**
 * @PackageName : com.kdt
 * @FileName : EX_Poly2
 * @Date : 25. 2. 21. 오후 4:32
 * @Description <p>
 * <pre>
 * =========================================================
 * DATE                    AUTHOR            NOTE
 * 25. 2. 21. 오후 4:32     WonRyeong1207     FirstCreate
 * ---------------------------------------------------------</pre>
 * @class_purpose : 상속과 다형성
 * @class_name : EX_Poly2
 */

public class EX_Poly2 {
//    // 상속과 다형성 실습
//    // 클래스 메서드
//    // param : Shape instance, Shape's child instance
//    public static void runMethod(Point s) {
//        s.draw();
//        // System.out.println(s.color); Error : color 변수가 없어서
//    }
//    public static void painting(ColorPoint cp) {
//        System.out.println(cp.color+" painting~~");
//    }
//
//    public static void main(String[] args) {
//        Point p1 = new Point();
//        ColorPoint cp1 = new ColorPoint(20, 40, "Red");
//        Point3D pd1 = new Point3D(10, 10, 10);
//
//        // 인스턴스를 매개변수로 가지는 메서드 호출
//        EX_Poly2.runMethod(p1);
//        EX_Poly2.runMethod(cp1);
//        EX_Poly2.runMethod(pd1);
//
//        EX_Poly2.painting(cp1);
//        // EX_Poly2.painting(p1); Error
//    }

    // 오브젝트 상속? <- 최상위 클래스
    // Object Override
    public static void main(String[] args) {

        Point p1 = new Point();

        System.out.println(p1);

    }
}

// parent class
class Point{
    // instance variable
    int x;
    int y;

    public Point() {
        this(0, 0);
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // 최상위 부모 클래스 Object 메서드 재정의
    @Override
    public String toString() {
//        System.out.println("toString()");
//        return super.toString();
        return "Good";
    }

    // method instance
    public void draw() {
        System.out.println("[public] ("+this.x+", "+this.y+")");
    }
}

class ColorPoint extends Point{
    // instance variable
    String color;

    public ColorPoint() {
        this(0, 0, "Black");
    }

    public ColorPoint(int x, int y, String color) {
        super(x, y);
        this.color = color;
    }

    // method instance
    @Override
    public void draw() {
        System.out.println("[public] ("+this.x+", "+this.y+") "+this.color);
    }
}

class Point3D extends Point{
    // instance variable
    int z;

    public Point3D() {
        this(0, 0, 0);
    }

    public Point3D(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }

    // method instance
    @Override
    public void draw() {
        System.out.println("[public] ("+this.x+", "+this.y+", "+this.z+")");
    }
}
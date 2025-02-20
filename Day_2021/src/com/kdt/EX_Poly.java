package com.kdt;

/**
 * @PackageName : com.kdt
 * @FileName : EX_Poly
 * @Date : 25. 2. 21. 오후 3:38
 * @Description <p>
 * <pre>
 * =========================================================
 * DATE                    AUTHOR            NOTE
 * 25. 2. 21. 오후 3:38     WonRyeong1207     FirstCreate
 * ---------------------------------------------------------</pre>
 * @class_purpose : 상속과 다형성
 * @class_name : EX_Poly
 */

public class EX_Poly {

    // 프로그램 진입점 Entry Point
    // [오버라이딩 실습]
//    public static void main(String[] args) {
//
//        // create instance
//        Shape s1 = new Shape();
//        Line l1 = new Line();
//        Rectangle r1 = new Rectangle();
//        Circle c1 = new Circle();
//
//        // call instance method - public
//        s1.draw();
//        l1.draw();
//        r1.draw();
//        c1.draw();
//
//        // 상속
//        l1.printing("yellow");
//        l1.remove(true);
//
//
//    }

    // 클래스 메서드
    // param : Shape instance, Shape's child instance
    public static void runMethod(Shape s) {
        s.draw();
    }
    public static void calc(int num) {
        System.out.println(num*num*num);
    }

    public static void main(String[] args) {

        EX_Poly.calc(7);
        EX_Poly.calc((int)6.5);
        EX_Poly.runMethod(new Shape());
        Shape ss = new Shape();
        EX_Poly.runMethod(ss);

        Line ll = new Line();
        Circle cc = new Circle();

        // Shape을 상속받아서? --- ㅇㅇ
        // 다형성
        EX_Poly.runMethod(ll);
        EX_Poly.runMethod(cc);

    }

}

// 클래스 선언
class Shape{
    // generator method
    Shape(){

    }
    // method instance
    // 모든 사용자 사용허용
    public void draw() {
        System.out.println("[public] Drawing");
    }
    // 본인만 사용
    private void printMessage() {
        System.out.println("[private] *^___^*");
    }
    // 상속 관계, 같은 패키지 사용허용
    void printing(String color) {
        System.out.println("[default] "+color+" shape");
    }
    // 상속관계시 다른 패키지, 같은 패키지에 사용허용
    protected void remove(boolean isall) {
        System.out.println("[protected] 지울까요? " + isall);
    }
}
// Shape 클래스를 상속받는 자식클래스
class Line extends Shape{
    @Override
    public void draw() {
        System.out.println("Draw Blue Line ----------!!");
    }

    @Override
    void printing(String color) {
        System.out.println(color+" Line --------");
    }
}
class Rectangle extends Shape{
    @Override
    public void draw() {
        System.out.println("Draw Red Rectangle ■!!");
    }
}
class Circle extends Shape{
    @Override
    public void draw() {
        System.out.println("Draw Green Circle ●!!");
    }
}

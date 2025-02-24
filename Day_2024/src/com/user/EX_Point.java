package com.user;

/**
 * @PackageName : com.user
 * @FileName : EX_Point
 * @Date : 25. 2. 24.
 * @Description <p>
 * <pre>
 * =========================================================
 * DATE                    AUTHOR            NOTE
 * 25. 2. 24. 오후 3:28     WonRyeong1207     FirstCreate
 * ---------------------------------------------------------</pre>
 * @class_purpose : Point 클래스와 자식 클래스의 Up/Down Casting 실습
 * @class_name : EX_Point
 */
public class EX_Point {

//    // [실습] Up-Casting : 자식/서브 인스턴스를 부모/슈퍼 인스턴스 타입으로 저장
//    //                    접근 가능 멤버 범위 체크
//    public static void main(String[] args) {
//
//        // 일반적인 자식 인스턴스 사용
//        ColorPoint cp1 = new ColorPoint(40, 30, "Yellow");
//
//        cp1.draw();
//        cp1.printInfo();
//        cp1.setColor("Red");
//        cp1.printInfo();
//
//        // 부모 타입의 변수에 자식 인스턴스 저장
//        Point p1 = cp1; // 부모 자식 관계라 가능
//        // 오버라이딩 된 메서드로 사용됨.
//        p1.draw();
//        p1.printInfo();
//        // p1.setColor(); // 자식의 인스턴스를 저장할 수 있지만 변수/메서드를 사용하는 것을 불가능
//
//        System.out.println("p1  -> "+p1);
//        System.out.println("cp1 -> "+cp1);
//
//    }

//    // [실습] Down-Casting : 부모/ 슈퍼 인스턴스를 자식/서브 인스턴스 타입으로 저장
//    //                      조건, 부모/슈퍼 인스턴스는 업캐스팅으로 지정된 인스턴스임
//    public static void main(String[] args) {
//
//        // Up-Casting
//        Point p1 = new ColorPoint(40, 30, "red");
//
//        // p1으로 ColorPoint의 member method 접근 X
//        // Down-Casting : 자식/서브으로 형변환
//        ColorPoint cp2 = (ColorPoint)(p1);
//        p1.printInfo();
//        cp2.setColor("Gold");
//        cp2.printInfo();    // 둘다 골드로 출력됨. 저장소 동기화 상태인듯
//        p1.printInfo();     // 나중에 뭔가를 할때 덮어씌여지지 않도록 주의해야할듯
//        ((ColorPoint)p1).setColor("Pink");
//        p1.printInfo();
//
//    }
    // [실습] instanceof 연산자 : 해당 변수가 특정 클래스로 생성된 인스턴스 여부 검사
    //                   결과 : true, false
    //                   조건 : 부모 자식 관계만 가능!
    public static void main(String[] args) {

        // 인스턴스 생성
        Point p1 = new Point();
        Point p2 = new Point3D();
        Point p3 = new Point4D();

        // ColorPoint p4 = new Point4D(); // 위로는 가능하지만 옆은 안됨
        Point p5 = new ColorPoint();

        // 인스턴스 확인 출력
        // 부모 instanceof 자식
        System.out.print("p1 instanceof Point : ");
        System.out.println(p1 instanceof Point);

        System.out.print("p2 instanceof Point3D : ");
        System.out.println(p2 instanceof Point3D);

        System.out.print("p3 instanceof Point4D : ");
        System.out.println(p3 instanceof Point4D);

        System.out.print("p5 instanceof Point4D : ");
        System.out.println(p5 instanceof Point4D);

    }

}

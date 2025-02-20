/**
 * @FileName : Inheritance
 * @Date : 25. 2. 20. 오후 5:18
 * @Description <p>
 * <pre>
 * =========================================================
 * DATE                    AUTHOR            NOTE
 * 25. 2. 20. 오후 5:18     WonRyeong1207     FirstCreate
 * ---------------------------------------------------------</pre>
 * @class_purpose : 클래스의 상속 관계 알아보기
 * @class_name : Inheritance
 * @class : Inheritance, A, B
 */

// public 클래스는 파읾 명과 같아야함
public class Inheritance {
    // 시작점임.
    public static void main(String[] args) {

        B b1 = new B();
        System.out.println();

        B b2 = new B(2);
        System.out.println();

        B b3 = new B(1, 2, 3);
        System.out.println();
        /*
            A()
            B()

            A()
            B(int c)

            A()
            B(int a, int b, int c)
         */
    }

}

// A
class A {
    private int a;
    int b;

    A() {System.out.println("A()");}
    A(int a) {System.out.println("A(int a)");}
    A(int a, int b) {System.out.println("A(int a, int b)");}
}

// A를 상속받은 B
class B extends A {
    int c;

    B() {System.out.println("B()");}
    B(int c) {System.out.println("B(int c)");}
    B(int a, int b, int c) {
        super(a, b);
        System.out.println("B(int a, int b, int c)");
    }
}

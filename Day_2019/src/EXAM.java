/**
 * PackageName : default
 * FileName    : EXAM
 * Author      : MSI
 * Date        : 25. 2. 19.
 * Description
 * =============================================
 * DATE            AUTHOR          NOTE
 * 25. 2. 19.         MSI         FirstCreate
 * ---------------------------------------------
 * class purpose: run program
 * class name : EXAM
 * class function :
 * class attribute :
 * class method :
 */
public class EXAM {
    /*
    // 실습 1
    public static void main(String[] args) {
        // 구동을 위함
        // 객체 인스턴스 생성
        Variable v1 = new Variable();  // 디폴트 생성자는 없으면 컴파일러가 만들어줌

        // 속성
        System.out.println("name : " + v1.name);

        // 클래스로 속성/변수
        System.out.println("code : " + Variable.code);
    }
     */
    /*
    // 실습 2
    public static void main(String[] args) {
        // create instance
        Variable v1 = new Variable();
        Variable v2 = new Variable("2323");
        Variable v3 = new Variable("haha", "haha");

        // 메서드 호출
        Variable.hello();   // 클래스 메서드
        // 인스턴스 메서드
        v1.printInfo();
        v2.hello(); // 호출은 가능하지만 권장하지 않는 방법
        v3.printInfo();
    }
     */

    // 실습 3번은 Math 클래스 사용이었나봄...
    // 인스턴스를 선언해서 사용하는 것이 아니래.. static으로 만들었다면

    // 실습 4 3번 놓쳤나봄...
    /*
    public static void main(String[] args) {
        // create instance
        Person lee = new Person();
        Person park = new Person("나래", 10, 'F');

        // instance msg
        lee.eat("coffee");
        park.play("study");
        lee.printInfo();

        // 블록 { } : 블럭 내에서만 사용 가능한 지역변수
        {
            String msg = "야구";
        }
        // System.out.println(msg); Error not defined
     }
     */
    // 실습 5
    public static void main(String[] args) {
        // 클래스 속성 출력
        for (int value : StaticBlock.arr) {
            System.out.println(value);
        }
        // instance
        StaticBlock sb = new StaticBlock("kkk", 98);

        System.out.println("name : "+sb.getName()+"\nage : "+sb.getAge());
    }
}

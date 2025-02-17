/**
 * 객체 생성 및 테스트 -> 프로그램 제어 클래스
 */
public class Exam {
    public static void main(String[] args) {
        // Person 인스턴스 생성
        Person Kim = new Person("김유신", 25, 'M', 188.f, 80.f);
        Person ma = new Person("마징가", 17, 'F', 165.f, 72.f);
        Person park = new Person("박지성", 27, 'M',  177.2f, 80.f);

        // call method
        Kim.eat("poo");
        Kim.sleep();

    }
}

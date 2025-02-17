/*
    클래스 정의
    - 속성과 행동/기능 추출
    - 속성 --> 변수
    - 행동/기능 --> 함수
 */

public class EX_Dog_Class {

    // 클래스의 속성(Attribute)
    String kind;    // 품종/종류
    String coat_color;  // 털색상
    String eye_color;   // 눈색상
    float weight;   // 무게

    // 클래스의 메서드(Method)
    // 메서드 기능 : 짖는다
    // 메서드 이룸 : bark
    // 매개변수 : 짖는 소리 -> String sound
    // 메서드 결과 : 없음
    void bark(String sound) {
        System.out.println(sound);
    }

    // 메서드 기능 : 꼬리친다
    // 메서드 이룸 : tailing
    // 매개변수 : 없음
    // 메서드 결과 : 없음
    void tailing() {
        System.out.println("신나게 꼬리친다");
    }

    // 프로그램 시작 및 제어 메서드
    public static void main(String[] args) {

        // 강아지 클래스 인스턴스 생성
        System.out.println("Test");

        // 객체 생성 => 클래스명 변수명 = new 클래스명()
        // 병수명은 메모리 힙에 저장된 객체의 주소를 저장, 레퍼런스 변수
        EX_Dog_Class dog = new EX_Dog_Class();
        System.out.println("dog => "+dog);

        // 객체 속성 값 저장
        dog.coat_color = "Gray";
        dog.eye_color = "blue";
        dog.kind = "kind";
        dog.weight = 2.3f;

        // 객체 메서드 사용
        dog.bark("왈왈");
        dog.tailing();

        }

}

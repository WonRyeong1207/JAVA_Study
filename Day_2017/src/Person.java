/**
 * 사람 데이터를 저장하는 클래스
 * - 속성 : 이름, 나이, 성별, 키, 몸무게
 * - 행동 : 먹는다, 잔다
 */

public class Person {
    // 속성
    String name;    // 이름
    int age;    // 나이
    char gender;    // 성별
    float height;   // 키
    float weight;   // 몸무게

    // 생성자 메서드
    // 기능 : 메모리 힙영역에 객체 생성 시 속성 초기화
    // 이름 : 클래스명과 동일
    // 결과 : 미선언
    Person(String name_, int age_, char gender_, float height_, float weight_) {
        name = name_;
        age = age_;
        gender = gender_;
        height = height_;
        weight = weight_;
    }

    // 메서드
    // 기능 : 먹는다
    // 이름 : eat
    // 매개변수 : 음식명 String food_name
    // 결과 : 없음
    void eat(String food_name) {
        System.out.println(food_name+"을/를 먹는다");
    }

    // 기능 : 잔다
    // 이름 : sleep
    // 매개변수 : 없음
    // 결과 : 없음
    void  sleep() {
        System.out.println(name + "이가 잔다");
    }

}

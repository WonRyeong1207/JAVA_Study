package com.user;

/**
 * @PackageName : com.user
 * @FileName : EX_Final
 * @Date : 25. 2. 25.
 * @Description <p>
 * <pre>
 * =========================================================
 * DATE                    AUTHOR            NOTE
 * 25. 2. 25. 오후 1:34     WonRyeong1207     FirstCreate
 * ---------------------------------------------------------</pre>
 * @class_purpose : final 제어자 실습
 * @class_name : EX_Final
 */

public class EX_Final {

//    // [실습] - final 필드/속성/변수 상수화
//    public static void main(String[] args) {
//        // final attribute => 상수(Constant)
//        String msg = "Good Luck";
//        final int CODE = 82;
//        final String NOTION;
//
//        // 일반 필드/속성/변수 밗 변경 가능
//        msg = "Happy";
//
//        // final 필드/속성/변수 값 변경 불가
//        // CODE = 0; Error
//        NOTION = "KOR"; // 선언만 했을 시에는 1회 초기화 가능
//    }

//    // [실습] - final method
//    public static void main(String[] args) {
//
//        // Person instance
//        Person p1 = new Person("Nana", 10);
//        p1.sleep("bedroom"); // public 이라면 사용 가능
//        p1.eat("chocolate");
//
//    }

    // [실습] - fianl class
    public static void main(String[] args) {
        // final classs
        A a = new A();

        // 최상위 부모 클래스 Object로부터 상속받은 메서드
        System.out.println(a.toString());
    }

}

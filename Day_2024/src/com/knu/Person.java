package com.knu;

/**
 * @PackageName : com.knu
 * @FileName : Person
 * @Date : 25. 2. 24.
 * @Description <p>
 * <pre>
 * =========================================================
 * DATE                    AUTHOR            NOTE
 * 25. 2. 24. 오후 1:19     WonRyeong1207     FirstCreate
 * ---------------------------------------------------------</pre>
 * @class_purpose : 사람 데이터 저장 클래스 => 특징/속성 + 기능/역할
 * @class_name : Person
 * @parents_class : None
 * @class_attribute : 이름(String name), 성별(char gender), 나이(int age)
 * @class_function : 먹는다, 잔다
 * @class_method : generator, getter/setter, eat, sleep
 */
public class Person {
    // member attribute
    // class attribute : 객체 생성 없이 사용 가능. static keyword
    public static final String LOC = "Korea";   // 상수

    // instance attribute : 객체 생성 시 사용 가능
    private String name;
    private int age;
    private char gender;

    // generator method => 클래스 이름과 동일한 이름의 매서드, 반환값 문법 없음
    public Person () {
        this("Unknown", 0, 'N');
    }

    public Person(String name, int age) {
        this(name, age, 'N');
    }

    // 생성자 오버로딩(generator overloading)
    public Person (String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    // getter/setter method => OOB 캡슐화/정보은닉, private 필드/속성, 간접접근용 매서드
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }
    public void setGender(char gender) {
        this.gender = gender;
    }

    // member method
    // class method : 객체 생성 없이 사용 가능 매서드, static keyword
    //                instance 변수/매서드 사용 불가

    // instance method : 객체 생성 시 사용 가능
    /**
    *   @method_purpose : 사람이 먹는 것을 표현
    *   @method_name : eat
    *   @param food
    *   @return %s이가 %s을/를 먹는다
    *   @Description : String food
    */
    public void eat(String food) {
        System.out.printf("%s이가 %s을/를 먹는다\n\n", this.name, food);
    }

    /**
    *   @method_purpose : 사람이 자는 것을 표현
    *   @method_name : sleep
    *   @param where
     *  @param time
    *   @return %s이가 %s에서 %s 동안 자고 있다
    *   @Description : String where, String time
    */
    public void sleep(String where, String time) {
        System.out.printf("%s이가 %s에서 %s 동안 자고 있다\n\n", this.name, where, time);
    }


}

package com.kdt;

/**
 * @PackageName : com.kdt
 * @FileName : Person
 * @Date : 25. 2. 21. 오후 2:20
 * @Description <p>
 * <pre>
 * =========================================================
 * DATE                    AUTHOR            NOTE
 * 25. 2. 21. 오후 2:20     WonRyeong1207     FirstCreate
 * ---------------------------------------------------------</pre>
 * @class_purpose : 사람을 표현하는 클래스
 * @class_name : Person
 * @class_attribute : 이름(String name), 나이(int age), 성별(char gender)
 * @class_function : 먹는다, 잔다
 * @class_method : generator, getter/setter, eat, sleep, printInfo
 */

public class Person {

    // member variable
    private String name;        // 이름
    private int age;            // 나이
    private char gender;        // 성별

    // generator method
    public Person() {
        this("unknown", 0, 'N');
    }

    public Person(String name, int age) {
        this(name, age, 'N');
    }

    public Person(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    // getter/setter
    public String getName() {
        return name;
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
    /**
     *   @method_purpose : 먹는 상태를 표현
     *   @method_name : eat
     *   @param food
     *   @return %s이/가 %s을/를 먹는다
     *   @Description : String food
     */
    public void eat(String food) {
        System.out.printf("%s이/가 %s을/를 먹는다\n\n", this.name, food);
    }

    /**
     *   @method_purpose : 자는 상태를 표현
     *   @method_name : sleep
     *   @param where
     *   @return %s이/가 %s에서 잔다
     *   @Description : String where
     */
    public void sleep(String where) {
        System.out.printf("%s이/가 %s에서 잔다\n\n", this.name, where);
    }
    /**
     *   @method_purpose : 사람 정보를 출력
     *   @method_name : printInfo
     *   @param
     *   @return name: %s, age: %d, gender: %s
     *   @Description : 사람 정보를 출력
     */
    public void printInfo() {
        System.out.printf("name: %s, age: %d, gender: %s\n\n", this.name, this.age, this.gender);
    }
}

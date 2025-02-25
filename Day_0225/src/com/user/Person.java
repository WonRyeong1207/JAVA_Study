package com.user;

/**
 * @PackageName : com.user
 * @FileName : Person
 * @Date : 25. 2. 25.
 * @Description <p>
 * <pre>
 * =========================================================
 * DATE                    AUTHOR            NOTE
 * 25. 2. 25. 오후 1:20     WonRyeong1207     FirstCreate
 * ---------------------------------------------------------</pre>
 * @class_purpose : 사람의 정보를 표현하는 클래스
 * @class_name : Person
 * @parents_class : None
 * @class_attribute : final String LOC(국적) String name(이름), int age(나이)
 * @class_function : 먹는다, 잔다, 정보 출력
 * @class_method : generator, getter/setter, eat, sleep, printInfo
 */

public class Person {
    // member attribute
    // class attribute
    public static final String LOC = "Korea";

    // instance attribute
    private String name;
    private int age;

    // generator method
    // default Constructor
    public Person() {
        this("Unknown", 0);
    }
    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    // getter/setter method
    public String getName() {
        return this.name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    // member method
    // instance method
    // - final method
    /**
    *   @method_purpose : 사람이 자는 것을 표현
    *   @method_name : sleep
    *   @param where
    *   @return "%s이가 %s에서 잔다"
    *   @Description : String where
    */
    final public void sleep(String where) {
        System.out.printf("%s이가 %s에서 잔다\n", this.name, where);
    }

    /**
    *   @method_purpose : 사람이 먹는 것을 표현
    *   @method_name : eat
    *   @param food
    *   @return "%s이가 %s을/를 먹는다"
    *   @Description : String food
    */
    public void eat(String food) {
        System.out.printf("%s이가 %s을/를 먹는다\n", this.name, food);
    }

    /**
    *   @method_purpose : 정보출력
    *   @method_name : printInfo
    *   @param
    *   @return name, age, LOC
    *   @Description :
    */
    public void printInfo() {
        System.out.printf("name: %s\n", this.name);
        System.out.printf("age: %d\n", this.age);
        System.out.printf("LOC: %s\n", LOC);
    }
}

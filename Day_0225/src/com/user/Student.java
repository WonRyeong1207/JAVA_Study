package com.user;

/**
 * @PackageName : com.user
 * @FileName : Student
 * @Date : 25. 2. 25.
 * @Description <p>
 * <pre>
 * =========================================================
 * DATE                    AUTHOR            NOTE
 * 25. 2. 25. 오후 1:43     WonRyeong1207     FirstCreate
 * ---------------------------------------------------------</pre>
 * @class_purpose : 학생 정보를 표현하는 클래스
 * @class_name : Student
 * @parents_class : Person
 * @class_attribute : name(String), age(int), LOC(String), school(String), grade(int)
 * @class_function : 상받는다, 먹는다(재정의)
 * @class_method : generator, getter/setter, reward, eat
 */

public class Student extends Person{
    // member attribute
    private String school;
    private int grade;

    // generator method
    public Student() {
        this("Unknown", 0, "None", 0);
    }

    public Student(String name, int age, String school, int grade) {
        super(name, age);
        this.school = school;
        this.grade = grade;
    }

    // getter/setter
    public String getSchool() {
        return school;
    }
    public void setSchool(String school) {
        this.school = school;
    }

    public int getGrade() {
        return grade;
    }
    public void setGrade(int grade) {
        this.grade = grade;
    }

    // member method
    /**
    *   @method_purpose : 상을 받는다
    *   @method_name : reward
    *   @param what
    *   @return "%s이가 %s을/를 받는다"
    *   @Description : 상을 받음
    */
    public void reward(String what) {
        System.out.printf("%s이가 %s을/를 받는다\n", this.getName(), what);
    }

    /**
    *   @method_purpose : 상속받은 eat 재정의
    *   @method_name : eat
    *   @param food
    *   @return "%s이가 %s을/를 요리해서 먹는다"
    *   @Description : '먹는다'를 '요리해서 먹는다'로 수정
    */
    @Override
    public void eat(String food) {
        System.out.printf("%s이가 %s을/를 요리해서 먹는다\n", this.getName(), food);
    }
}

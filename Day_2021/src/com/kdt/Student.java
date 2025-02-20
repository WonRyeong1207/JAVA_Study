package com.kdt;

/**
 * @PackageName : com.kdt
 * @FileName : Student
 * @Date : 25. 2. 21. 오후 1:18
 * @Description <p>
 * <pre>
 * =========================================================
 * DATE                    AUTHOR            NOTE
 * 25. 2. 21. 오후 1:18     WonRyeong1207     FirstCreate
 * ---------------------------------------------------------</pre>
 * @class_purpose : 학생을 표현하는 클래스
 * @class_name : Student
 * @parents_class : Person
 * @class_attribute : 이름(String name), 나이(int age), 성별(char gender), 학교명(String school), 학년(int grade)
 * @class_function : 학생의 행동을 표현, 먹는다, 잔다, 공부한다. 시험친다
 * @class_method : generator, getter/setter, eat, sleep, study, test, printInfo
 */

public class Student extends Person{
    // member variable
    private String school;      // 학교명
    private int grade;          // 학년

    // generator method
    public Student() {
        this("unknown", 0, 'N', "unknown", 0);
    }

    public Student(String name, int age, char gender) {
        super(name, age, gender);
        this.school = "unknown";
        this.grade = 0;
    }

    public Student(String name, int age, String school) {
        super(name, age);
        this.school = school;
    }

    public Student(String name, int age, char gender, String school, int grade) {
        super(name, age, gender);
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
     *   @method_purpose : 공부 상태를 표현
     *   @method_name : study
     *   @param subject
     *   @return %s이/가 %s을/를 공부한다
     *   @Description : String subject
     */
    public void study(String subject) {
        System.out.printf("%s이/가 %s을/를 공부한다\n\n", getName(), subject);
    }

    /**
     *   @method_purpose : 시험상태를 표현
     *   @method_name : test
     *   @param subject
     *   @return %s이/가 %s을/를 시험친다
     *   @Description : String subject
     */
    public void test(String subject) {
        System.out.printf("%s이/가 %s을/를 시험친다\n\n", getName(), subject);
    }
    /**
     *   @method_purpose : 학생 정보를 출력
     *   @method_name : printInfo
     *   @param
     *   @return name: %s, age: %d, gender: %s, school: %s, grade: %d
     *   @Description : 학생 정보를 출력
     */
    public void printInfo() {
        System.out.printf("name: %s\n, age: %d\n, gender: %s\n, school: %s\n, grade: %d\n\n",
                getName(), getAge(), getGender(), this.school, this.grade);
    }


}

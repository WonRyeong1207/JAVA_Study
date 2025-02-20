package com.kdt;

/**
 * @PackageName : com.kdt
 * @FileName : Fireman
 * @Date : 25. 2. 21. 오후 1:19
 * @Description <p>
 * <pre>
 * =========================================================
 * DATE                    AUTHOR            NOTE
 * 25. 2. 21. 오후 1:19     WonRyeong1207     FirstCreate
 * ---------------------------------------------------------</pre>
 * @class_purpose : 소방관을 표현하는 클래스
 * @class_name : Fireman
 * @parents_class : Person
 * @class_attribute : 이름(String name), 나이(int age), 성별(char gender), 소속(String group), 직급(String grade)
 * @class_function : 소방관의 행동을 표현, 먹는다, 잔다, 불끈다, 점검한다
 * @class_method : generator, getter/setter, eat, sleep, extinguish, check, printInfo
 */

public class Fireman extends Person{

    // member variable
    private String group;       // 소속
    private String grade;       // 직급

    // generator method
    public Fireman() {
        this("unknown", 0, 'N', "unknown", "none");
    }
    // OverLoading
    public Fireman(String name, int age, char gender) {
        super(name, age, gender);
    }

    public Fireman(String name, int age, String group) {
        super(name, age);
        this.group = group;
    }

    public Fireman(String name, int age, char gender, String group, String grade) {
        super(name, age, gender);
        this.group = group;
        this.grade = grade;
    }
    // getter/setter
    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    // member method
    /**
     *   @method_purpose : 불을 끈다
     *   @method_name : extinguish
     *   @param where
     *   @return %s이/가 %s에서 불을 끈다
     *   @Description : String where
     */
    public void extinguish(String where) {
        System.out.printf("%s이/가 %s에서 불을 끈다\n\n", getName(), where);
    }
    /**
     *   @method_purpose : 점검 상태 표현
     *   @method_name : check
     *   @param where
     *   @return %s이/가 %s을/를 점검한다
     *   @Description : String where
     */
    public void check(String where) {
        System.out.printf("%s이/가 %s을/를 점검한다\n\n", getName(), where);
    }
    /**
     *   @method_purpose : 소방관 정보를 출력
     *   @method_name : printInfo
     *   @param
     *   @return name: %s, age: %d, gender: %s, group: %s, grade: %s
     *   @Description : 소방관 정보를 출력
     */
    public void printInfo() {
        System.out.printf("name: %s\n, age: %d\n, gender: %s\n, group: %s\n, grade: %s\n\n",
                getName(), getAge(), getGender(), this.group, this.grade);
    }
}

package com.kdt;

/**
 * @PackageName : com.kdt
 * @FileName : Doctor
 * @Date : 25. 2. 21. 오후 1:19
 * @Description <p>
 * <pre>
 * =========================================================
 * DATE                    AUTHOR            NOTE
 * 25. 2. 21. 오후 1:19     WonRyeong1207     FirstCreate
 * ---------------------------------------------------------</pre>
 * @class_purpose : 의사을 표현하는 클래스
 * @class_name : Doctor
 * @parents_class : Person
 * @class_attribute : 이름(String name), 나이(int age), 성별(char gender), 전공(String major), 경력(int career)
 * @class_function : 의사의 행동을 표현, 먹는다, 잔다, 수술한다, 진료한다
 * @class_method : generator, getter/setter, eat, sleep, operate, attention, printInfo
 */

public class Doctor extends Person{

    // member variable
    private String major;       // 전공
    private int career;         // 경력

    // generator method
    public Doctor() {
        this("unknown", 0, 'N', "unknown", 0);
    }

    public Doctor(String name, int age, char gender) {
        super(name, age, gender);
        this.major = "unknown";
        this.career = 0;
    }

    public Doctor(String name, int age, String major) {
        super(name, age);
        this.major = major;
    }

    public Doctor(String name, int age, char gender, String major, int career) {
        super(name, age, gender);
        this.major = major;
        this.career = career;
    }
    // getter/setter
    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }
    public int getCareer() {
        return career;
    }

    public void setCareer(int career) {
        this.career = career;
    }

    // member method
    /**
     *   @method_purpose : 수술상태를 표현
     *   @method_name : operate
     *   @param where
     *   @return %s이/가 %s을/를 수술한다
     *   @Description : String where
     */
    public void operate(String where) {
        System.out.printf("%s이/가 %s을/를 수술한다\n\n", getName(), where);
    }

    /**
     *   @method_purpose : 진료상태를 표현
     *   @method_name : attention
     *   @param who
     *   @return s이/가 %s을/를 진료한다
     *   @Description : String who%
     */
    public void attention(String who) {
        System.out.printf("%s이/가 %s을/를 진료한다\n\n", getName(), who);
    }
    /**
     *   @method_purpose : 의사 정보를 출력
     *   @method_name : printInfo
     *   @param
     *   @return name: %s, age: %d, gender: %s, major: %s, career: %d
     *   @Description : 의사 정보를 출력
     */
    public void printInfo() {
        System.out.printf("name: %s\n, age: %d\n, gender: %s\n, major: %s\n, career: %d\n\n",
                getName(), getAge(), getGender(), this.major, this.career);
    }
}

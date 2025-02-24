package com.knu;

/**
 * @PackageName : com.knu
 * @FileName : Doctor
 * @Date : 25. 2. 24.
 * @Description <p>
 * <pre>
 * =========================================================
 * DATE                    AUTHOR            NOTE
 * 25. 2. 24. 오후 1:43     WonRyeong1207     FirstCreate
 * ---------------------------------------------------------</pre>
 * @class_purpose : 의사 데이터 저장 클래스
 * @class_name : Doctor
 * @parents_class :Person
 * @class_attribute : 이름, 성별, 나이, 진료과목/전공(String major)
 * @class_function : 먹는다, 잔다, 진료한다
 * @class_method : generator, getter/setter, operate
 */
public class Doctor extends Person{
    // member method
    // instance attribute
    private String major;

    // generator method
    public Doctor() {
        this("Unknown", 0, 'N', "None");
    }

    public Doctor(String name, int age, String major) {
        super(name, age);
        this.major = major;
    }

    public Doctor(String name, int age, char gender, String major) {
        super(name, age, gender);
        this.major = major;
    }

    // getter/setter
    public String getMajor() {
        return major;
    }
    public void setMajor(String major) {
        this.major = major;
    }

    // member method
    /**
    *   @method_purpose : 의사가 수술하는 것을 표현
    *   @method_name : operate
    *   @param op_name
    *   @return %s 수술진행 : %s 수술
    *   @Description : String op_name
    */
    public void operate(String op_name) {
        System.out.printf("%s 수술진행 : %s 수술\n\n", this.major, op_name);
    }

}

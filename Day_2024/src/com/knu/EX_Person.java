package com.knu;

/**
 * @PackageName : com.knu
 * @FileName : EX_Person
 * @Date : 25. 2. 24.
 * @Description <p>
 * <pre>
 * =========================================================
 * DATE                    AUTHOR            NOTE
 * 25. 2. 24. 오후 1:50     WonRyeong1207     FirstCreate
 * ---------------------------------------------------------</pre>
 * @class_purpose : Up-casting 실습
 * @class_name : EX_Person
 */
public class EX_Person {
    public static void main(String[] args) {
        // Up-casting : 자식 인스턴스 -> 부모 인스턴스 변환
        Doctor doc = new Doctor("Hwang", 50, 'W', "orthopedy");
        // 부모 자식 관계라 가능!
        Person p1 = doc;
        Person p2 = new Doctor("Ma", 52, 'M', "orthopedy");

        // 접근할 수 있는 멤버의 범위
        System.out.println(doc.getMajor());          // Doctor member method
        doc.operate("관절");                 // Doctor member method
        doc.sleep("room", "3 hour");     // Doctor's parent member method

        // 자식 인스턴스 사용 불가
        // System.out.println(p1.getMajor());   // Error



    }

}

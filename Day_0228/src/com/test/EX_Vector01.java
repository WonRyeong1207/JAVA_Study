package com.test;

import java.util.Vector;

/**
 * @PackageName : com.test
 * @FileName : EX_Vector01
 * @Date : 25. 2. 28.
 * @Description <p>
 * <pre>
 * =========================================================
 * DATE                    AUTHOR            NOTE
 * 25. 2. 28. 오후 4:03     WonRyeong1207     FirstCreate
 * ---------------------------------------------------------
 * Vector class in Collection package
 * - 배열의 고정 길이에 따른 제한을 해결하기 위한 클래스</pre>
 * @class_purpose : Collection Package Vector Class
 * @class_name : EX_Vector01
 */

public class EX_Vector01 {
    public static void main(String[] args) {
        // create Vector instance
        Vector<Integer> data = new Vector<Integer>(3);  // initialCapacity <- default 10

        // 용량 및 사이즈 체크
        System.out.printf("저장가능 용량 capacity: %d\n", data.capacity());   // 기본 10개로 만들어짐
        System.out.printf("저장된 원소 용량 size : %d\n\n", data.size());

        // 원소 추가
        data.add(10);   // Automatic Boxing
        data.add(8);
        data.add(-3);
        System.out.println("원소 추가");
        System.out.printf("저장가능 용량 capacity: %d\n", data.capacity());
        System.out.printf("저장된 원소 용량 size : %d\n\n", data.size());

        for (int i=10; i<=100; i+=10) {
            data.add(i);
        }
        System.out.println("원소 추가");
        System.out.printf("저장가능 용량 capacity: %d\n", data.capacity());   // 정한 용량의 배수로 늘어남, 0이라면 2의 배수로 늘어남
        System.out.printf("저장된 원소 용량 size : %d\n\n", data.size());

        // 원소 삭제
        // remove~~()
        System.out.printf("data : %s\n", data);
        data.remove(2);
        System.out.println("원소 삭제 index 2");
        System.out.printf("저장된 원소 용량 size : %d\n", data.size());
        System.out.printf("data : %s\n\n", data);

        data.removeLast();
        System.out.println("원소 삭제 removeLast");
        System.out.printf("저장된 원소 용량 size : %d\n", data.size());
        System.out.printf("data : %s\n\n", data);

        data.clear();
        System.out.println("원소 삭제 clear");
        System.out.printf("저장된 원소 용량 size : %d\n", data.size());
        System.out.printf("data : %s\n\n", data);


    }
}

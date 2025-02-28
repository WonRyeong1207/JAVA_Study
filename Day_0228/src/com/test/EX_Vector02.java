package com.test;

import com.model.Point;

import java.util.Vector;

/**
 * @PackageName : com.test
 * @FileName : EX_Vector02
 * @Date : 25. 2. 28.
 * @Description <p>
 * <pre>
 * =========================================================
 * DATE                    AUTHOR            NOTE
 * 25. 2. 28. 오후 4:18     WonRyeong1207     FirstCreate
 * ---------------------------------------------------------</pre>
 * Vector class in Collection package
 * - 배열의 고정 길이에 따른 제한을 해결하기 위한 클래스</pre>
 * @class_purpose : Collection Package Vector Class
 * @class_name : EX_Vector02
 */

public class EX_Vector02 {
    /**
    *   @method_purpose : vector의 정보 출력
    *   @method_name : printInfo
    *   @param v
    *   @return void
    *   @Description : Vector<Point>타입을 변수로 받음
    */
    public static void printInfo(Vector<Point> v) {
        System.out.printf("저장가능 용량 : %d, 저장된 원소 용량 :%d\n", v.capacity(), v.size());
        System.out.printf("data : %s\n\n", v);
    }

    public static void main(String[] args) {
        // create Vector instance
        Vector<Point> data = new Vector<Point>();  // initialCapacity <- default 10

        // 용량 및 사이즈 체크
        EX_Vector02.printInfo(data);

        // 원소 추가
        data.add(new Point(5,5));
        data.add(new Point());
        EX_Vector02.printInfo(data);

        data.add(new Point(-2,4));
        data.add(new Point(9, -3));
        EX_Vector02.printInfo(data);

        //


    }
}
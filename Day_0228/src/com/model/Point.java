package com.model;

import java.util.Objects;

/**
 * @PackageName : com.model
 * @FileName : Point
 * @Date : 25. 2. 28.
 * @Description <p>
 * <pre>
 * =========================================================
 * DATE                    AUTHOR            NOTE
 * 25. 2. 28. 오후 1:31     WonRyeong1207     FirstCreate
 * ---------------------------------------------------------</pre>
 * @class_purpose : 2차원 좌표값 저장 표현 클래스
 * @class_name : Point
 * @parents_class : None
 * @class_attribute : x, y
 * @class_function : 점 그리기, 인스턴스 설명기능 <- Object의 toString overriding
 * @class_method : constructor, getter/setter, drawing, toString(overriding)
 */

public class Point {
    // member attribute
    private int x;
    private int y;

    // constructor method
    public Point() {
        this(0, 0);
    }

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // getter/setter
    public int getX() {
        return this.x;
    }
    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return this.y;
    }
    public void setY(int y) {
        this.y = y;
    }

    // Overriding method
    /**
    *   @method_purpose : 인스턴스 정보 출력
    *   @method_name : toString
    *   @param
    *   @return String
    *   @Description : Object 클래스의 toString()을 Overriding
    */
    @Override
    public String toString() {
        // return super.toString();    // 기본값: com.model.Point@6f539caf
//        return "2D Point -> {" + "x=" + this.x +
//                ", y=" + this.y + '}';
        return "("+this.x+", "+this.y+")";
    }

    /**
    *   @method_purpose : 비교? 출력
    *   @method_name : equals
    *   @param obj
    *   @return
    *   @Description : Object 클래스의 equals를 Overriding
    */
    @Override
    public boolean equals(Object obj) {
        // return super.equals(obj);

        // 본인이랑 클래스 정보가 다르면 다르다고 함.
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        } else {
            Point point = (Point) obj;  // down-casting
            return this.x == point.getX() && this.y == point.getY();
        }

//        // Down-Casting
//        Point pobj = (Point) obj;   // 부모를 자식 클래스로 캐스팅
//
//        // Point 인스턴스의 좌표값을 비교해서 결과 출력
//        if ((this.x == pobj.getX()) && (this.y == pobj.getY())) {
//            return true;
//        } else {
//            return false;
//        }

    }

    /**
    *   @method_purpose :
    *   @method_name : hashCode
    *   @param
    *   @return
    *   @Description : Object 틀래스dml hasCode를 Overriding
    */
    @Override
    public int hashCode() {
        return super.hashCode();
        // return Objects.hash(x, y);
    }
    // member method
    /**
    *   @method_purpose : 점 그리기
    *   @method_name : drawing
    *   @param
    *   @return void
    *   @Description : 좌표에 점을 그림
    */
    public void drawing() {
        System.out.printf("● -> point (%d, %d)\n", this.x, this.y);
    }

}

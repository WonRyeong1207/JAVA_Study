/**
 * @FileName : ColorPoint
 * @Date : 25. 2. 20. 오후 4:20
 * @Description <p>
 * <pre>
 * =========================================================
 * DATE                    AUTHOR            NOTE
 * 25. 2. 20. 오후 4:20     WonRyeong1207     FirstCreate
 * ---------------------------------------------------------</pre>
 * @parants_class : Point
 * @class_purpose : 평면 좌표에 찍히는 점 정보 저장 클래스
 * @class_name : ColorPoint
 * @class_attribute : int x, int y
 * @class_function : 해당하는 좌표의 점을 찍음, 정보출력
 * @class_method : getter/setter, getInfo, drawingColor
 */

public class ColorPoint extends Point {
    // member variable
    // class variable

    // instance variable
//    private int x;
//    private int y;
    private String color;

    // generator method
    public ColorPoint() {
        this(0, 0, "black");
    }

    public ColorPoint(int x, int y, String color) {
//        this.setX(x);
//        this.setY(y);
        // 상속받아서 사용. 컴파일러가 없으면 부모꺼 부름
        // super() 내가 원하는 것만 사용하려고
        // 젤 먼저 나와야함
        super(x, y, "rectangle");
        this.color = color;
        System.out.println("CP");
    }

    // getter/setter
//    public int getX() {
//        return x;
//    }
//
//    public void setX(int x) {
//        this.x = x;
//    }
//
//    public int getY() {
//        return y;
//    }
//
//    public void setY(int y) {
//        this.y = y;
//    }
//
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
// member method
    /**
     *   @method_purpose : 컬러 출력
     *   @method_name : drawingColor
     *   @param
     *   @return void
     *   @Description : 컬러 출력
     */
    public void drawingColor() {
        // System.out.println(this.color);
        System.out.println("("+ this.getX() +", "+this.getY()+") "+this.color+", "+this.type);
    }

    /**
     *   @method_purpose : 정보 전달
     *   @method_name : getInfo
     *   @param
     *   @return string
     *   @Description : print 하지 않고 정보 전달
     */
    public String getInfo() {
        return this.color;
    }

}

/**
 * @FileName : Point
 * @Date : 25. 2. 20. 오후 4:06
 * @Description <p>
 * <pre>
 * =========================================================
 * DATE                    AUTHOR            NOTE
 * 25. 2. 20. 오후 4:06     WonRyeong1207     FirstCreate
 * ---------------------------------------------------------</pre>
 * @class_purpose : 평면 좌표에 찍히는 점 정보 저장 클래스
 * @class_name : Point
 * @class_attribute : int x, int y, String type
 * @class_function : 해당하는 좌표의 점을 찍음, 정보출력
 * @class_method : getter/setter, getInfo, drawingPoint
 */

public class Point {
    // member variable
    // class variable

    // instance variable
    private int x;
    private int y;
    String type; // pointer shape

    // generator method
    public Point() {
        this(0,0, "circle");
    }

    public Point(int x, int y, String type) {
        this.x = x;
        this.y = y;
        this.type = type;
        System.out.println("P");
    }

    // getter/setter
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    // member method
    /**
     *   @method_purpose : 점 그리기
     *   @method_name : drawingPoint
     *   @param
     *   @return void
     *   @Description : (x, y) '●' 출력
     */
    public void drawingPoint() {
        System.out.println("("+this.x+", "+this.y+") "+"●");
    }

    /**
     *   @method_purpose : 정보 전달
     *   @method_name : getInfo
     *   @param
     *   @return string
     *   @Description : print 하지 않고 정보 전달
     */
    public String getInfo() {
        return "("+this.x+", "+this.y+") "+this.type;
    }

}

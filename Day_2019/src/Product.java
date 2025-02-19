/**
 * @FileName : Product
 * @Date : 25. 2. 19. 오후 5:04
 * @Description <p>
 * <pre>
 * =========================================================
 * DATE                    AUTHOR            NOTE
 * 25. 2. 19. 오후 5:04     WonRyeong         FirstCreate
 * ---------------------------------------------------------</pre>
 * @class_purpose : { }을 활용하여 제품 번호를 지정해보기
 * @class_name : Product
 * @class_attribute : int count, int serialNo
 * @class_function : 초기화 블록을 이용하여 제품번호 지정
 * @class_method : getter, main
 */

public class Product {
    static int count = 0;
    private int serialNo;

    {
        ++count;
        serialNo = count;
    }
    public Product() { }

    public int getSerialNo() {
        return this.serialNo;
    }

    public static void main(String[] args) {

    }
}

package message;

/**
 * @PackageName : message
 * @FileName : Msg
 * @Date : 25. 2. 27.
 * @Description <p>
 * <pre>
 * =========================================================
 * DATE                    AUTHOR            NOTE
 * 25. 2. 27. 오후 5:32     WonRyeong1207     FirstCreate
 * ---------------------------------------------------------</pre>
 * @class_purpose : 프린트할 문자들을 정리한 클래스
 * @class_name : Msg
 */

public class Msg {
    // member attribute message
    public static final String W_21 = "등록된 계좌가 없습니다.\n";
    public static final String W_35_WA = "계좌번호가 일치하지 않습니다.\n다시 시도해주세요\n";

    public static final String W_D = "서비스 선택이 잘못 되었습니다.\n";
    public static final String W_E = "서비스를 종료합니다.\n";

    public static final String E_IE = "정수만 입력 가능합니다.\n";
    public static final String E_E = "예상 못한 문제가 발생했습니다.\n";

    // member method print message
    /**
    *   @method_purpose : 입력된 문자열을 출력
    *   @method_name : msg
    *   @param code
    *   @return System.out.println(code)
    *   @Description : code를 입력받아 문자열을 출력
    */
    public static void msg(String code) {
        System.out.println(code);
    }

}

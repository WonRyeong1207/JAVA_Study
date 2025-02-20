/**
 * @FileName : Card
 * @Date : 25. 2. 20. 오후 1:07
 * @Description <p>
 * <pre>
 * =========================================================
 * DATE                    AUTHOR            NOTE
 * 25. 2. 20. 오후 1:07     WonRyeong1207     FirstCreate
 * ---------------------------------------------------------</pre>
 * @class_purpose : 트럼프 카드 타입
 * @class_name : Card
 * @class_attribute : 카드 모양(♥, ♠, ◆, ♣), 카드 숫자 (1 ~ 10, J, Q, K), 카드[모양(kind), 숫자(number)]
 * @class_function : 카드 정보. 즉, 숫자와 무늬가 저장된 카드. 현재 카드 정보 출력
 * @class_method : generator, getter/setter, showCard
 */

public class Card {

    // member variable
    // - class variable
    static final int KIND_NUM = 4;  // 카드 무늬 종류의 수
    static final int NUM_MAX = 13;  // 무늬별 카드 개수

    // 카드 무늬 변수
    static final char HEART = '♥';
    static final char SPADE = '♠';
    static final char DIAMOND = '◆';
    static final char CLOVER  = '♣';

    // - instance variable
    private int number;
    private char kind;

    // generator method
    public Card() {
        this(HEART, 1);
    }

    public Card(char kind, int number) {
        this.kind = kind;
        this.number = number;
    }

    // member method
    /**
     *   @method_purpose : 카드 정보를 출력
     *   @method_name : printInfo
     *   @param
     *   @return
     *   @Description : parameter & return None
     */
    public void printInfo() {
        System.out.printf("kind : %s, number : %d\n", this.kind, this.number);
        // return this.kind + ", " + this.number;
    }

}

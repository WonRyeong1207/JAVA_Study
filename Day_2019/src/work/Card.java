package work;

/**
 * @PackageName : work
 * @FileName : Card
 * @Date : 25. 2. 19. 오후 5:12
 * @Description <p>
 * <pre>
 * =========================================================
 * DATE                    AUTHOR            NOTE
 * 25. 2. 19. 오후 5:12     WonRyeong         FirstCreate
 * ---------------------------------------------------------</pre>
 * @class_purpose : 카드 클래스 생성
 * @class_name : Card
 * @class_attribute : 카드 모양(♥, ♠, ◆, ♣), 카드 숫자 (1 ~ 10, J, Q, K), 카드[모양, 숫자]
 * @class_function : 카드 객체 저장?
 * @class_method : getter/setter, generator, show card
 */

public class Card {
    // member variable
    private final char[] CARD_SHAPE = {'♥', '♠', '◆', '♣'};
    private final char[] CARD_NUMBER = {'A', '2', '3', '4', '5',
                                        '6', '7', '8', '9', '1'+'0',
                                        'J', 'Q', 'K'};
    private StringBuilder current_card; // 카드 문양을 합치려고
    private String[] card;

    // generator
    Card()
    {
        current_card = new StringBuilder();
        card = new String[4*13+2];
        card[0] = "black joker";
        card[1] = "color joker";

        int count = 2;
        for (int i=0; i<CARD_SHAPE.length; i++) {
            for (int j=0; j<CARD_NUMBER.length; j++) {
                // 현재카드 초기화
                current_card.delete(0, current_card.length());
                // 카드 문양 합치기
                current_card.append(CARD_SHAPE[i]);
                current_card.append(" ");
                current_card.append(CARD_NUMBER[j]);
                // 현재 카드 저장
                card[count] = current_card.toString();
                count++;
            }
        }
    }

    // getter
    public String[] getCard() {
        return card;
    }

    // member method
    /**
     *   @method_purpose : 프럼트 카드를 전부 보여주는 메서드
     *   @method_name : showCard
     *   @param
     *   @return None
     *   @Description : 조커 2장 까지 모두 보여줌
     */
    public void showCard() {
        for (String cards : card){
            System.out.println(cards);
        }
    }

    public static void main(String[] args) {
        Card c1 = new Card();
        c1.showCard();
    }
}

/**
 * @FileName : Deck
 * @Date : 25. 2. 20. 오후 1:39
 * @Description <p>
 * <pre>
 * =========================================================
 * DATE                    AUTHOR            NOTE
 * 25. 2. 20. 오후 1:39     WonRyeong1207     FirstCreate
 * ---------------------------------------------------------</pre>
 * @class_purpose : 카드 52장을 담고 카드를 1장씩 꺼냄
 * @class_name : Deck
 * @class_attribute : 카드 52장
 * @class_function : 카드 섞기, 카드 꺼내기
 * @class_method : cardShuffle, cardDrop, getter
 */

public class Deck {
    // member variable
    // class variable - 공통 속성
    public static final int D_SIZE = 52;    // 모든 인스턴스에서 공유, 변경 불가능

    // instance variable - 변수마다 바뀌는 속성
    private Card[] arr_card = new Card[52]; // 카드 껍데기만 생성된 상태
    private int pick_num;

    // generator method
    public Deck() {
        // 52장의 카드 인스턴스 생성 후 저장
        char[] kind_arr = {Card.HEART, Card.SPADE, Card.DIAMOND, Card.CLOVER};
        // 카드 무늬당 13장인 것을 이용
        for (int K_num=0; K_num<kind_arr.length; K_num++) {
            for (int num=0; num<Card.NUM_MAX; num++) {
                arr_card[(K_num*Card.NUM_MAX) + num] = new Card(kind_arr[K_num], num+1);
            }
        }

    }

    // getter
    public Card[] getArr_card() {
        return this.arr_card;
    }

    // member method
    /**
     *   @method_purpose : 카드를 섞는다
     *   @method_name : cardShuffle
     *   @param
     *   @return void
     *   @Description : 무작위로 카드를 섞음
     */
    public void cardShuffle() {
        // Math class의 random method를 이용
        double ran_num;
        int card_idx;
        Card carry = new Card();

        for (int i=0; i<Deck.D_SIZE; i++) {
            ran_num = Math.random();
            card_idx = (int)(ran_num*Deck.D_SIZE);
            // backup
            // System.out.println("arr_card["+i+"] : "+this.arr_card[i]);
            carry = this.arr_card[i];

            // shuffle
            // System.out.println("arr_card["+card_idx+"] : "+this.arr_card[card_idx]);
            this.arr_card[i] = this.arr_card[card_idx];
            this.arr_card[card_idx] = carry;

            // System.out.println();
        }
    }

    /**
     *   @method_purpose : 카드를 한 장 준다
     *   @method_name : cardDrop
     *   @param
     *   @return Card
     *   @Description : 카드를 한장 뽑아 준다
     */
    public Card cardDrop() {
        // 카드를 뽑는 숫자
        pick_num = (int)(Math.random()*arr_card.length);    // card 빼는건 모르는데?
        return arr_card[pick_num];
    }

    /**
     *   @method_purpose : 카드를 확인
     *   @method_name : checkCard
     *   @param
     *   @return void
     *   @Description : 덱의 상태를 확인
     */
    public void checkCard() {
        // check card
        for (Card card : this.arr_card) {
            card.printInfo();
        }
    }

}

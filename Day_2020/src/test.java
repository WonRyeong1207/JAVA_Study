/**
 * @FileName : test
 * @Date : 25. 2. 20. 오후 2:22
 * @Description <p>
 * <pre>
 * =========================================================
 * DATE                    AUTHOR            NOTE
 * 25. 2. 20. 오후 2:22     WonRyeong1207     FirstCreate
 * ---------------------------------------------------------</pre>
 * @class_purpose : 클래스 작동 테스트
 * @class_name : test
 */

public class test {

    public static void main(String[] args) {

        Deck deck = new Deck();
        // 카드가 전부 잘 출력 되는지 확인
//        for (Card cd : deck.getArr_card()) {
//            cd.printInfo();
//        }

        // 카드 섞기 위한 random test
        // 중복은 어떻게 제거하지?
//        for (int n=0; n<5; n++) {
//            for (int i=0; i<5; i++) {
//                double ran_num = Math.random();
//                System.out.print((int)(ran_num*45+1)+" ");
//            }
//            System.out.println();
//        }

//        for (int i=0; i<52; i++) {
//            double ran_num = Math.random();
//            System.out.println((int)(ran_num*52));
//        }

//        deck.cardShuffle();
//        //deck.checkCard();
//
//        for (int i=0; i<5; i++) {
//            Card choice_card = deck.cardDrop();
//            choice_card.printInfo();
//        }

        Point p1 = new Point();
        p1.drawingPoint();

        ColorPoint cp1 = new ColorPoint(10, 50,"red");
        /*
            P - 부모클래스
            CP - 자식클래스
            부모클래스가 먼저 생성된 후에 자식클래스가 생성됨
         */
        cp1.drawingPoint();
        cp1.drawingColor();

        // 두 틀래스에 같은 메서드가 있을때는 자식 클래스 먼저 사용됨
        System.out.println(cp1.getInfo());

        // 속성사용
        // 없으면 부모 클래스 실행
        cp1.setX(50);
        cp1.setY(30);

        cp1.type = "triangle";
        cp1.drawingColor();


    }

}

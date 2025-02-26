package com.pay;

import java.util.Scanner;

/**
 * @PackageName : com.pay
 * @FileName : PaySystem
 * @Date : 25. 2. 26.
 * @Description <p>
 * <pre>
 * =========================================================
 * DATE                    AUTHOR            NOTE
 * 25. 2. 26. 오후 3:10     WonRyeong1207     FirstCreate
 * ---------------------------------------------------------
 * - 사용자로부터 결제 방식 선택
 * - 선택 방식에 따른 결제 진행</pre>
 * @class_purpose : 결제 시스템 구현
 * @class_name : PaySystem
 * @parents_class : None
 * @class_attribute :
 * @class_function :
 * @class_method :
 */

public class PaySystem {
    // class member attribute
    public final static int CARD = 1;
    public final static int PAY = 2;
    public final static int ETC = 3;

    // class static method
    /**
    *   @method_purpose : 사용자로부터 결제 방식 선택 받은 후 변환
    *   @method_name : selectPayType
    *   @param
    *   @return type
    *   @Description : 카드(1), 페이(2), 나머지(3)에 대한 정수값
    */
    public static int selectPayType() {
        Scanner in = new Scanner(System.in);
        System.out.println("결제 방식 선택");
        System.out.println("1번. 신용 카드");
        System.out.println("2번. pay");
        System.out.println("3번. 없음");
        System.out.print("입력: ");

        int type = in.nextInt();
        in.close();

        return type;
    }
    /**
    *   @method_purpose : 선택 방식에 따른 결제 진행
    *   @method_name : payProcess
    *   @param p
    *   @param amount
    *   @return boolean
    *   @Description : 선택한 방식에 따라 결제에 대해 반환값을 줌
    */
    public static boolean payProcess(PayInterface p, int amount) {
        return p.pay(amount);
    }

    // entry point method
    public static void main(String[] args) {
        // 결제 방식 선택
        int payType = PaySystem.selectPayType();

        // 결제 진행
        switch (payType){
            case PaySystem.CARD:
                CreditCard card = new CreditCard();
                PaySystem.payProcess(card, 280);
                break;
            case PaySystem.PAY:
                NPay gspay = new NPay("GSPay");
                PaySystem.payProcess(gspay,300);
                break;
            default:
                System.out.println("결제 불가합니다.");
                break;
        }
        System.out.println("END");

    }
}

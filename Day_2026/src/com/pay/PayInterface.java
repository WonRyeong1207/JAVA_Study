package com.pay;

/**
 * @PackageName : com.pay
 * @FileName : PayInterface
 * @Date : 25. 2. 26.
 * @Description <p>
 * <pre>
 * =========================================================
 * DATE                    AUTHOR            NOTE
 * 25. 2. 26. 오후 2:59     WonRyeong1207     FirstCreate
 * ---------------------------------------------------------</pre>
 * @class_purpose : 카드 결제 관련?
 * @class_name : PayInterface
 * @parents_class : None
 * @class_attribute :
 * @class_function :
 * @class_method :
 */

public abstract class PayInterface {
    // member attribute
    public static interface p{};

    private int amount;

    // generator method
    public PayInterface() {
    }
    public PayInterface(int amount) {
        this.amount = amount;
    }

    // getter/setter
    public int getAmount() {
        return amount;
    }
    public void setAmount(int amount) {
        this.amount = amount;
    }

    // member method
    public abstract boolean pay(int amount);
    public abstract boolean cancel(int amount);
    public abstract boolean refund(int amount);


}

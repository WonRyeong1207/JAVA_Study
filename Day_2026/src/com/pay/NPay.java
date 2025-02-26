package com.pay;

/**
 * @PackageName : com.pay
 * @FileName : NPay
 * @Date : 25. 2. 26.
 * @Description <p>
 * <pre>
 * =========================================================
 * DATE                    AUTHOR            NOTE
 * 25. 2. 26. 오후 3:05     WonRyeong1207     FirstCreate
 * ---------------------------------------------------------</pre>
 * @class_purpose : 앱카드 결제?
 * @class_name : NPay
 * @parents_class : PayInterface
 * @class_attribute :
 * @class_function :
 * @class_method :
 */

public class NPay extends PayInterface{
    // member attribute
    private String name;

    // generator method
    NPay() {
        // this();
    }
    public NPay(String name) {
        this.name = name;
    }

    // getter/setter
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    // member method
    @Override
    public boolean pay(int amount) {
        return false;
    }

    @Override
    public boolean cancel(int amount) {
        return false;
    }

    @Override
    public boolean refund(int amount) {
        return false;
    }
}

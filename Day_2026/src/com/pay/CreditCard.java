package com.pay;

/**
 * @PackageName : com.pay
 * @FileName : CreditCard
 * @Date : 25. 2. 26.
 * @Description <p>
 * <pre>
 * =========================================================
 * DATE                    AUTHOR            NOTE
 * 25. 2. 26. 오후 2:58     WonRyeong1207     FirstCreate
 * ---------------------------------------------------------</pre>
 * @class_purpose : 신용카드?
 * @class_name : CreditCard
 * @parents_class : PayInterface
 * @class_attribute :
 * @class_function :
 * @class_method :
 */

public class CreditCard extends PayInterface{
    // member attribute
    private String company;
    private String type; // 보너스카드?
    private String card_code; // 0000-0000?
    private String code; // 0000-0000?

    // generator method
    public CreditCard() {
        this("kb", "checkcard", "1234", "1234", 50000);
    }

    public CreditCard(String company, String type, String card_code, String code,int amount) {
        super(amount);
        this.company = company;
        this.type = type;
        this.card_code = card_code;
        this.code = code;
    }

    // getter/setter
    public String getCompany() {
        return company;
    }
    public void setCompany(String company) {
        this.company = company;
    }

    public String getType() {
        return type;
    }
    public void setType(String type) {
        this.type = type;
    }

    public String getCard_code() {
        return card_code;
    }
    public void setCard_code(String card_code) {
        this.card_code = card_code;
    }

    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
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

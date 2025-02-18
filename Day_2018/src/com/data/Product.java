/**
 *  class function : 판매 제품 정보 저장
 *  class name : Product
 *  class attribute : 제품코드, 제품명, 단가, 수량
 *  class method : 제품정보 출력 가능
 *                 제품코드에 따른 가격 안내 기능
 *                 제품코드에 따른 수량 안내 기능
 */
package com.data;

/**
 * The type Product.
 */
public class Product {

    /**
     * The Code.
     */
// class attribute
    private String code;
    /**
     * The P_name.
     */
    private String p_name;
    /**
     * The Price.
     */
    private int price;
    /**
     * The Count.
     */
    private int count;

    /**
     * Instantiates a new Product.
     */
    public Product() {
        this("None", "None", 0, 0);
    }

    /**
     * Instantiates a new Product.
     *
     * @param code the code
     */
    public Product(String code) {
        this(code, "None", 0, 0);
    }

    /**
     * Instantiates a new Product.
     *
     * @param code   the code
     * @param p_name the p_name
     * @param price  the price
     * @param count  the count
     */
    public Product(String code, String p_name, int price, int count) {
        this.code = code;
        this.p_name = p_name;
        this.price = price;
        this.count = count;
    }

    /**
     * Gets code.
     *
     * @return the code
     */
// getter/setter
    String getCode() {
        return this.code;
    }

    /**
     * Sets code.
     *
     * @param code the code
     */
    void setCode(String code) {
        this.code = code;
    }

    /**
     * Gets p_name.
     *
     * @return the p_name
     */
    String getP_name() {
        return this.p_name;
    }

    /**
     * Sets p_name.
     *
     * @param p_name the p_name
     */
    void setP_name(String p_name) {
        this.p_name = p_name;
    }

    /**
     * Gets price.
     *
     * @return the price
     */
    int getPrice() {
        return this.price;
    }

    /**
     * Sets price.
     *
     * @param price the price
     */
    void setPrice(int price) {
        this.price = price;
    }

    /**
     * Get count int.
     *
     * @return the int
     */
    int getCount(){
        return this.count;
    }

    /**
     * Sets count.
     *
     * @param count the count
     */
    void setCount(int count) {
        this.count = count;
    }

    /**
     * Print info.
     */
// class method
    // method function : 제품 정보출력
    // method attribute : None
    // method name : printInfo
    // method return : None
    // method 접근지정자 : public
    public void printInfo() {
        System.out.println("--------------------");
        System.out.printf("제품명 : %s\n", this.p_name);
        System.out.printf("제품코드 : %s\n", this.code);
        System.out.printf("제품단가 : %d\n", this.price);
        System.out.printf("제품수량 : %d\n", this.price);
        System.out.println("--------------------");
        System.out.println();
    }

    /**
     * Search price int.
     *
     * @param code the code
     * @return the int
     */
// method function : 제품코드에 따른 가격 안내
    // method attribute : None
    // method name : searchPrice
    // method return : string code
    // method 접근지정자 : public
    public int searchPrice(String code) {
        return this.price;
    }

    /**
     * Search count int.
     *
     * @param code the code
     * @return the int
     */
// method function : 제품코드에 따른 수량 안내
    // method attribute : None
    // method name : searchCount
    // method return : string code
    // method 접근지정자 : public
    public int searchCount(String code) {
        return this.count;
    }


}

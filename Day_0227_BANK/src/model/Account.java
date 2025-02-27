package model;

import java.lang.reflect.Array;

/**
 * @PackageName : model
 * @FileName : Account
 * @Date : 25. 2. 27.
 * @Description <p>
 * <pre>
 * =========================================================
 * DATE                    AUTHOR            NOTE
 * 25. 2. 27. 오후 3:04     WonRyeong1207     FirstCreate
 * ---------------------------------------------------------</pre>
 * @class_purpose : 계좌 정보 저장 클래스
 * @class_name : Account
 * @parents_class : None
 * @class_attribute : 계좌번호(acc_num), 예금주(owner), 잔액(balance), 만든날짜(create_dt), 만든지점(create_lo)
 * @class_function : 계좌정보출력
 * @class_method : generator, getter/setter, printInfo
 */

public class Account {
    // member attribute
    private String acc_num;
    private String owner;
    private int balance;
    private String create_dt;
    private String create_lo;

    // generator method
    public Account() {}

    public Account(String acc_num, String owner, int balance, String create_dt, String create_lo) {
        this.acc_num = acc_num;
        this.owner = owner;
        this.balance = balance;
        this.create_dt = create_dt;
        this.create_lo = create_lo;
    }

    // getter
    public String getAcc_num() {
        return acc_num;
    }

    public String getOwner() {
        return owner;
    }

    public int getBalance() {
        return balance;
    }
    public void setBalance(int balance) {
        this.balance = balance;
    }

    public String getCreate_lo() {
        return create_lo;
    }

    public String getCreate_dt() {
        return create_dt;
    }

    // member method
    /**
    *   @method_purpose : 계좌 정보 출력
    *   @method_name : printInfo
    *   @param acc_number
    *   @return 계좌 정보 출력
    *   @Description : 매개변수에 따라 다름
    */
    public void printInfo(String acc_number) {
        System.out.println("==============================");
        System.out.printf("계좌번호 : %s\n", this.acc_num);
        System.out.printf("예금자명 : %s\n", this.owner);
        System.out.printf("잔액 : %d\n", this.balance);
        System.out.printf("개설일자 : %s\n", this.create_dt);
        System.out.printf("개설지점 : %s\n", this.create_lo);
        System.out.println("==============================\n");
    }

    /**
     *   @method_purpose : 계좌 정보 출력
     *   @method_name : printInfo
     *   @param acc_number
     *   @param acc
     *   @return 계좌 정보 출력
     *   @Description : 매개변수에 따라 다름
     */
    public void printInfo(String acc_number, Array acc) {
        System.out.println("==============================");
        System.out.printf("계좌번호 : %s\n", this.acc_num);
        System.out.printf("예금자명 : %s\n", this.owner);
        System.out.printf("잔액 : %d\n", this.balance);
        System.out.printf("개설일자 : %s\n", this.create_dt);
        System.out.printf("개설지점 : %s\n", this.create_lo);
        System.out.println("==============================\n");
    }

    /**
     *   @method_purpose : 계좌 정보 출력
     *   @method_name : printInfo
     *   @param
     *   @return 계좌 정보 출력
     *   @Description : 매개변수에 따라 다름
     */
    public void printInfo() {
        System.out.println("==============================");
        System.out.printf("계좌번호 : %s\n", this.acc_num);
        System.out.printf("예금자명 : %s\n", this.owner);
        System.out.printf("잔액 : %d\n", this.balance);
        System.out.printf("개설일자 : %s\n", this.create_dt);
        System.out.printf("개설지점 : %s\n", this.create_lo);
        System.out.println("==============================\n");
    }

}

package model;

import message.Msg;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * @PackageName : model
 * @FileName : BankSystem
 * @Date : 25. 2. 27.
 * @Description <p>
 * <pre>
 * =========================================================
 * DATE                    AUTHOR            NOTE
 * 25. 2. 27. 오후 3:20     WonRyeong1207     FirstCreate
 * 25. 2. 28. 오후 4:37     WonRyeong1207     Update Vector
 * ---------------------------------------------------------</pre>
 * @class_purpose : 은행 업무 관리 클래스
 * @class_name : BankSystem
 * @parents_class : None?
 * @class_attribute : 은행명(String final), 지점명(String final), 계좌목록(Array[100]), 계좌번호 생성시 사용될 접두어(String), 개설계좌 개수(int)
 * @class_function : 서비스 화면 출력, 계좌 개설, 계좌 조회, 계좌 입금. 계좌 출금
 * @class_method : generator, getter/setter,
 */

public class BankSystem {
    // member attribute
    private final String B_NAME;
    private final String L_NAME;
    // private Account[] acc_arr = new Account[100];
    private Account[] acc_arr = new ArrayList<Account>(0).toArray(new Account[0]);
    private int reg_cnt;
    private final String PREFIX = "BK-";

    // generator method
    public BankSystem() {
        this("Bank", "None", null, 0);
    }

    public BankSystem(String b_NAME, String l_NAME) {
        B_NAME = b_NAME;
        L_NAME = l_NAME;
    }

    public BankSystem(String b_NAME, String l_NAME, Account[] acc_arr, int reg_cnt) {
        B_NAME = b_NAME;
        L_NAME = l_NAME;
        this.acc_arr = acc_arr;
        this.reg_cnt = reg_cnt;
    }

    // getter/setter
    public String getB_NAME() {
        return B_NAME;
    }
    public String getL_NAME() {
        return L_NAME;
    }
    public Account[] getAcc_arr() {
        return acc_arr;
    }
    public int getReg_cnt() {
        return reg_cnt;
    }
    public String getPREFIX() {
        return PREFIX;
    }

    // member method
    /**
    *   @method_purpose : 서비스 화면 출력기능
    *   @method_name : printMenu
    *   @param
    *   @return void
    *   @Description : 서비스를 선택할 수 있는 화면을 출력
    */
    public void printMenu(){
        System.out.println();
        System.out.println("===============================");
        System.out.println("|        서비스 선택 화면        |");
        System.out.println("===============================");
        System.out.println("|           1. 계좌개설         |");
        System.out.println("|           2. 계좌목록         |");
        System.out.println("|           3. 계좌조회         |");
        System.out.println("|           4. 입금            |");
        System.out.println("|           5. 출금            |");
        System.out.println("|           6. 종료            |");
        System.out.println("===============================");
        System.out.print("선택 : ");
    }

    /**
    *   @method_purpose : 계좌 개설 기능
    *   @method_name : createAccount
    *   @param owner
    *   @param amount
    *   @return boolean
    *   @Description : 예금주와 금액을 입력받아 계좌를 개설함
    */
    public boolean createAccount(String owner, int amount) {

        // 계좌 번호 생성 -> "bk-001-im'
        String accNum = this.PREFIX + reg_cnt + "-" + this.B_NAME;
        // 계좌 개설 날짜
        String createDT = ""+ LocalDate.now();

        acc_arr[this.reg_cnt++] = new Account(accNum, owner, amount, createDT,this.L_NAME);

        return true;
    }

    /**
     *   @method_purpose : 계좌 개설 기능
     *   @method_name : createAccount
     *   @param scan
     *   @return boolean
     *   @Description : 예금주와 금액을 입력받아 계좌를 개설함
     */
    public boolean createAccount(Scanner scan) {

        scan = new Scanner(System.in);
        System.out.print("\n예금주 : ");
        String owner = scan.next();
        System.out.print("예금액 : ");
        int amount = scan.nextInt();

        // 계좌 번호 생성 -> "bk-001-im'
        String accNum = this.PREFIX + reg_cnt + "-" + this.B_NAME;
        // 계좌 개설 날짜
        String createDT = ""+ LocalDate.now();

        acc_arr[this.reg_cnt++] = new Account(accNum, owner, amount, createDT,this.L_NAME);

        return true;
    }

    /**
    *   @method_purpose : 계좌 목록 기능
    *   @method_name : listAccount
    *   @param
    *   @return boolean
    *   @Description : 계좌 목록이 있다면 출력, 전체 계좌 정보를 출력
    */
    public boolean listAccount() {
        for (int idx=0; idx<this.reg_cnt; idx++) {
            this.acc_arr[idx].printInfo();
        }
        return (this.reg_cnt > 0) ? true : false;
    }

    /**
    *   @method_purpose : 계좌 조회
    *   @method_name : checkAccount
    *   @param scan
    *   @return
    *   @Description : 원하는 계좌의 정보를 확인 할 수 있음
    */
    public void checkAccount(Scanner scan) {
        // 계좌번호
        System.out.print("\n계좌번호 : ");
        String accNum = scan.next();

        for (int i=0; i<this.reg_cnt; i++) {
            if (this.acc_arr[i].getAcc_num().equals(accNum)) {
                this.acc_arr[i].printInfo();
                break;
            }
            else {
                Msg.msg(Msg.W_35_WA);
                break;
            }
        }
    }

    /**
    *   @method_purpose : 계좌 입금
    *   @method_name : deposit
    *   @param scan
    *   @return
    *   @Description : 계좌에 돈은 입금합니다
    */
    public void deposit(Scanner scan) {
        // 계좌번호
        System.out.print("\n계좌번호 : ");
        String accNum = scan.next();

        // 입금액
        System.out.print("입금액 : ");
        int amount = scan.nextInt();

        for (int i=0; i<this.reg_cnt; i++) {
            if (this.acc_arr[i].getAcc_num().equals(accNum)) {
                amount += this.acc_arr[i].getBalance();
                this.acc_arr[i].setBalance(amount);
                break;
            }
            else {
                Msg.msg(Msg.W_35_WA);
                break;
            }
        }
    }

    /**
    *   @method_purpose : 계좌 출금
    *   @method_name : withdrawal
    *   @param scan
    *   @return
    *   @Description : 계좌에서 돈을 출금 합니다.
    */
    public void withdrawal(Scanner scan) {
        // 계좌번호
        System.out.print("\n계좌번호 : ");
        String accNum = scan.next();

        // 입금액
        System.out.print("입금액 : ");
        int amount = scan.nextInt();

        for (int i=0; i<this.reg_cnt; i++) {
            if (this.acc_arr[i].getAcc_num().equals(accNum)) {
                if (amount <= this.acc_arr[i].getBalance()) {
                    amount =  this.acc_arr[i].getBalance() - amount;
                    this.acc_arr[i].setBalance(amount);
                    break;
                }
            }
            else {
                Msg.msg(Msg.W_35_WA);
                break;
            }
        }
    }

}

package app;

import message.Msg;
import model.BankSystem;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * @PackageName : app
 * @FileName : BankManger
 * @Date : 25. 2. 27.
 * @Description <p>
 * <pre>
 * =========================================================
 * DATE                    AUTHOR            NOTE
 * 25. 2. 27. 오후 3:53     WonRyeong1207     FirstCreate
 * ---------------------------------------------------------</pre>
 * @class_purpose : 은행 업무 관리 프로그램 클래스
 * @class_name : BankManger
 * @parents_class : None?
 * @class_function : 프로그램 진입점 main -> 프로그램 제어코드
 */

public class BankManger {
    public static void main(String[] args) {
        // 은행시스템 인스턴스 생성
        BankSystem myBK = new BankSystem("IM", "복현점");

        // 입력 인스턴스 생성
        Scanner scan = new Scanner(System.in);

        // 은행 업무 시스탬 루틴
        BK_END: // 라벨, 반복문 바로 종료
        while (true) {
            try {
                // 서비스 메뉴출력
                myBK.printMenu();
                switch (scan.nextInt()) {
                    case 1: {
                        // 계좌 개설
                        myBK.createAccount(scan);
                        break;
                    }
                    case 2: {
                        // 계좌 목록
                        if (!myBK.listAccount()) {
                            Msg.msg(Msg.W_21);
                        }
                        break;
                    }
                    case 3: {
                        // 계좌 조회
                        myBK.checkAccount(scan);
                        break;
                    }
                    case 4: {
                        // 입금
                        myBK.deposit(scan);
                        break;
                    }
                    case 5: {
                        // 출금
                        myBK.withdrawal(scan);
                        break;
                    }
                    case 6: {
                        // 종료
                        Msg.msg(Msg.W_E);
                        scan.close();
                        break BK_END;
                    }
                    default: {
                        Msg.msg(Msg.W_D);
                        break;
                    }
                }
            }catch (InputMismatchException ie){
                Msg.msg(Msg.E_IE);
                scan.nextLine(); // 입력 데이터 비우기 == current buffer delete

            }catch (Exception e) {
                Msg.msg(Msg.E_E);
                scan.nextLine(); // 입력 데이터 비우기
            }
        }
        // 최종 종료 확인
        System.out.println("END");


    }
}

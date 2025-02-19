package work;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * PackageName : work
 * FileName    : Caculator
 * Author      : Me
 * Date        : 25. 2. 18.
 * Description
 * =============================================
 * DATE            AUTHOR          NOTE
 * 25. 2. 18.          Me         FirstCreate
 * ---------------------------------------------
 *
 * ---------------------------------------------
 * 클래스 구현 => 표준 계산기 클래스
 * - 오버라이딩, 오버로딩, getter/setter, 접근지정자, history 남기기
 * ---------------------------------------------
 * class purpose: 표준 계산기 만들기
 * class name : Caculator
 * class function : addition, minus, multiple, division, show history
 * class attribute :
 * class method :
 */
public class Caculator {

    // class attribute
    /**
     * checkMenu : 메뉴 선택 변수
     */
    private int checkMenu;
    /**
     * check_op : 연산자 선택 변수
     */
    private char check_op;
    /**
     * num : 입력한 수
     */
    private float num;
    /**
     * total : 수식 값을 누적
     */
    private float total;
    /**
     * history : 계산기록을 저장
     * python의 문자열과 비슷한 메서드 List
     */
    private List<String> history;
    /**
     * current_formula : list append, 현재 수식 저장
     */
    private StringBuilder current_formula;

    Scanner input;

    // generator method
    Caculator() {
        total = 0;
        input = new Scanner(System.in);
        history = new ArrayList<>();    // python의 list와 비슷하게 해주는 메서드? 패키지?
        current_formula = new StringBuilder();  // 리스트 계속 추가할 수 있는거, append 가능
    }

    // menu screen
    private void printMenu() {
        System.out.println();
        System.out.println("-----------------------");
        System.out.println("1. 계산하기");
        System.out.println("2. 기록보기");
        System.out.println("3. 종료하기");
        System.out.println("-----------------------");
    }

    // 수를 입력받는 메서드
    private float inputNum() {
        System.out.print("수 입력 : ");
        float number = input.nextFloat();
        // 수식 추가
        current_formula.append(number);
        return number;
    }

    // 연산자를 입력받는 메서드
    private char inputOp() {
        System.out.print("연산자 입력 (+, -, *, /) : ");
        char op = input.next().charAt(0);
        // 수식 추가
        if (op != '=') {
            current_formula.append(' ');
            current_formula.append(op);
            current_formula.append(' ');
        }
        return op;
    }

    // 계산 메서드
    private void calcu() {
        // 무한반복
        // '='이 입력되면 멈춤
        System.out.println();
        System.out.println("=================");
        System.out.println("계산기 동작 시작");
        System.out.println("=================");
        System.out.println();
        
        // 이전 기록 삭제
        current_formula.delete(0,current_formula.length());
        total = inputNum();
        // 처음 숫자로 리셋
        // current_formula.append(total);
        while (true) {
            check_op = inputOp();
            // 종료조건
            if (check_op == '=') break;
            num = inputNum();

            // 연산자에 따라서 계산
            switch (check_op) {
                case '+': {
                    total += num;
                    break;
                }
                case '-': {
                    total -= num;
                    break;
                }
                case '*': {
                    total *= num;
                    break;
                }
                case '/': {
                    if (num != 0) {
                        total /= num;
                    }
                    else {
                        System.out.print("0 is not division\n\n");
                        continue;
                    }
                    break;
                }
                default: {
                    System.out.print("잘못된 연산자\n\n");
                    continue;
                }

            }
            System.out.println("합계 : "+total);
        }
        current_formula.append(" = ");
        current_formula.append(total);
        history.add(current_formula.toString());
    }
    // 기록 메서드
    private void showHis() {
        // 여기는 패키지와 메서드가 익숙하지 않음
        
        if (history.isEmpty()) {
            System.out.println();
            System.out.println("=================");
            System.out.println("계산 기록이 없음");
            System.out.println("=================");
            System.out.println();
        }
        else {
            System.out.println();
            System.out.println("=================");
            System.out.println("계산 기록");
            System.out.println("=================");
            for (String reco: history) {
                System.out.println(reco);
            }
        }
    }

    // main method
    public void run() {

        // System.out.println("정상 출력");
        //  printMenu();
        //  int_num = inputInt();
        //  System.out.println(int_num);
        //  check_op = inputOp();
        //  System.out.println(check_op);

        // 무한 반복
        while (true) {
            printMenu();
            System.out.print("메뉴 선택 : ");
            checkMenu = input.nextInt();
            switch (checkMenu) {
                case 1 : calcu(); break;
                case 2 : showHis(); break;
                case 3 : {
                    System.out.print("\n종료합니다\n");
                    input.close();
                    // break;
                    // 완전 종료 코드
                    System.exit(0); // 초기 상태로 돌아가기
                }
                default: System.out.print("다시 입력해주세요\n\n");
            }
        }
    }

}

/*
    타입 캐스팅 (Casting) / 형변환
    - 작은 데이터 -> 큰 데이터 변환 : 자동 변환 / 묵시적 형변환
    - 큰 데이터 -> 작은 데이터 변환 : 개발자가 선택, 강제 형변환 / 명시적 형변환
 */

public class EX_04 {

    public static void main(String[] args) {
        // 변수 선언 및 초기화
        int num = 0x12C;
        double dnum = 1.98d;

        // 화면에 출력
        // 정수 -> 정수 형변환 : 큰 데이터를 작은 데이터로 형변환, 데이터 손실 발생
        System.out.println("int num : " + num);
        System.out.println("byte num : " + (byte)num); // (타입명) 숫자, 이때만 형이 변경됨

        // 실수 -> 정수 형변환 : 소수점 이하 버림, 데이터 손실 발생
        System.out.println("double dnum : " + dnum);
        System.out.println("byte dnum : " + (byte)dnum); // (타입명) 숫자, 이때만 형이 변경됨

    }
}

/*
    데이터 타입별 초기화 값
    - 지역 변수 즉, 베서드 안에 있는 변수는 반드시 초기화 해야함!
 */

public class EX_01 {

    public static void main(String[] args){
        // 타입별 변수 선언 및 초기화

        // 정수형
        byte num1 = 0;      // 1바이트 메모리 1칸
        short num2 = 0;     // 2바이트 메오리 2칸
        int num3 = 0;       // 4바이트 메모리 4칸
        long num4 = 0;      // 8바이트 메모리 8칸

        // 실수형
        // 자료형을 구분하기 위해서 float는 F를 뒤에다가 적음
        float fnum1 = 0.0F;    // 4바이트 메모리 4칸
        double fnum2 = 0.0;   // 8바이트 메모리 8칸

        // 문자형
        // 단일 문자
        char cdata = 0;         // 2바이트 메모리 2칸
        // 문자열, 데이터의 주소를 저장
        String sdata = null;    // 4바이트 메모리 4칸

        // 논리형
        boolean bOK = true;     // 1바이트 메모리 1칸
        boolean bNO = false;    // 1바이트 메모리 1칸

    }
}

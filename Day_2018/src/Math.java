/**
 * class function : 수학관련 속성과 기능 구성된 클래스
 * class name : Math
 * class attribute : None
 * class method : addition, minus, multiplication, division, average
 */
public class Math {

    // member attribute

    // method - generator
    // - 클래스명과 동일한 메서드명, 반환값 미지정
    Math() {
        // 기본 생성자 또는 디폴트 생성자 : 매개변수가 없는 생성자
        System.out.print("Math 생성자 호출 확인용\n\n");
    }

    // method - instance

    // method name : getSum
    // method attribute : int a, int b, int c
    // method return : int a + b + c
    int getSum(int a, int b, int c) {
        return a + b + c;
    }

    // method name : getSum
    // method attribute : int a, int b, int c, int d
    // method return : int a + b + c + d
    int getSum(int a, int b, int c, int d) {
        return a + b + c + d;
    }

    // method name : getSum
    // method attribute : float a, float b, float c
    // method return : float a + b + c
    float getSum(float a, float b, float c) {
        return a + b + c;
    }

    // method name : getAverage
    // method attribute : int a, int b, int c
    // method return : float (a+b+c)/3.f
    float getAverage(int a, int b, int c) {
        return getSum(a, b, c)/3.f;
    }

}

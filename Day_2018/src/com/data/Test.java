package com.data;


public class Test {
    public static void main(String[] args) {
        // Book2 book1 = new Book2("나는 고양이로소이다");
        // default 접근지정자는 다른 패키지에서 보이지 않음
        // 선언 할 수 없음

        // 제품 인스턴스 생성
        Product p1 = new Product();

        // 메서드 호출
        p1.printInfo();
    }
}

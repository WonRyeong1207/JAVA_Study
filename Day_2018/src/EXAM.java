import com.data.Product;

/**
 *  프로그램 제어 및 컨트롤 클래스
 *  - 프로그램 진입점 Entry Point main() 메서드 존재
 */

public class EXAM {
    /**
     *
     * @param args
     */
    public static  void  main(String[] args) {
        //합계, 평균 계산
        Math m1 = new Math();

        // 객체/인스턴스 메서드 호출
        int sum_1 = m1.getSum(1, 2, 3);
        int sum_2 = m1.getSum(1, 2, 3, 4);
        float sum_3 = m1.getSum(1.1f, 2.2f, 3.3f);
        float avg = m1.getAverage(1, 2, 3);

        System.out.printf("m1.getSum(1,2,3) -> %d\n", sum_1);
        System.out.printf("m1.getSum(1,2,3,4) -> %d\n", sum_2);
        System.out.printf("m1.getSum(1.1,2.2,3.3) -> %f\n", sum_3);
        System.out.printf("m1.getAverage(1,2,3) -> %.2f\n\n", avg);

        // 회원 정보 인스턴스
        Member admin = new Member();
        Member mem1 = new Member("mem_1","mm1", "마징가", 10, "010-1234-1234", 'F', "element student", "Daegu");
        Member mem2 = new Member("mem_2", "mm2", "홍길동", "010-3333-3333");

        admin.getInfo();
        mem1.getInfo();
        mem2.getInfo();

        // 도서 정보 인스턴스
        Book book_1 = new Book();
        Book book_2 = new Book("소년이 온다","한강");
        Book book_3 = new Book("인간실격", "다자이 오사무", 1948);

        book_1.printInfo();
        book_2.printInfo();
        book_3.printInfo();

        Book2 book_1p = new Book2("나생문", "아쿠타가와 류노스케", 1915);

        System.out.println("default 접근지정자 속성 : "+book_1p.author);
        book_1p.printInfo();
        book_1p.setTitle("羅生門");
        book_1p.printInfo();

        // 제품 인스턴스 생성
        Product p1 = new Product();

        // 메서드 호출
        p1.printInfo();

    }
}

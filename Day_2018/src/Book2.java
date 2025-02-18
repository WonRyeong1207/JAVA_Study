/**
 *  class function : 도서 정보 저장
 *  class name : Book
 *  class attribute : title, author, publication
 *  class method : getBookInfo
 */
public class Book2 {

    // class attribute
    private String title;
     String author;
    private int publication;

    // generator method
    Book2()  {
        this("None", "None", 0);
    }

    Book2(String title, String author) {
        this(title, author, 0);
    }

    Book2(String title, String author, int publication) {
        this.title = title;
        this.author = author;
        this.publication = publication;
    }

    // - getter/setter 메서드
    // - private 멤버 속성 읽기 쓰기 기능 메서드
    // - get속성명() -> 해당 속성값 반환
    // - set속성명(새로운값) -> 해당 속성값 변경
    // 필수는 아니기에 개발자의 맘대로임
    String getTitle() {
        return this.title;
    }
    void setTitle(String title) {
        this.title = title;
    }

    int getPublication() {
        return this.publication;
    }
    void setPublication(int publication) {
        this.publication = publication;
    }


    // class method
    // method function : show book info
    // method name : printInfo
    // method attribute : None
    // method return : None
    void printInfo () {
        System.out.println("--------------------");
        System.out.printf("도서명 : %s\n", this.title);
        System.out.printf("저자 : %s\n", this.author);
        System.out.printf("출간년도 : %d\n", this.publication);
        System.out.println("--------------------");
        System.out.println();
    }

}

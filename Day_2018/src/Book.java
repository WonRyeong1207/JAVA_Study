/**
 * class function : 도서 정보 저장
 * class name : Book
 * class attribute : title, author, publication
 * class method : getBookInfo
 */
public class Book {

    /**
     * The Title.
     */
// class attribute
    String title;
    /**
     * The Author.
     */
    String author;
    /**
     * The Publication.
     */
    int publication;

    /**
     * Instantiates a new Book.
     */
// generator method
    Book ()  {
        this("None", "None", 0);
    }

    /**
     * Instantiates a new Book.
     *
     * @param title  the title
     * @param author the author
     */
    Book (String title, String author) {
        this(title, author, 0);
    }

    /**
     * Instantiates a new Book.
     *
     * @param title       the title
     * @param author      the author
     * @param publication the publication
     */
    Book (String title, String author, int publication) {
        this.title = title;
        this.author = author;
        this.publication = publication;
    }

    /**
     * Print info.
     */
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

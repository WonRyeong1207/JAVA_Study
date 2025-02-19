/**
 * PackageName : default
 * FileName    : Variable
 * Author      : MSI
 * Date        : 25. 2. 19.
 * Description
 * =============================================
 * DATE            AUTHOR          NOTE
 * 25. 2. 19.         MSI         FirstCreate
 * ---------------------------------------------
 * class purpose: 다양한 종류의 변수 선언
 * class name : Variable
 * class function : 다양한 변수 종류 확인
 * class attribute :
 * class method :
 */

public class Variable {
    // 멤버 변수 : 클래스 변수, 인스턴스 변수
    // 클래스 변수 : 공유 속성/변수
    static int code;

    // 인스턴스 변수 : new 키워드로 인스턴스 생성시 이용가능
    private String id;  // 이 파일에서만 자유롭게 사용가능한 접근지정자.
                        // 다른 파일에서 사용하려면 getter/setter 사용/구현 해야함.
    String name;    // 접근 지정자가 없으면 default. 같은 패키지 내라면 사용가능

    // 생성자 메서드 : 클래스 이름과 동일한 이름, 반홤 문법이 없음
    //              클래스 이름(){} - 기본/default 생성자 : 생성자가 1개도 없으면 컴파일러가 자동생성함
    Variable () {
        this("None", "None");
        System.out.println("생성자 Variable()");
    }
    // 한개의 속성 초기화 생성자
    Variable (String id) {
        this.id = id;
        System.out.println("생성자 Variable(string)");
    }
    // 두개의 속성 초기화 생성자
    Variable (String id, String name) {
        this.id = id;
        this.name = name;
        System.out.println("생성자 Variable(string, string)");
    }

    // getter/setter 메서드 : 속성 간접 접근 메서드
    // - get속성명() : 속성 추출
    // - set속성명(새로운 값) : 속성 변경

    public static int getCode() {
        return code;
    }

    public static void setCode(int code) {
        Variable.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    // 멤버 메서드 : 클래스 매서드, 인스턴스 매서드
    // method function : 고객정보 출력 기능
    // method name : printInfo
    // method attribute : 인스턴스 내부의 속성/변수 사용. 추가 필요X
    // method return : None
    public void printInfo() {
        System.out.println("Name : " + this.name);
        System.out.println("ID : " + this.id);
    }

    // method function : 인사 메시지 출력
    // method name : hello
    // method attribute : 인스턴스 내부의 속성/변수 사용X. 추가 필요X
    // method return : None
    public static void hello() {
        System.out.println("Hello");
    }

    // Entry Point Method
    /*
    public static void main(String[] args) {
        // class variable
        Variable.code = 2025;

        // create instance
        Variable v1 = new Variable();
        Variable v2 = new Variable();

        // instance Variable
        v1.name = "Kim";
        v2.name = "Hong";

        // class variable
        v1.code = 100;
        v2.code = 7;
    }
    */

}

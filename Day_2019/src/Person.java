/**
 * @PackageName : default
 * @FileName : Person
 * @Author : MSI
 * @Date : 25. 2. 19.
 * @Description <p>
 * ============================================= <br>
 * <p>DATE            AUTHOR          NOTE
 * <p>25. 2. 19.         MSI         FirstCreate
 * <p>---------------------------------------------
 * <p>
 * @class_purpose : 사람 정보 저장 클래스
 * @class_name : Person
 * @class_attribute :gender, age, height, weight, name, local
 * @class_function : 먹는다, 잔다, 논다, 정보 출력
 * @class_method : eat, sleep, play, printInfo, getter/setter
 */
public class Person {
    // member variable
    // 클래스 변수 선언
    public static final String LOC = "Korea";

    // name, age, gender, height, local
    private String name;
    private int age;
    private char gender;
    private float height;
    private float weight;

    // generator method
    public Person() {
        this("unknown", 0, 'N', 0.f, 0.f);
    }
    public Person(String name) {
        this.name = name;
    }
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public Person(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
    public Person(String name, int age, char gender, float height, float weight) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.weight = weight;
        this.height = height;
    }

    // getter/setter method
    public String getName() {return name;}
    public void setName(String name) {this.name = name;}
    public int getAge() {return age;}
    public void setAge(int age) {this.age = age;}
    public char getGender() {return gender;}
    public void setGender(char gender) {this.gender = gender;}
    public float getHeight() {return height;}
    public void setHeight(float height) {this.height = height;}
    public float getWeight() {return weight;}
    public void setWeight(float weight) {this.weight = weight;}

    // member method
    // eat, sleep, play, printInfo, getter/setter

    /**
     *   @method_purpose : 음식을 먹는다 메시지 풀력
     *   @method_name : eat
     *   @param food
     *   @return None
     *   @Description : '음식'을 입력받아서 '먹는다'는 메시지를 출력
     */
    public void eat(String food) {
        System.out.println(this.name + " 이/가 " + food + "을/를 먹는다");
    }
    /**
     *   @method_purpose : 잔다 메시지 출력
     *   @method_name : sleep
     *   @param where
     *   @return None
     *   @Description : '장소'를 입력받아 행위 메시지를 출력
     */
    public void sleep(String where) {
        System.out.println(this.name + " 이/가 " + where + "에서 잔다");
    }

    /**
     *   @method_purpose : 논다 메시지 출력
     *   @method_name : play
     *   @param what
     *   @return None
     *   @Description : '무엇'을 입력받아서 '논다'는 메시지를 출력
     */
    public void play(String what) {
        System.out.println(this.name + " 이/가 " + what + "하고 있다");
    }
    /**
     *   @method_purpose : 사람 정보 출력
     *   @method_name : printInfo
     *   @return None
     *   @Description : 이름, 나이, 성별 등등 출력
     */
    public void printInfo() {
        System.out.println("이름 : " + this.name);
        System.out.println("나이 : " + this.age);
        System.out.println("성별 : " + this.gender);
    }
}

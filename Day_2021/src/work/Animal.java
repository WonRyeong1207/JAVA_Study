package work;

/**
 * @PackageName : work
 * @FileName : Animal
 * @Date : 25. 2. 24.
 * @Description <p>
 * <pre>
 * =========================================================
 * DATE                    AUTHOR            NOTE
 * 25. 2. 24. 오후 1:08     WonRyeong1207     FirstCreate
 * ---------------------------------------------------------</pre>
 * @class_purpose : 동물 클래스 만들기
 * @class_name : Animal
 * @class_attribute : 이름(String name), 나이(int age), 성별(char gender)
 * @class_function : 먹는다, 잔다, 움직인다, 울음소리를 낸다, 인사한다, 정보출력
 * @class_method : getter/setter, eat, sleep, move, howl, hello, printInfo
 */
public class Animal {
    // member variable
    private String name;
    private int age;
    private char gender;

    // generator method
    public Animal() {
        this("unKnown", 0, 'N');
    }

    public Animal(String name, int age, char gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    // getter/setter
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    // member method
    /**
    *   @method_purpose : 동물이 먹는 것을 표현
    *   @method_name : eat
    *   @param food
    *   @return %s이가 %s을/를 먹는다
    *   @Description : String food
    */
    public void eat(String food) {
        System.out.printf("%s이가 %s을/를 먹는다\n\n", this.name, food);
    }

}

/**
 * 동물원 클래스 Zoo 설계 연습
 * - 동물 5마리 -> 5개 클래스
 * - 필수 메서드 : 울음소리 내는 것, 이동/움직이는 것, 먹는 것
 */
public class Zoo {

    // attribute
    // 종족, 이름, 성별, 울음소리, 좋아하는 것
    String species;
    String name;
    char gender;
    String howling;
    String like_food;

    // generator method
    // method function : attribute reset
    // method name : Zoo
    // method return : None
    Zoo(String species_, String name_, char gender_, String howling_, String like_food_) {
        species = species_;
        name = name_;
        gender = gender_;
        howling = howling_;
        like_food = like_food_;
    }

    // Method
    // method function : 울음소리를 낸다
    // method name: howl
    // method attribute : None
    // method return : None
    void howl() {
        System.out.printf("%s가 '%s'라고 울었다.\n\n", name, howling);
    }

    // method function : 움직인다
    // method name : move
    // method attribute : moving
    // method return : None
    void move(String moving) {
        System.out.printf("%s가 %s.\n\n", name, moving);
    }

    // method function : 먹는다
    // method name : eat
    // method attribute : None
    // method return : None
    void eat() {
        System.out.printf("%s가 %s를 먹는다\n\n", name, like_food);
    }

}

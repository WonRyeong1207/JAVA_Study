/**
 *      class proposal : 회원정보 클래스
 *      class attribute : id, pw, name, age, phone, gender, job, address
 *      class method : 정보출력가능
 */
public class Member {

    // class attribute
    String id;
    String pw;
    String name;
    int age;
    String phone;
    char gender;
    String job;
    String address;

    // class generator : 속성 초기화
    Member () {
        // 속성명 = 저장할 값;
        id = "manager";
        pw = "None";
        name = "Admin";
        age = 0;
        phone = "None";
        gender = 'N';
        job = "None";
        address = "system";
    }
    Member (String id_, String pw_, String name_, int age_,
            String phone_, char gender_, String job_, String address_) {
        // 속성명 = 저장할 값;
        id = id_;
        pw = pw_;
        name = name_;
        age = age_;
        phone = phone_;
        gender = gender_;
        job = job_;
        address = address_;
    }
    // 생성자 오버로딩
    Member (String id_, String pw_, String name_, String phone_) {
        // 속성명 = 저장할 값;
        id = id_;
        pw = pw_;
        name = name_;
        phone = phone_;
        gender = 'N';
    }

    // class method
    // method name : getInfo
    // method attribute : None
    // method return : None
    void getInfo() {
        System.out.println("--------------------------");
        System.out.printf("name : %s\n", name);
        System.out.printf("id : %s\n", id);
        System.out.printf("pw : %s\n", pw);
        System.out.printf("age : %d\n", age);
        System.out.printf("gender : %s\n", gender);
        System.out.printf("job : %s\n", job);
        System.out.printf("phone : %s\n", phone);
        System.out.printf("address : %s\n",address);
        System.out.println("--------------------------");
        System.out.println();
    }


}

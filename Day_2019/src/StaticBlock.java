/**
* @FileName    : StaticBlock
* @Date        : 25. 2. 19. 오후 4:36
* @Description <p>
* <pre>
* =====================================================
* DATE                    AUTHOR          NOTE
* 25. 2. 19. 오후 4:36     WonRyeong       FirstCreate
* -----------------------------------------------------</pre>
* @class_purpose : 블럭 초기화
* @class_name : StaticBlock
* @class_attribute : None
* @class_function : static 변수 초기화
* @class_method : getter
*/
public class StaticBlock {
    // member variable
    // class variable
    static int[] arr = new int[10];

    // instance variable
    private String name = "unknown";
    private int age = 7;

    // reset block
    static  // 없으면 인스턴스의 초기화 블럭으로 적용됨. 생성자보다 먼저 실행됨.
    {
        for (int i=0; i< arr.length; i++) {
            arr[i] = i*i;
        }
    }

    // generator method
    public StaticBlock() { }
    public StaticBlock(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // getter
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
}

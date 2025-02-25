package com.test;

/**
 * @PackageName : com.test
 * @FileName : Singleton
 * @Date : 25. 2. 25.
 * @Description <p>
 * <pre>
 * =========================================================
 * DATE                    AUTHOR            NOTE
 * 25. 2. 25. 오후 2:40     WonRyeong1207     FirstCreate
 * ---------------------------------------------------------</pre>
 * @class_purpose : 클래스 생성 제한하는 클래스, 내부에서 인스턴스 생성
 * @class_name : Singleton
 * @parents_class : None
 * @class_attribute : instance
 * @class_function : 인스턴스 반환
 * @class_method : generator, getter,
 */

public class Singleton {
    // member attribute
    // class attribute
    private static Singleton instance;

    // generator method
    private Singleton() {}

    // getter/setter
    // 1개의 인스턴스만 메모리에 생성하고 공유하겠다
    public static Singleton getInstance() {
        Singleton.instance =  (instance != null) ? Singleton.instance : new Singleton();
        return instance;
    }

    // member method


}

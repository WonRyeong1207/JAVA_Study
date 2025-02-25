package com.product;

/**
 * @PackageName : com.product
 * @FileName : TV
 * @Date : 25. 2. 25.
 * @Description <p>
 * <pre>
 * =========================================================
 * DATE                    AUTHOR            NOTE
 * 25. 2. 25. 오후 4:01     WonRyeong1207     FirstCreate
 * ---------------------------------------------------------</pre>
 * @class_purpose : TV 데이터 표현 클래스
 * @class_name : TV
 * @parents_class : None
 * @class_attribute : 채널, 소리 , 모드, 크기 ==> 인스턴스 생성시 초기화 후 변경 X, 제조국
 * @class_function : 채널전환, 소리조절 -> subclass redefine, 전원제어
 * @class_method : generator, channelUpDown, volumeUpDown, powerOn, powerDown
 */

public abstract class TV {
    // member attribute
    // class attribute
    public static final String Brand = "Korea";

    // instance  attribute
    private final int CHANNEL;
    private final int SIZE;
    private final int VOLUME;
    private final int MODE;

    // generator method
    TV() {
        this(4, 10, 10, 2);
    }

    public TV(int CHANNEL, int SIZE, int VOLUME, int MODE) {
        this.CHANNEL = CHANNEL;
        this.SIZE = SIZE;
        this.VOLUME = VOLUME;
        this.MODE = MODE;
    }

    // getter/setter

    public int getCHANNEL() {
        return CHANNEL;
    }

    public int getSIZE() {
        return SIZE;
    }

    public int getVOLUME() {
        return VOLUME;
    }

    public int getMODE() {
        return MODE;
    }


    // member method
    /**
    *   @method_purpose : 채널 변경
    *   @method_name : channelUpDown
    *   @param is_up
    *   @return
    *   @Description : 미완성
    */
    abstract public int channelUpDown(boolean is_up);

    /**
    *   @method_purpose : 소리 제어
    *   @method_name : volumeUpDown
    *   @param is_up
    *   @return
    *   @Description : 미완성
    */
    abstract public int volumeUpDown(boolean is_up);

    /**
    *   @method_purpose : 전원 제어
    *   @method_name : powerOn
    *   @param
    *   @return "Power On"
    *   @Description : on
    */
    public void powerOn() {
        System.out.println("Power On");
    }

    /**
    *   @method_purpose : 전원 제어
    *   @method_name : powerDown
    *   @param
    *   @return "Power Down"
    *   @Description : off
    */
    public void powerDown() {
        System.out.println("Power Down");
    }

}

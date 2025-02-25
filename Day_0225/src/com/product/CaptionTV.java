package com.product;

/**
 * @PackageName : com.product
 * @FileName : CaptionTV
 * @Date : 25. 2. 25.
 * @Description <p>
 * <pre>
 * =========================================================
 * DATE                    AUTHOR            NOTE
 * 25. 2. 25. 오후 4:20     WonRyeong1207     FirstCreate
 * ---------------------------------------------------------</pre>
 * @class_purpose : 자막 TV의 정보를 표현하는 클래스
 * @class_name : CaptionTV
 * @parents_class : TV
 * @class_attribute : 자막(caption), current_c, current_v
 * @class_function : 채널전환, 소리제어, 자막제어
 * @class_method : generator, getter/setter, channelUpDown, volumeUpDown, captionOn, captionOff
 */

public class CaptionTV extends TV{
    // member attribute
    private String  caption;
    private int current_c;
    private int current_v;

    // generator method
    public CaptionTV() {
        this(4, 10, 10, 2, "Korea");
        this.current_c = this.getCHANNEL();
        this.current_v = this.getVOLUME();
    }

    public CaptionTV(int CHANNEL, int SIZE, int VOLUME, int MODE, String caption) {
        super(CHANNEL, SIZE, VOLUME, MODE);
        this.caption = caption;
        this.current_c = this.getCHANNEL();
        this.current_v = this.getVOLUME();
    }

    // getter/setter
    public String getCaption() {
        return caption;
    }
    public void setCaption(String caption) {
        this.caption = caption;
    }

    public int getCurrent_c() {
        return current_c;
    }
    public void setCurrent_c(int current_c) {
        this.current_c = current_c;
    }

    public int getCurrent_v() {
        return current_v;
    }
    public void setCurrent_v(int current_v) {
        this.current_v = current_v;
    }

    // member method
    /**
    *   @method_purpose : 채널 전환
    *   @method_name : channelUpDown
    *   @param is_up
    *   @return current_channel
    *   @Description : true is up, false id down
    */
    @Override
    public int channelUpDown(boolean is_up) {
        this.current_c = (is_up) ? ++current_c : --current_c;
        System.out.printf("channel is %d\n", this.current_c);
        return this.current_c;
    }

    /**
    *   @method_purpose : 소리 제어
    *   @method_name : volumeUpDown
    *   @param is_up
    *   @return current_volume
    *   @Description : true is up, false id down
    */
    @Override
    public int volumeUpDown(boolean is_up) {
        this.current_v = (is_up) ? ++current_v : --current_v;
        System.out.printf("channel is %d\n", this.current_v);
        return this.current_v;
    }

    /**
    *   @method_purpose : 자막 제어
    *   @method_name : captionOn
    *   @param
    *   @return "Caption On"
    *   @Description : 자막이 켜짐
    */
    public void captionOn() {
        System.out.println("Caption On");
    }

    /**
    *   @method_purpose : 자막 제어
    *   @method_name : captionOff
    *   @param
    *   @return "Caption off"
    *   @Description : 자막이 꺼짐
    */
    public void captionOff() {
        System.out.println("Caption Off");
    }

}

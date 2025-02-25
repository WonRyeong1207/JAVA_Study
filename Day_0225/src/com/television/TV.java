package com.television;

/**
 * @PackageName : com.television
 * @FileName : TV
 * @Date : 25. 2. 25.
 * @Description <p>
 * <pre>
 * =========================================================
 * DATE                    AUTHOR            NOTE
 * 25. 2. 25. 오후 3:43     WonRyeong1207     FirstCreate
 * ---------------------------------------------------------</pre>
 * @class_purpose : TV의 정보를 표현하는 클래스
 * @class_name : TV
 * @parents_class : None
 * @class_attribute : screen(화면 boolean), volume(소리/음향 int), channel_arr(채널 String[10]), channel_num(int), channel_name(String), max_channel_num(int 10 static)
 * @class_function : 전원제어, 소리제어, 채널제어, 채널 정보
 * @class_method : generator, getter/setter, con_s, con_v, con_c, channelInfo
 */

public class TV {
    // member attribute
    public static int max_channel_num = 10;

    private boolean screen;
    private int volume;
    private String[] channel_arr = new String[max_channel_num];
    private int channel_num;
    private String channel_name;

    // generator method
    public TV() {
        this(false, 0, 0, "None");
        this.channel_arr[this.channel_num] = this.channel_name;
    }

    public TV(boolean screen, int volume, int channel_num, String channel_name) {
        this.screen = screen;
        this.volume = volume;
        this.channel_num = channel_num;
        this.channel_name = channel_name;
        this.channel_arr[this.channel_num] = this.channel_name;
    }
}

package com.mianweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by chen on 2018/11/22.
 */

public class Basic {

    @SerializedName("city")
    public String cityName;

    @SerializedName("id")
    public String weatherId;

    public Update update;

    public class Update {

        @SerializedName("loc")
        public String updateTime;
    }
}

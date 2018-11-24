package com.mianweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by chen on 2018/11/22.
 */

public class Now {

    @SerializedName("tmp")
    public String temperature;

    @SerializedName("cond")
    public More more;

    public class More {
        @SerializedName("txt")
        public String info;
    }

}

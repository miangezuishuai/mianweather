package com.mianweather.android.db;

import org.litepal.crud.LitePalSupport;

/**
 * Created by chen on 2018/11/16.
 */

public class County extends LitePalSupport {

    private  int id;

    private String countName;

    private String weatherId; //天气id

    private int cithId; //当前所属市的id值

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCountName() {
        return countName;
    }

    public void setCountName(String countName) {
        this.countName = countName;
    }

    public String getWeatherId() {
        return weatherId;
    }

    public void setWeatherId(String weatherId) {
        this.weatherId = weatherId;
    }

    public int getCithId() {
        return cithId;
    }

    public void setCithId(int cithId) {
        this.cithId = cithId;
    }
}

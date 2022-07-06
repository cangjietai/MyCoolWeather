package com.lisitao.coldweather.gson;

import com.google.gson.annotations.SerializedName;

/**
 *
 */
public class Basic {

    @SerializedName("city")   // json字段
    public String cityName;   // java字段

    @SerializedName("id")
    public String weatherId;


    public Update update; // 两者名字相同则不需要 使用注解映射

    public class Update {

        @SerializedName("loc")
        public String updateTime;
    }
}

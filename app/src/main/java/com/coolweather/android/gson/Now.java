package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by user on 2017/10/19.
 */

public class Now {

    @SerializedName("tmp")
    public String temperture;

    @SerializedName("cond")
    public More more;

    public class More{

        @SerializedName("txt")
        public String info;

    }

}

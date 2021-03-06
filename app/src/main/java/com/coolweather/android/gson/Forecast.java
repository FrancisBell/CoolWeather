package com.coolweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Francis on 2017.12.8.
 */

public class Forecast {

    public String date;

    @SerializedName("tmp")
    public Temperature temperature;

    @SerializedName("cond")
    public More more;

    public class Temperature {

        public String max;

        public String min;

    }

    public class More {

        @SerializedName("text_d")
        public String info;

    }

}

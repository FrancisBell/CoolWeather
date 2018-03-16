package com.coolweather.android.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by Francis on 2017.12.6.
 *
 * 发起一条 http 请求只需要调用 sendOkHttpRequest() 方法，传人请求地址，
 * 并注册一个回调来处理服务器请求即可
 */

public class HttpUtil {

    public static void sendOkHttpRequest(String address, okhttp3.Callback callback) {
        OkHttpClient client = new OkHttpClient();
        Request request = new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
    }

}

package com.example.mylib;

import java.io.IOException;

import okhttp3.Interceptor;
import okhttp3.OkHttpClient;
import okhttp3.Response;

/**
 * Create by lizongrun
 * Create Date 2019/11/4 12:02
 */
public class MyUtils {
    public static String test(){
        return "测试数据";
    }
    public static String test1(){
        return "测试数据1";
    }
    public static String test2(){
        return "测试数据2";
    }
    public static String test3(){
        OkHttpClient okHttpClient = new OkHttpClient();
        okHttpClient.newBuilder().addInterceptor(new Interceptor() {
            @Override
            public Response intercept(Chain chain) throws IOException {
                return null;
            }
        });
        return "测试数据3";
    }
}

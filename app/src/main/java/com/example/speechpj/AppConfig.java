package com.example.speechpj;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class AppConfig {

    public static Retrofit getRetrofit() {
        String BASE_URL = "https://192.168.100.5";
        return new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }
}

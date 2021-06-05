package com.example.speechpj;

import java.io.File;

import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;

public interface ApiConfig {
    @Multipart
    @POST("/files/")
    Call<ServerResponse> uploadMulFile(@Part MultipartBody.Part file);
}

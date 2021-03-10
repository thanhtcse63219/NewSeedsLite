package com.example.apartmentcitizen.network;

import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;

public interface UploadMultipartImageService {
    @Multipart
    @POST("postImages/images")
    Call<ResponseBody> uploadImage(@Part MultipartBody.Part file, @Part("name") RequestBody requestBody);
}

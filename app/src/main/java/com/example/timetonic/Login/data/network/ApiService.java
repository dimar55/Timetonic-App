package com.example.timetonic.Login.data.network;


import com.example.timetonic.Login.data.model.response.CreateAppKeyResponse;
import com.example.timetonic.Login.data.model.response.CreateOauthKeyResponse;
import com.example.timetonic.Login.data.model.response.CreateSessKeyResponse;

import retrofit2.Call;

import retrofit2.http.POST;
import retrofit2.http.Query;

public interface ApiService {
    @POST("api.php")
    Call<CreateAppKeyResponse> CreateAppKey(
            @Query("version") String version,
            @Query("req") String req,
            @Query("version") String appname
            );

    @POST("api.php")
    Call<CreateOauthKeyResponse> CreateOauthKey(
            @Query("version") String version,
            @Query("req") String req,
            @Query("login") String login,
            @Query("pwd") String pwd,
            @Query("appkey") String appkey

    );

    @POST("api.php")
    Call<CreateSessKeyResponse> CreateSessKey(
            @Query("version") String version,
            @Query("req") String req,
            @Query("o_u") String o_u,
            @Query("u_c") String u_c,
            @Query("oauthkey") String oauthkey
    );
}

package com.example.timetonic.Books.data.network;

import com.example.timetonic.Books.data.model.response.AllBookResponse;
import com.example.timetonic.Login.data.model.response.CreateAppKeyResponse;

import retrofit2.Call;
import retrofit2.http.POST;
import retrofit2.http.Query;

public interface ApiService {

    @POST("api.php")
    Call<AllBookResponse> getAllBook(
            @Query("version") String version,
            @Query("req") String req,
            @Query("u_c") String u_c,
            @Query("o_u") String o_u,
            @Query("sesskey") String sesskey
    );
}

package com.example.timetonic.Login.data.repository;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.example.timetonic.Login.data.model.response.CreateAppKeyResponse;
import com.example.timetonic.Login.data.model.response.CreateOauthKeyResponse;
import com.example.timetonic.Login.data.model.response.CreateSessKeyResponse;
import com.example.timetonic.Login.data.network.ApiService;
import com.example.timetonic.Login.data.network.RetrofitClient;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class LoginRepository {
    private ApiService apiService;

    public LoginRepository(){
        apiService = RetrofitClient.getApiService();
    }

    public LiveData<CreateAppKeyResponse> getCreateAppKeyData(String version, String req, String appname) {
        final MutableLiveData<CreateAppKeyResponse> data = new MutableLiveData<>();
        apiService.CreateAppKey(version, req, appname).enqueue(new Callback<CreateAppKeyResponse>() {
            @Override
            public void onResponse(Call<CreateAppKeyResponse> call, Response<CreateAppKeyResponse> response) {
                if (response.isSuccessful()) {
                    data.setValue(response.body());
                } else {
                    data.setValue(null);
                }
            }

            @Override
            public void onFailure(Call<CreateAppKeyResponse> call, Throwable t) {
                data.setValue(null);
            }
        });
        return data;
    }

    public LiveData<CreateOauthKeyResponse> getCreateOauthKeyData(String version, String req, String login, String pwd, String appkey) {
        final MutableLiveData<CreateOauthKeyResponse> data = new MutableLiveData<>();
        apiService.CreateOauthKey(version, req, login, pwd,appkey ).enqueue(new Callback<CreateOauthKeyResponse>() {
            @Override
            public void onResponse(Call<CreateOauthKeyResponse> call, Response<CreateOauthKeyResponse> response) {
                if (response.isSuccessful()) {
                    data.setValue(response.body());
                } else {
                    data.setValue(null);
                }
            }

            @Override
            public void onFailure(Call<CreateOauthKeyResponse> call, Throwable t) {
                data.setValue(null);
            }
        });
        return data;
    }



    public LiveData<CreateSessKeyResponse> getCreateSessKeyData(String version, String req, String o_u ,String u_c, String oauthkey ) {
        final MutableLiveData<CreateSessKeyResponse> data = new MutableLiveData<>();
        apiService.CreateSessKey(version, req, o_u, u_c, oauthkey).enqueue(new Callback<CreateSessKeyResponse>() {
            @Override
            public void onResponse(Call<CreateSessKeyResponse> call, Response<CreateSessKeyResponse> response) {
                if (response.isSuccessful()) {
                    data.setValue(response.body());
                } else {
                    data.setValue(null);
                }
            }

            @Override
            public void onFailure(Call<CreateSessKeyResponse> call, Throwable t) {
                data.setValue(null);
            }
        });
        return data;
    }



}

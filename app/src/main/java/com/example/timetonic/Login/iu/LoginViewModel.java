package com.example.timetonic.Login.iu;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

import com.example.timetonic.Login.data.model.response.CreateAppKeyResponse;
import com.example.timetonic.Login.data.model.response.CreateOauthKeyResponse;
import com.example.timetonic.Login.data.model.response.CreateSessKeyResponse;
import com.example.timetonic.Login.data.repository.LoginRepository;

public class LoginViewModel extends ViewModel {
    private LoginRepository loginRepository;

    public LoginViewModel() {
        loginRepository = new LoginRepository();
    }

    public LiveData<CreateAppKeyResponse> getCreateAppKeyData(String version, String req, String appname){
        return loginRepository.getCreateAppKeyData(version, req, appname);
    }
    public LiveData<CreateOauthKeyResponse> getCreateOauthKeyData(String version, String req, String login, String pwd, String appkey){
        return loginRepository.getCreateOauthKeyData( version,req,login, pwd, appkey);
    }
    public LiveData<CreateSessKeyResponse> getCreateSessKeyData(String version, String req, String o_u , String u_c, String oauthkey ) {
        return loginRepository.getCreateSessKeyData(version, req, o_u , u_c, oauthkey);
    }
}

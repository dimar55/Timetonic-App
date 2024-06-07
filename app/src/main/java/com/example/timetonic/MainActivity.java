package com.example.timetonic;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.timetonic.Books.iu.ListActivity;
import com.example.timetonic.Login.data.model.response.CreateAppKeyResponse;
import com.example.timetonic.Login.data.model.response.CreateOauthKeyResponse;
import com.example.timetonic.Login.data.model.response.CreateSessKeyResponse;
import com.example.timetonic.Login.iu.LoginViewModel;

public class MainActivity extends AppCompatActivity {

     private LoginViewModel loginViewModel;
    private TextView  emailEditText, pswEditText;
    private Button buttonLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        emailEditText = findViewById(R.id.editTextEmail);
        pswEditText = findViewById(R.id.editTextPsw);
        buttonLogin = findViewById(R.id.buttonLogin);

        loginViewModel = new ViewModelProvider(MainActivity.this).get(LoginViewModel.class);

        buttonLogin.setOnClickListener(view -> {
            String email = emailEditText.getText().toString();
            String psw = pswEditText.getText().toString();
            createOauthKey(email,psw);
        });
    }


    private void createOauthKey(String email, String psw){
        loginViewModel.getCreateOauthKeyData(Constants.VERSION, Constants.CREATE_OAUTH_KEY, email, psw, Constants.APP_KEY).observe(MainActivity.this, new Observer<CreateOauthKeyResponse>() {

            @Override
            public void onChanged(CreateOauthKeyResponse createOauthKeyResponse) {
                if(createOauthKeyResponse!=null){
                    if (createOauthKeyResponse.getStatus().equals("ok")){
                        createSession(createOauthKeyResponse.getO_u(), createOauthKeyResponse.getOauthkey());

                    }else{
                        Toast.makeText(MainActivity.this, "Credentials Invalids", Toast.LENGTH_SHORT).show();
                    }
                }else{
                    Toast.makeText(MainActivity.this, "Error", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    public void createAppKey(){
        loginViewModel.getCreateAppKeyData(Constants.VERSION,Constants.CREATE_APP_KEY, Constants.APP_NAME).observe(MainActivity.this, new Observer<CreateAppKeyResponse>() {
               @Override
                public void onChanged(CreateAppKeyResponse createAppKeyResponse) {
                  if(createAppKeyResponse!=null){
                       //Toast.makeText(MainActivity.this, "Correct", Toast.LENGTH_SHORT).show();
                   }else{
                        Toast.makeText(MainActivity.this, "Error in Create App Key", Toast.LENGTH_SHORT).show();
                    }
                }
            });
    }

    private void createSession(String o_u, String oauthKey){
        loginViewModel.getCreateSessKeyData(Constants.VERSION, Constants.CREATE_SESSION_KEY, o_u, "", oauthKey).observe(MainActivity.this, new Observer<CreateSessKeyResponse>() {
            @Override
            public void onChanged(CreateSessKeyResponse createSessKeyResponse) {
                if(createSessKeyResponse!=null){
                    if (createSessKeyResponse.getStatus().equals("ok")){
                        Toast.makeText(MainActivity.this, "Correct Session", Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(MainActivity.this, ListActivity.class);
                        intent.putExtra("O_U",o_u);
                        intent.putExtra("SESS_KEY", createSessKeyResponse.getSesskey());
                        startActivity(intent);
                    }

                }else{
                    Toast.makeText(MainActivity.this, "Error in the Session ", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
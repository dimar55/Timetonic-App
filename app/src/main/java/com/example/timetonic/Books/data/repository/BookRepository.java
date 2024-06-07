package com.example.timetonic.Books.data.repository;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.example.timetonic.Books.data.model.response.AllBookResponse;
import com.example.timetonic.Books.data.network.ApiService;
import com.example.timetonic.Books.data.network.RetrofitClient;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class BookRepository {

    private ApiService apiService;

    public BookRepository(){
        apiService = RetrofitClient.getApiService();
    }

    public LiveData<AllBookResponse> getAllBookData( String version, String req, String u_c, String o_u, String sesskey) {
        final MutableLiveData<AllBookResponse> data = new MutableLiveData<>();
        apiService.getAllBook(version, req, u_c,o_u, sesskey ).enqueue(new Callback<AllBookResponse>() {
            @Override
            public void onResponse(Call<AllBookResponse> call, Response<AllBookResponse> response) {
                if (response.isSuccessful()) {
                    data.setValue(response.body());
                } else {
                    data.setValue(null);
                }
            }

            @Override
            public void onFailure(Call<AllBookResponse> call, Throwable t) {
                data.setValue(null);
            }
        });
        return data;
    }

}

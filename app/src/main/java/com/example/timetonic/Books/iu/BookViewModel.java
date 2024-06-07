package com.example.timetonic.Books.iu;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

import com.example.timetonic.Books.data.model.response.AllBookResponse;
import com.example.timetonic.Books.data.repository.BookRepository;
import com.example.timetonic.Login.data.model.response.CreateAppKeyResponse;


public class BookViewModel  extends ViewModel {
    private BookRepository bookRepository;

    public BookViewModel() {
        bookRepository = new BookRepository();
    }

    public LiveData<AllBookResponse> getAllBookData(String version, String req, String u_c, String o_u, String sesskey){
        return bookRepository.getAllBookData(version, req, u_c, o_u, sesskey);
    }

}

package com.example.timetonic.Books.iu;

import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.timetonic.Books.data.model.response.AllBookResponse;
import com.example.timetonic.Books.data.model.response.BookDisplay;
import com.example.timetonic.Books.iu.adapter.AdapterBooks;
import com.example.timetonic.Constants;
import com.example.timetonic.R;

import java.util.ArrayList;
import java.util.List;

public class ListActivity extends AppCompatActivity {

    private BookViewModel bookViewModel;
    private RecyclerView recyclerView;
    private AdapterBooks adapter;
    private static final String IMAGE_URL = "https://timetonic.com/live";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.landing_page);
        bookViewModel = new ViewModelProvider(ListActivity.this).get(BookViewModel.class);
        recyclerView = findViewById(R.id.books);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new AdapterBooks();
        recyclerView.setAdapter(adapter);

        String o_u = getIntent().getStringExtra("O_U");
        String sess_key = getIntent().getStringExtra("SESS_KEY");
        getAllbook(o_u,sess_key);
    }

    private void getAllbook(String o_u, String oauthKey){
        bookViewModel.getAllBookData(Constants.VERSION, Constants.GET_ALL_BOOK, o_u, o_u, oauthKey).observe(ListActivity.this, new Observer<AllBookResponse>() {
            @Override
            public void onChanged(AllBookResponse allBookResponse) {
                if(allBookResponse!=null){
                    if (allBookResponse.getStatus().equals("ok")){
                        List<BookDisplay> books = mapBooks(allBookResponse.getAllBooks().getBooks());
                        adapter.setBooks(books);

                    }
                    Toast.makeText(ListActivity.this, "Todo Correcto", Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText(ListActivity.this, "Error", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    private List<BookDisplay> mapBooks(List<AllBookResponse.Book> books) {
        List<BookDisplay> bookDisplayList = new ArrayList<>();
        for (AllBookResponse.Book book : books) {
            String bookName = book.getOwnerPrefs().getTitle();
            String bookImg = IMAGE_URL + (book.getOwnerPrefs().getoCoverImg() != null ? book.getOwnerPrefs().getoCoverImg().replace("/dev", "") : "");
            bookDisplayList.add(new BookDisplay(bookName, bookImg));
        }
        return bookDisplayList;
    }

}

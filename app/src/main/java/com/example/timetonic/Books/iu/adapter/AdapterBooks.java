package com.example.timetonic.Books.iu.adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.timetonic.Books.data.model.response.BookDisplay;
import com.example.timetonic.R;
import com.squareup.picasso.Picasso;

import java.util.List;

public class AdapterBooks extends RecyclerView.Adapter<AdapterBooks.ViewHolder>{

    private List<BookDisplay> books;


    @NonNull
    @Override
    public AdapterBooks.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View v;
        v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_book, parent, false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterBooks.ViewHolder holder, int position) {
        BookDisplay book = books.get(position);
        holder.titleBook.setText(book.getBookName());
        Picasso.get().load(book.getBookImg()).into(holder.imageBook);
    }

    @Override
    public int getItemCount() { return (books != null) ? books.size() : 0;}

    @SuppressLint("NotifyDataSetChanged")
    public void setBooks(List<BookDisplay> books) {
        this.books = books;
        notifyDataSetChanged();
    }


    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView titleBook;
        ImageView imageBook;
        public ViewHolder(View itemView) {
            super(itemView);
            titleBook = itemView.findViewById(R.id.text_book);
            imageBook = itemView.findViewById(R.id.imageBook);
        }
    }
}

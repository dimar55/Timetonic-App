package com.example.timetonic.Books.data.model.response;

public class BookDisplay {
    private String bookName;
    private String bookImg;

    public BookDisplay(String bookName, String bookImg) {
        this.bookName = bookName;
        this.bookImg = bookImg;
    }

    // Getters y setters
    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getBookImg() {
        return bookImg;
    }

    public void setBookImg(String bookImg) {
        this.bookImg = bookImg;
    }
}
package com.company;

import java.util.ArrayList;

public class BookAdd {
    private String title;
    private String author;
    private String year;
    private String isbn;
    private String availBooks;
    private ArrayList<BookAdd> bookAdds;

    public BookAdd(String s){

    }
    public BookAdd(String title, String author, String year, String isbn){
        this.title = title;
        this.author = author;
        this.year = year;
        switch (this.isbn = isbn) {
        }
    }

    public BookAdd(ArrayList<BookAdd> bookAdds) {
        this.bookAdds = bookAdds;
    }

    public BookAdd() {

    }

    public String getTitle(String s) {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor(String s) {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public ArrayList<BookAdd> getBookAdds() {
        return bookAdds;
    }

    public void setBookAdds(ArrayList<BookAdd> bookAdds) {
        this.bookAdds = bookAdds;
    }

    public String getAvailBooks() {
        return availBooks;
    }

    public void setAvailBooks(String availBooks) {
        this.availBooks = availBooks;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }
}

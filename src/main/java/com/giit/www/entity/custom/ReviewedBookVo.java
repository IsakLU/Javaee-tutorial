package com.giit.www.entity.custom;

import java.util.List;

/**
 * Created by c0de8ug on 16-2-16.
 */
public class ReviewedBookVo {
    String bookTitle;
    String isbn;
    String dateOfPrinting;
    String author;
    String press;
    List<Integer> countList;
    int amount;

    public int getAmount() {
        return amount;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getDateOfPrinting() {
        return dateOfPrinting;
    }

    public void setDateOfPrinting(String dateOfPrinting) {
        this.dateOfPrinting = dateOfPrinting;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPress() {
        return press;
    }

    public void setPress(String press) {
        this.press = press;
    }

    public List<Integer> getCountList() {
        return countList;
    }

    public void setCountList(List<Integer> countList) {
        this.countList = countList;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}

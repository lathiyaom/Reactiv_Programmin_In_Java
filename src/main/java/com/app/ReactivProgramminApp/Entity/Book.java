package com.app.ReactivProgramminApp.Entity;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Table(name = "bookdetails")
public class Book {

    @Id
    private int bookid;

    private String name;

    private String Descriptions;

    private String publisher;

    private String author;

    public int getBookid() {
        return bookid;
    }

    public void setBookid(int bookid) {
        this.bookid = bookid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescriptions() {
        return Descriptions;
    }

    public void setDescriptions(String descriptions) {
        Descriptions = descriptions;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Book() {
    }

    public Book(int bookid, String name, String descriptions, String publisher, String author) {
        this.bookid = bookid;
        this.name = name;
        Descriptions = descriptions;
        this.publisher = publisher;
        this.author = author;
    }
}

package com.example.project;

public class Book{
    //requires 5 attributes String title, String author, int yearPublished, String isbn, int quantity
    private String title;
    private String author;
    private int yearPublished;
    private String isbn;
    private int quantity;

    //requires 1 constructor with 5 arguments that intitialize the attribtues of the class.
    // public constructor
    public Book(String title, String author, int yearPublished, String isbn, int quantity) {
        // initalizes all instance variables to according arguments in parameters
        this.title = title; 
        this.author = author;
        this.yearPublished = yearPublished;
        this.isbn = isbn;
        this.quantity = quantity;
    }

    // getter method for title
    public String getTitle() {
        // returns title
        return title;
    }

    // setter method for title
    public void setTitle(String title) {
        // sets title to new title
        this.title = title;
    }

    // getter method for author
    public String getAuthor() {
        // returns author
        return author;
    }

    // setter method for author
    public void setAuthor(String author) {
        // sets author to new author
        this.author = author;
    }

    // getter method for year published
    public int getYearPublished() {
        // returns year
        return yearPublished;
    }

    // setter method for year published
    public void setYearPublished(int yearPublished) {
        // sets year to new year
        this.yearPublished = yearPublished;
    }

    // getter method for isbn
    public String getIsbn() {
        // returns isbn
        return isbn;
    }

    // setter method for isbn
    public void setIsbn(String isbn) {
        // sets isbn to new isbn
        this.isbn = isbn;
    }

    // getter method for quantity
    public int getQuantity() {
        // returns quantity
        return quantity;
    }

    // setter method for quantity
    public void setQuantity(int quantity) {
        // sets quantity to new quantity
        this.quantity = quantity;
    }

    // method that returns string with book info
    public String bookInfo() {
        // uses instance variables for information
        return "Title: " + title + ", Author: " + author + ", Year: " + yearPublished + ", ISBN: " + isbn + ", Quantity: " + quantity;
    } //returns "Title: [], Author: [], Year: [], ISBN: [], Quantity: []"
       
}
package com.example.project;

public class User{
    //requires 3 private attributes String name, String Id, Book book that is initialized to empty
    // 3 private instance variables
    private String name;
    private String Id;
    private Book[] bookList = new Book[5]; // empty book list with max 5 books

    //requires 1 contructor with two parameters that will initialize the name and id
    // public constructor with two parameters
    public User(String name, String Id) {
        // initalizes name and id instance variables to parameter arguments
        this.name = name;
        this.Id = Id;
    }
 
    // getter method for name
    public String getName() {
        return name;
    }

    // setter method for name
    public void setName(String name) {
        this.name = name;
    }

    // getter method for Id
    public String getId() {
        return Id;
    }

    // setter method for Id
    public void setId(String Id) {
        this.Id = Id;
    }

    // getter method for book 
    public Book[] getBooks() {
        return bookList;
    }

    // setter method for book
    public void setBooks(Book[] bookList) {
        this.bookList = bookList;
    }

    // public method that returns a String with booklist info
    public String bookListInfo() {
        // initalizes returnStr to an empty string
        String returnStr = "";
        // uses a loop to add info of the books to the returnStr
        for (int i = 0; i < 5; i++) {
            // checks for empty elements
            if (bookList[i] == null) {
                returnStr += "empty";
            }
            // adds bookInfo to returnStr
            else {
                returnStr += bookList[i].bookInfo();
            }
            // adds a line skip
            returnStr += "\n";
        }
        return returnStr;
    } //returns a booklist for the user, if empty, output "empty"

    // public method that returns string with user Info
    public String userInfo() {
        // returns a list of information on user and calls bookListInfo() method to add book info
        return "Name: " + name + "\nId: " + Id + "\nBooks: \n" + bookListInfo();
    } //returns  "Name: []\nID: []\nBooks:\n[]"
       
}
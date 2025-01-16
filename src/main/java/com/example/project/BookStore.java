package com.example.project;

public class BookStore{

    //requires at least 2 attributes Book[] books, User[] users (initialized to an empty array of 10 max users) 
    private Book[] books = new Book[0];
    // initalizes user list to have a length of 10
    private User[] users = new User[10];

    //requires 1 empty constructor
    public BookStore() {}

    // getter method for users 
    public User[] getUsers() {
        // returns user arrary
        return users;
    }

    // setter method for users
    public void setUsers(User[] users) {
        // sets users to new users
        this.users = users;
    }

    // getter method for book list
    public Book[] getBooks() {
        // returns book array
        return books;
    }

    // setter method for books
    public void setBooks(Book[] books) {
        this.books = books;
    }

    // method to add user to user array
    public void addUser(User user) {
        // initalizes firstIdx variable to -1 
        // stores the first empty index in users
        int firstIdx = -1;
        // uses a loop to find first empty index
        for (int i = 0; i < users.length; i++) {
            // if the element is both null and firstIdx doesn't already have a value other than -1
            if (users[i] == null && firstIdx == -1) {
                // stores i as the firstIdx position
                firstIdx = i;
            }
        }
        // adds user to users array at index firstIdx
        users[firstIdx] = user;
    } 

    // method to remove user from users array
    public void removeUser(User user) {
        // uses a loop to find index of removed user
        for (int i = 0; i < users.length; i++) {
            // if the user isn't null and is the removed user
            if (users[i] != null && users[i].equals(user)) {
                // remove by making element null
                users[i] = null;
            }
        }
        // consolidates user list
        consolidateUsers();
    }

    // method to consolidate users array
    public void consolidateUsers() {
        // initalizes a newUsers array with same length
        User[] newUsers = new User[users.length];
        // initalizes an index variable for newUsers array
        int k = 0;
        // uses a loop to iterate through users list
        for (int i = 0; i < users.length; i++) {
            // checks if element is not empty
            if (users[i] != null) {
                // adds user to newUsers array
                newUsers[k] = users[i];
                // increments index
                k++;
            }
        }
        // replaces users reference to the newUsers array
        users = newUsers;
    }

    // method to add a book to booklist
    public void addBook(Book book){
        // initalizes newBooks array to a length one more than books
        Book[] newBooks = new Book[books.length + 1];
        // uses a loop to copy every element to newBooks array
        for (int i = 0; i < books.length; i++) {
            newBooks[i] = books[i];
        }
        // the added book is added at the very end
        newBooks[books.length] = book;
        // replaces the reference of books to newBooks array
        books = newBooks;
    }

    // method to insert a book at a reference
    public void insertBook(Book book, int index) {
        // initalizes newBooks array to one longer than length
        Book[] newBooks = new Book[books.length + 1];
        // initalizes index variable for newBooks
        int k = 0;
        // uses a loop to add previous books to new array 
        for (int i = 0; i < books.length; i++) {
            newBooks[k] = books[i];
            // increments index
            k++;
            // checks if k is equal to index because at index, it should be the book inserted
            if (k == index) {
                // inserts book
                newBooks[k] = book;
                // increments index
                k++;
            }
        }
        // replaces reference of books to newBooks
        books = newBooks;
    }

    // method to remove a book from books array
    public void removeBook(Book book) {
        for (int i = 0; i < books.length; i++) {
            if (books[i] == book) {
                books[i].setQuantity(books[i].getQuantity() - 1);
                if (books[i].getQuantity() == 0) {
                    // initalizes newBooks array to length one less
                    Book[] newBooks = new Book[books.length - 1];
                    // initalizes an index variable for newBooks
                    int k = 0;
                    // uses a loop to iterate 
                    for (int j = 0; j < books.length; j++) {
                        // checks the book is not the removed book
                        if (!(books[j].equals(book))) {
                            // adds the book to the new array
                            newBooks[k] = books[j];
                            // increments index
                            k++;
                        }
                    }
                    // replaces the reference of books to the newBooks 
                    books = newBooks;
                }
            }
        }
    }
       
    // method for string with book store info
    public String bookStoreBookInfo() {
        // initalizes returnStr to empty string
        String returnStr = "";
        // uses a loop to add all book info to returnStr
        for (int i = 0; i < books.length; i++) {
            returnStr += books[i].bookInfo();
            // skips a line
            returnStr += "\n";
        }
        return returnStr;
    } //you are not tested on this method but use it for debugging purposes

    // 
    public String bookStoreUserInfo(){
        // initalizes returnStr to empty string
        String returnStr = "";
        // uses a loop to add all user info to returnStr
        for (int i = 0; i < users.length; i++) {
            returnStr += users[i].userInfo();
            // skips a line
            returnStr += "\n";
        }
        return returnStr;
    } //you are not tested on this method but use it for debugging purposes

}
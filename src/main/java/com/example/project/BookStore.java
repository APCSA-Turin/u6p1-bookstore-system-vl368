package com.example.project;

public class BookStore{

    //requires at least 2 attributes Book[] books, User[] users (initialized to an empty array of 10 max users) 
    private Book[] books;
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
    public void removeUser(User user){
        // initalizes newUsers array to length of users array - 1 because of removal
        User[] newUsers = new User[users.length - 1];
        // initalizes k the index of the newUsers array
        int k = 0;
        // uses a loop to add every user but the removed user to the new list
        for (int i = 0; i < users.length; i++) {
            // if the user isn't the removed user,
            if (!(users[i].equals(user))) {
                // then add the user to the newUsers array
                newUsers[k] = users[i];
                // increments newUsers's index 
                k++;
            }
        }
        // replaces the reference of users to newUsers
        // users now does not contain the removed user
        users = newUsers;
    }

    // public void consolidateUsers(){}

    // public void addBook(Book book){}

    // public void insertBook(Book book, int index){}

    // public void removeBook(Book book){}
       
    // public String bookStoreBookInfo(){} //you are not tested on this method but use it for debugging purposes

    // public String bookStoreUserInfo(){} //you are not tested on this method but use it for debugging purposes

}
package com.example.project;

public class IdGenerate{ //This class contains statics variable and methods, you do not initalize an object to use it.
    
    // //requires 1 private attribute String currentId. You must initialize it to 99
    // initalizes currentId to 99 string
    private static String currentId = "99";

    // empty constructor
    public IdGenerate() {}

    // getter method for Id
    public static String getCurrentId() {
        return currentId;
    }

    // method resets currentId to 99 string
    public static void reset() {
        currentId = "99";
    } //must reset the currentId back to 99


    // method generates new Id
    public static void generateID() {
        // parses currentId to int using Integer class
        // increments by 1
        // converts this int to String using Integer class
        currentId = Integer.toString(Integer.parseInt(currentId) + 1);
    } //generates a new id, when called it will increment the currentId by 1.. Hint pay attention to data type of currentId
}
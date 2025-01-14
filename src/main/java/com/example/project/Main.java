package com.example.project;

public class Main {
    public static void main(String[] args) {
        // Id Generate class tests // expected outputs
        System.out.println(IdGenerate.getCurrentId()); // 99
        System.out.println(IdGenerate.generateID()); // 100
        System.out.println(IdGenerate.getCurrentId()); // 100
        System.out.println(IdGenerate.generateID()); // 101
        System.out.println(IdGenerate.getCurrentId()); // 101
        IdGenerate.reset(); // void method
        System.out.println(IdGenerate.getCurrentId()); // 99

        // User class tests // expected outputs
        IdGenerate.generateID(); // 100
        User josh = new User("Josh", IdGenerate.getCurrentId());
    }
}
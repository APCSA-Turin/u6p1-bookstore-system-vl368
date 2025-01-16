package com.example.project;

public class Main {
    public static void main(String[] args) {
        // Id Generate class tests // expected outputs
        System.out.println(IdGenerate.getCurrentId()); // 99
        IdGenerate.generateID(); // 100
        System.out.println(IdGenerate.getCurrentId()); // 100
        IdGenerate.generateID(); // 101
        System.out.println(IdGenerate.getCurrentId()); // 101
        IdGenerate.reset(); // void method
        System.out.println(IdGenerate.getCurrentId()); // 99

        // User class tests // expected outputs
        IdGenerate.generateID(); // 100
        User josh = new User("Josh", IdGenerate.getCurrentId());

        BookStore store = new BookStore(); 
        Book b1 = new Book("The Great Gatsby","Scott Fitzgerald", 1925, "979-8351145013",3);
        Book b2 = new Book("The Outliers", "Malcolm Gladwell",2008,"978-0316017930",1);
        Book b3 = new Book("1984", "George Orwell", 1949, "978-0451524935", 5);
        Book b4 = new Book("Brave New World", "Aldous Huxley", 1932, "978-0060850524", 3);
        Book b5 = new Book("Test","Author",1900, "1234", 1);
        Book[] expected = {b1,b2,b3,b4,b5};
        BookStore expectedStore = new BookStore();
        expectedStore.setBooks(expected);

        store.addBook(b1);
        store.addBook(b2);
        store.addBook(b3);
        store.addBook(b4);
        store.addBook(b5);
        store.removeBook(b1);
        
        store.removeBook(b1);
        
        System.out.println(expectedStore.bookStoreBookInfo());
        System.out.println(store.bookStoreBookInfo());
        System.out.println(expected.equals(store.getBooks()));
    }
}
package com.example.project;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Id Generate class tests // expected outputs
        // System.out.println(IdGenerate.getCurrentId()); // 99
        // IdGenerate.generateID(); // 100
        // System.out.println(IdGenerate.getCurrentId()); // 100
        // IdGenerate.generateID(); // 101
        // System.out.println(IdGenerate.getCurrentId()); // 101
        // IdGenerate.reset(); // void method
        // System.out.println(IdGenerate.getCurrentId()); // 99

        // // User class tests // expected outputs
        // IdGenerate.generateID(); // 100
        // User josh = new User("Josh", IdGenerate.getCurrentId());

        // BookStore store = new BookStore(); 
        // Book b1 = new Book("The Great Gatsby","Scott Fitzgerald", 1925, "979-8351145013",3);
        // Book b2 = new Book("The Outliers", "Malcolm Gladwell",2008,"978-0316017930",1);
        // Book b3 = new Book("1984", "George Orwell", 1949, "978-0451524935", 5);
        // Book b4 = new Book("Brave New World", "Aldous Huxley", 1932, "978-0060850524", 3);
        // Book b5 = new Book("Test","Author",1900, "1234", 1);
        // Book[] expected = {b1,b2,b3,b4,b5};
        // BookStore expectedStore = new BookStore();
        // expectedStore.setBooks(expected);

        // store.addBook(b1);
        // store.addBook(b2);
        // store.addBook(b3);
        // store.addBook(b4);
        // store.addBook(b5);
        // store.removeBook(b1);
        
        // store.removeBook(b1);
        
        // System.out.println(expectedStore.bookStoreBookInfo());
        // System.out.println(store.bookStoreBookInfo());
        // System.out.println(expected.equals(store.getBooks()));

        // initalizes scanner
        Scanner scan = new Scanner(System.in);
        // initalizes input variable
        int numInput = -1;
        String input = "";
        // initializes and sets up book store
        BookStore bookStore = new BookStore();

        // sets up a while loop that doesn't quit until input is = to 0
        while (numInput != 0) {
            // menu print
        System.out.println("=====|B|O|O|K |S|T|O|R|E|=====");
        System.out.println("========LONDON, ENGLAND=======");
        System.out.println("");
        System.out.println("MENU 1/1");
        System.out.println("TUESDAY, JANUARY 28, 2025");
        System.out.println("------------------------------");
        System.out.println(" NUM  -  OPTION            NUM");
        System.out.println("------------------------------");
        System.out.println(" 0  -  exit application      0");
        System.out.println(" 1  -  add new book          1");
        System.out.println(" 2  -  upgrade quantity      2");
        System.out.println("       of a book              ");
        System.out.println(" 3  -  search a book         3");
        System.out.println(" 4  -  show all books        4");
        System.out.println(" 5  -  register student      5");
        System.out.println(" 6  -  show all registered   6");
        System.out.println("       students               ");
        System.out.println(" 7  -  check out book        7");
        System.out.println(" 8  -  check in book         8");
        System.out.println("------------------------------");
        System.out.println(" OPTION COUNT:              09");
        System.out.println(" TOTAL                      09");
        System.out.println("------------------------------");
        System.out.println(" THANK YOU FOR VISTING ! :)   ");
        System.out.println(" visit bookstore.com          ");
        System.out.println(" submit survey code: 0123-4567");
        System.out.println("------------------------------");
        System.out.print(" Option Choice: ");
        // sets input equal to scanner value for option
        input = scan.next();
        // try catch in case of integer exception due to no integers to parse in input
        try {
            // parses input
            numInput = Integer.parseInt(input);
        }
        catch (NumberFormatException e) {
            // sets num input to a number that does not trigger an if else
            numInput = -1;
            // prints invalid for user
            System.out.println("------------------------------");
            System.out.println(" Invalid Option!");
            System.out.println("------------------------------");
        }
        // if else if statments for every option of numinput 1-8
        if (numInput == 1) {
            // add new book
            System.out.println("------------------------------");
            // initalizes book title
            System.out.print(" book title: ");
            String bookTitle = scan.next();
            // clears \n token
            scan.nextLine();
            // intalizes author name
            System.out.print(" author name: ");
            String author = scan.next();
            scan.nextLine();
            // initalizes year
            System.out.print(" year published: ");
            int year = scan.nextInt();
            // initalizes isbn
            System.out.print(" isbn: ");
            String isbn = scan.next();
            scan.nextLine();
            // initalizes quantity
            System.out.print(" quantity: ");
            int quantity = scan.nextInt();
            // creates new book with all info
            Book bookTemp = new Book(bookTitle, author, year, isbn, quantity);
            // adds to book store list
            bookStore.addBook(bookTemp);
            // prints message
            System.out.println("------------------------------");
            System.out.println(" BOOK ADD:                  +1");
            System.out.println(" TOTAL                      +1");
        }
        else if (numInput == 2) {
            // update quantity
            System.out.println("------------------------------");
            // initalizes isbn
            System.out.print(" book isbn: ");
            String isbn = scan.next();
            scan.nextLine();
            // initalizes target book as null
            Book targetBook = null;
            // uses loop to look for book inside book list
            for (Book book : bookStore.getBooks()) {
                // checks element isnt null and isbn is the same
                if (book != null && book.getIsbn().equals(isbn)) {
                    // sets targetBook to book
                    targetBook = book;
                }
            }
            // checks if its null
            if (targetBook != null) {
                // initalizes quantity
                System.out.print(" quantity update (n/-n): ");
                int increment = scan.nextInt();
                scan.nextLine();
                // increments targetbook's quantity
                targetBook.setQuantity(increment + targetBook.getQuantity());
                // prints message
                System.out.println("------------------------------");
                System.out.println(" QUANTITY:                  " + increment);
                System.out.println(" TOTAL                      " + targetBook.getQuantity());
            }
            else {
                // prints message about not finding isbn
                System.out.println("------------------------------");
                System.out.println(" BOOK ISBN NOT FOUND");
                System.out.println(" TRY AGAIN");
            }
        }
        else if (numInput == 3) {
            System.out.println("------------------------------");
            // initalizes isbn
            System.out.print(" book isbn: ");
            String isbn = scan.next();
            scan.nextLine();
            // initalizes target book as null
            Book targetBook = null;
            // uses loop to look for book inside book list
            for (Book book : bookStore.getBooks()) {
                // checks element isnt null and isbn is the same
                if (book != null && book.getIsbn().equals(isbn)) {
                    // sets targetBook to book
                    targetBook = book;
                }
            }
            // checks if target book is null
            if (targetBook != null) {
                // prints book info
                System.out.println("------------------------------");
                System.out.println(" BOOK INFO: ");
                System.out.println(" " + targetBook.bookInfo());
            }
            else {
                // prints message about not finding isbn
                System.out.println("------------------------------");
                System.out.println(" BOOK ISBN NOT FOUND");
                System.out.println(" TRY AGAIN");
            }
        }
        else if (numInput == 4) {
            // prints all book store book info
            System.out.println("------------------------------");
            System.out.println(" ALL BOOKS: ");
            System.out.println(" " + bookStore.bookStoreBookInfo());
        }
        else if (numInput == 5) {
            System.out.println("------------------------------");
            // initalizes user name
            System.out.print(" user name: ");
            String name = scan.next();
            scan.nextLine();
            // generates new ID and initalizes it
            IdGenerate.generateID();
            String iD = IdGenerate.getCurrentId();
            // creates new user
            User user = new User(name, iD);
            // adds new user
            bookStore.addUser(user);
            // prints message
            System.out.println("------------------------------");
            System.out.println(" USER ADD:                  +1");
            System.out.println(" TOTAL                      +1");
            System.out.println(" IF USER LIST IS FULL");
            System.out.println(" ITS UNSUCCESSFUL");
        }
        else if (numInput == 6) {
            // prints users
            System.out.println("------------------------------");
            System.out.println("\n\n USERS: ");
            System.out.println(bookStore.bookStoreUserInfo());
        }
        else if (numInput == 7) {
            System.out.println("------------------------------");
            // intalizes user id
            System.out.print(" user id: ");
            String iD = scan.next();
            scan.nextLine();
            // intializes isbn
            System.out.print(" book isbn: ");
            String isbn = scan.next();
            scan.nextLine();
            // initalizes target book as null
            Book targetBook = null;
            // uses loop to look for book inside book list
            for (Book book : bookStore.getBooks()) {
                // checks element isnt null and isbn is the same
                if (book != null && book.getIsbn().equals(isbn)) {
                    // sets targetBook to book
                    targetBook = book;
                }
            }
            // initalizes target user as null
            User targetUser = null;
            // uses loop to look for user inside user list
            for (User user : bookStore.getUsers()) {
                // chceks element isnt null and id is the same
                if (user != null && user.getId().equals(iD)) {
                    // sets target book to user
                    targetUser = user;
                }
            }
            // checks target book and user are not null
            if (targetBook != null && targetUser != null) {
                // prints message
                System.out.println("------------------------------");
                System.out.println(" CHECK OUT:                 +1");
                System.out.println(" TOTAL                      +1");
                // intializes to the user's book list
                Book[] userBooks = targetUser.getBooks();
                // initalizes firstIdx variable to -1 
                // stores the first empty index in users book
                int firstIdx = -1;
                // uses a loop to find first empty index
                for (int i = 0; i < userBooks.length; i++) {
                    // if the element is both null and firstIdx doesn't already have a value other than -1
                    if (userBooks[i] == null && firstIdx == -1) {
                        // stores i as the firstIdx position
                        firstIdx = i;
                    }
                }
                // adds book to users book array at index firstIdx
                if (firstIdx != -1) {
                    userBooks[firstIdx] = targetBook;
                }
                targetUser.setBooks(userBooks);
            }
            else {
                // prints message about not finding isbn
                System.out.println("------------------------------");
                System.out.println(" BOOK ISBN OR USER NOT FOUND");
                System.out.println(" TRY AGAIN");
            }
        }
        else if (numInput == 8) {S
            System.out.println("------------------------------");
            // intalizes user id
            System.out.print(" user id: ");
            String iD = scan.next();
            scan.nextLine();
            // intializes isbn
            System.out.print(" book isbn: ");
            String isbn = scan.next();
            scan.nextLine();
            // initalizes target book as null
            Book targetBook = null;
            // uses loop to look for book inside book list
            for (Book book : bookStore.getBooks()) {
                // checks element isnt null and isbn is the same
                if (book != null && book.getIsbn().equals(isbn)) {
                    // sets targetBook to book
                    targetBook = book;
                }
            }
            // initalizes target user as null
            User targetUser = null;
            // uses loop to look for user inside user list
            for (User user : bookStore.getUsers()) {
                // chceks element isnt null and id is the same
                if (user != null && user.getId().equals(iD)) {
                    // sets target book to user
                    targetUser = user;
                }
            }
            // checks target book and user are not null
            if (targetBook != null && targetUser != null) {
                // prints message
                System.out.println("------------------------------");
                System.out.println(" CHECK IN:                  +1");
                System.out.println(" TOTAL                      +1");
                Book[] userBooks = targetUser.getBooks();
                // uses a loop to find index of removed book
                for (int i = 0; i < userBooks.length; i++) {
                    // if the book element isn't null and is the removed book
                    if (userBooks[i] != null && userBooks[i].equals(targetBook)) {
                        // remove by making element null
                        userBooks[i] = null;
                    }
                }
            }
            else {
                // prints message about not finding isbn
                System.out.println("------------------------------");
                System.out.println(" BOOK ISBN NOT FOUND");
                System.out.println(" TRY AGAIN");
            }
        }
        // prints interface end message
        System.out.println("------------------------------");
        System.out.println(" THANK YOU FOR VISTING ! :)   ");
        System.out.println(" visit bookstore.com          ");
        System.out.println(" submit survey code: 0123-4567");
        System.out.println("------------------------------");
        System.out.println(" ENTER ANYTHING TO SEE MENU");
        // lets user linger on same menu until they enter something to see next menu
        scan.next();
        System.out.println("------------------------------");
        scan.nextLine();
        }
    }
}
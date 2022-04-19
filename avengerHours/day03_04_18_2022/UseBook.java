package day03_04_18_2022;

import java.util.ArrayList;

public class UseBook {
    public static void main(String[] args) {
        /*
        -Create a class named Library
        -create Book objects
        -find the number off all books in the
        library with the help of "static" feature
        -create allBooks arrayList
        -create fantasyBooks arraylist by using allBooks collection
         */
        Book book1 = new Book("Moby Dick", "adventure", "Herman Melville");
        book1.IDgenerator();
        System.out.println(book1);
        Book book2 = new Book("Becoming", "biography", "Michelle Obama");
        book2.IDgenerator();

        System.out.println(book2);
        System.out.println(Book.bookCount);
        ArrayList<Book> allBooks = new ArrayList<>();
        allBooks.add(book1);
        allBooks.add(book2);
        System.out.println("All Books: " + allBooks);
    }
}

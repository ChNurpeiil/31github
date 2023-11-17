package w10;

import java.util.ArrayList;
import java.util.List;

public class T11_P3_List {
    /*
    Create a static method named addBook() that simulates adding a new book to a library catalog. The method should take two parameters: an existing list of books (List<String>) and the Title of the new book to be added (String). The method should add the new book to the catalog and return the updated List<String>.

    Example #1:

    Parameters:

    List<String> books = {"Book 1", "Book 2", "Book 3"}
    String newBook = "Book 4"

    Return: List<String>

    {"Book 1", "Book 2", "Book 3", "Book 4"}
     */
    public static void main(String[] args) {
        List<String> catalog = new ArrayList<>();
        catalog.add("Book 1");
        catalog.add("Book 2");
        catalog.add("Book 3");

        String newBook = "Book 4";
        List<String> updated = addBook(catalog, newBook);
        System.out.println(updated);
    }

    public static List<String> addBook(List<String> books, String newBook) {
        books.add(newBook);
        return books;
    }
}

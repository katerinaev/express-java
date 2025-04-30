package practice_8.library.exceptions;

import practice_8.library.Book;
import practice_8.library.Library;

public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        library.addBook(new Book("1994", "Orwell"));
        library.addBook(new Book("Martin Eden", "London"));
        library.addBook(new Book("Onegin", "Pushkin"));
        library.addBook(new Book("Onegin", "Pushkin"));

        try {
            library.findBook("344");
        } catch (BookNotFoundException e) {
            System.out.println("Caught an exception!");;
        }
    }
}

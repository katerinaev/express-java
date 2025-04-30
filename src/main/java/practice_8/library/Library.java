package practice_8.library;

import practice_8.library.exceptions.BookNotFoundException;
import practice_8.library.exceptions.InvalidBookException;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;

public class Library {
    private List<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    // add book
    // Обработка исключения: если мы добавляем существующую книгу,
    // то мы получаем непровряемое исключение InvalidBookException
    public void addBook(Book book) throws InvalidBookException {
        if (books.contains(book)) {
            throw new InvalidBookException("This book already exists in the library");
        } else {
            books.add(book);
        }
    }
    // search book
    // Обработка исключения: если мы не можем найти книгу,
    // то случится проверяемое исключение BookNotFoundException
    public Book findBook(String name) throws BookNotFoundException {
        AtomicReference<Book> foundBook = new AtomicReference<>();
        books.forEach(book -> {
            if (book.getName() == name) {
                foundBook.set(book);
            }
        });

        if (foundBook.get() == null) {
            throw new BookNotFoundException("No book found by name " + name);
        }
        return foundBook.get();
    }
}

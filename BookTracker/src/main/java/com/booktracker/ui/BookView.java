package com.booktracker.ui;

import com.booktracker.dto.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class BookView {

    private final UserIO io;

    @Autowired
    public BookView(UserIO io) {
        this.io = io;
    }

    public void displayBookTrackerBanner() {
        io.print("Welcome to the Book Tracker");
    }

    public int displayMenuAndGetChoice() {
        io.print("");
        io.print("== MAIN MENU ==");
        io.print("1 - View all the books");
        io.print("2 - View book details");
        io.print("3 - Add a book");
        io.print("4 - Update book details");
        io.print("5 - Delete book");
        io.print("6 - Quit");

        return io.readInt("Please select an option:", 1, 6);
    }

    public void displayError(String error) {
        io.print("ERROR: " + error);
    }

    public void displayAllBooks(List<Book> books) {
        io.print("Collection of books");
        books.forEach(b -> io.print(b.getTitle() + " - " + b.getAuthor()));
    }

    public String getBookTitle() {
        return io.readString("Enter book name:");
    }

    public void displayBookDetails(Book book) {
        io.print("");
        io.print("Title: " + book.getTitle());
        io.print("Author: " + book.getAuthor());
        io.print("Year: " + book.getYear());
        io.print("Genre: " + book.getGenre());
    }

    public Book getNewBook() {
        io.print("");
        io.print("Enter new book info");
        String title = io.readString("Title:");
        String author = io.readString("Author:");
        int year = io.readInt("Year:");
        String genre = io.readString("Genre:");
        return new Book(title, author, year, genre);
    }

    public void displayAddSuccess() {
        io.print("Book added");
    }

    public void displayExit() {
        io.print("Exit");
    }

    public String getBookTitleToDelete() {
        return io.readString("Enter book title to delete:");
    }

    public void displayDeleteSuccess() {
        io.print("Book deleted");
    }

    public String getBookTitleToUpdate() {
        return io.readString("Enter book name to be updated:");
    }

    public Book getUpdateBook(Book updateBook) {
        io.print("Updating " + updateBook.getTitle());
        String author = io.readString("Enter Author (" + updateBook.getAuthor() + "):");
        String year = io.readString("Enter Year (" + updateBook.getYear() + "):");
        String genre = io.readString("Enter Genre (" + updateBook.getGenre() + "):");
        updateIfNotBlank(author, updateBook::setAuthor);
        updateIfNotBlank(year, value -> updateBook.setYear(Integer.parseInt(value)));
        updateIfNotBlank(genre, updateBook::setGenre);
        return updateBook;
    }

    private void updateIfNotBlank(String input, Updater updater) {
        if (!input.isBlank()) {
            updater.update(input);
        }
    }

    @FunctionalInterface
    private interface Updater {
        void update(String value);
    }

    public void displayUpdated() {
        io.print("Book updated ");
    }
}

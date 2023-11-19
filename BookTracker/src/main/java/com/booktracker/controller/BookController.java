package com.booktracker.controller;
import com.booktracker.dto.Book;
import com.booktracker.ui.BookView;
import com.booktracker.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class BookController {

    private BookService service;
    private BookView view;

    @Autowired
    public BookController(BookService service, BookView view) {
        this.service = service;
        this.view = view;
    }
    
    public void run() {
        view.displayBookTrackerBanner();
        
        while(true) {
            int choice = view.displayMenuAndGetChoice();
            
            switch(choice) {
                case 1:
                    List<Book> books = service.getAllBooks();
                    view.displayAllBooks(books);
                    break;

                case 2:
                    String title = view.getBookTitle();
                    Book book = service.getBookByTitle(title);
                    if(book != null) {
                        view.displayBookDetails(book);
                    } else {
                        view.displayError("Book unavailable");
                    }
                    break;

                case 3:
                    Book newBook = view.getNewBook();
                    service.addBook(newBook);
                    view.displayAddSuccess();
                    break;

                case 4:
                    String updateTitle = view.getBookTitleToUpdate();
                    Book updateBook = service.getBookByTitle(updateTitle);
                    if(updateBook != null) {
                        updateBook = view.getUpdateBook(updateBook);
                        service.updateBook(updateBook);
                        view.displayUpdated();
                    } else {
                        view.displayError("Book doesn't exist");
                    }
                    break;

                case 5:
                    String deleteTitle = view.getBookTitleToDelete();
                    Book deleteBook = service.getBookByTitle(deleteTitle);
                    if(deleteBook != null) {
                        service.deleteBookByTitle(deleteTitle);
                        view.displayDeleteSuccess();
                    } else {
                        view.displayError("Book doesn't exist");
                    }
                    break;

                case 6:
                    view.displayExit();
                    System.exit(0);
                    break;

                default:
                    view.displayError("Unknown Option");
                    break;
            }
        }
    }
}

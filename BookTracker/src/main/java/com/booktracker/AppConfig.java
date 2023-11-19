package com.booktracker;

import com.booktracker.dao.BookDao;
import com.booktracker.dao.BookDaoMemoryImpl;
import com.booktracker.service.BookService;
import com.booktracker.ui.BookView;
import com.booktracker.ui.UserIO;
import com.booktracker.ui.UserIOConsoleImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import com.booktracker.controller.BookController;

@Configuration
@ComponentScan(basePackages = "com.booktracker")
public class AppConfig {

    @Bean
    public UserIO userIO() {
        return new UserIOConsoleImpl();
    }

    @Bean
    public BookView bookView(UserIO userIO) {
        return new BookView(userIO);
    }

//    @Bean
//    public BookDao bookDao() {
//        return new BookDaoMemoryImpl();
//    }

    @Bean
    public BookService bookService(BookDao bookDao) {
        return new BookService(bookDao);
    }

    @Bean
    public BookController bookController(BookService bookService, BookView bookView) {
        return new BookController(bookService, bookView);
    }
}

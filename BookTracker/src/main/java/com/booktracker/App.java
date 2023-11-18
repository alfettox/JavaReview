package com.booktracker;

import com.booktracker.controller.BookController;
import com.booktracker.dao.BookDao;
import com.booktracker.dao.BookDaoMemoryImpl;
import com.booktracker.service.BookService;
import com.booktracker.ui.BookView;
import com.booktracker.ui.UserIO;
import com.booktracker.ui.UserIOConsoleImpl;

public class App {
    public static void main(String[] args) {
        UserIO io = new UserIOConsoleImpl();
        BookView view = new BookView(io);
        BookDao dao = new BookDaoMemoryImpl();
        BookService service = new BookService(dao);
        BookController controller = new BookController(service, view);
        controller.run();
    }
}

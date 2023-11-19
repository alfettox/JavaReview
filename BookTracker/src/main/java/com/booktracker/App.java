package com.booktracker;
import com.booktracker.controller.BookController;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class App {
    public static void main(String[] args) {
        try (AnnotationConfigApplicationContext context =
                     new AnnotationConfigApplicationContext(AppConfig.class)) {
            BookController controller = context.getBean(BookController.class);
            controller.run();
        }
    }


}



//public class App {
//    public static void main(String[] args) {
//        UserIO io = new UserIOConsoleImpl();
//        BookView view = new BookView(io);
//        BookDao dao = new BookDaoMemoryImpl();
//        BookService service = new BookService(dao);
//        BookController controller = new BookController(service, view);
//        controller.run();
//    }
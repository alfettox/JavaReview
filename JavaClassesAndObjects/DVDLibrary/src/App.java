import Service.Service;
import Service.ServiceImpl;
import View.UserIO;
import View.UserIOConsoleImpl;
import DAO.DAO;
import DAO.DAOFileImpl;
import Controller.Controller;
import View.ViewInt;
import View.ViewIntImpl;


public class App {
    public static void main(String[] args) {
        UserIO io = new UserIOConsoleImpl();
        DAO dao = new DAOFileImpl(moviedb);
        ViewInt v = new ViewIntImpl(io);
        Service service = new ServiceImpl(v, dao);
        Controller controller = new Controller(v, service);
        controller.run();
    }
}

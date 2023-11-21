package org.gdf;

import org.gdf.controller.ClassRosterController;
import org.gdf.dao.ClassRosterDao;
import org.gdf.dao.ClassRosterDaoFileImpl;
import org.gdf.exceptions.ClassRosterDaoException;
import org.gdf.ui.ClassRosterView;
import org.gdf.ui.UserIO;
import org.gdf.ui.UserIOConsoleImpl;

public class App {

    public static void main(String[] args) throws ClassRosterDaoException {
//        ClassRosterController controller = new ClassRosterController();

            UserIO myIo = new UserIOConsoleImpl();
            ClassRosterView myView = new ClassRosterView(myIo);
            ClassRosterDao myDao = new ClassRosterDaoFileImpl();
            ClassRosterAuditDao myAuditDao =
                    new ClassRosterAuditDaoFileImpl();
            ClassRosterServiceLayer myService =
                    new ClassRosterServiceLayerImpl(myDao, myAuditDao);
            ClassRosterController controller =
                    new ClassRosterController(myService, myView);
            controller.run();

        }
}
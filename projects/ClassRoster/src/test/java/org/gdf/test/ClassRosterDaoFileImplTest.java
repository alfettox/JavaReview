package org.gdf.test;

import org.gdf.dao.ClassRosterDao;
import org.gdf.dao.ClassRosterDaoFileImpl;
import org.junit.jupiter.api.BeforeEach;

import java.io.FileWriter;

public class ClassRosterDaoFileImplTest {

    ClassRosterDao testDao;

    public ClassRosterDaoFileImplTest() {
    }

    @BeforeEach
    public void setUp() throws Exception{
        String testFile = "testroster.txt";
        // Use the FileWriter to quickly blank the file
        new FileWriter(testFile);
        testDao = new ClassRosterDaoFileImpl(testFile);
    }

}
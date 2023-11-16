import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class StudentDB {

    public static List<Student> readStudentsFromFile(String filename) {
        List<Student> students = new ArrayList<>();

        try (BufferedReader br = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split("::");
                if (data.length == 4) {
                    Student currStudent = new Student(data[0]);
                    currStudent.setFirstName(data[1]);
                    currStudent.setLastName(data[2]);
                    currStudent.setCohort(data[3]);
                    students.add(currStudent);
                }
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return students;
    }

    public static void writeStudentsToDB(List<Student> students, String filename) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(filename))) {
            for (Student s : students) {
                String line = s.getStudentID() + "::" +
                        s.getFirstName() + "::" +
                        s.getLastName() + "::" +
                        s.getCohort();
                bw.write(line);
                bw.newLine();
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        List<Student> studentList = readStudentsFromFile("informalDatabase.txt");

        for (Student s : studentList) {
            System.out.println(s.getStudentID());
            System.out.println(s);
            if ("Java - August 2014".equals(s.getCohort())) {
                System.out.println("FOUND, now I will update it");
                s.setCohort("NEW COHORT");
            }
        }

        Student newStudent = new Student("5555");
        newStudent.setFirstName("Marietto");
        newStudent.setLastName("Laval");
        newStudent.setCohort("Morganer");

        boolean studentExists = false;

        for (Student s : studentList) {
            if (s.getStudentID().equals(newStudent.getStudentID())) {
                System.out.println("ERROR: Student with ID " + newStudent.getStudentID() + " already exists.");
                studentExists = true;
                break;
            }
        }

        if (!studentExists) {
            studentList.add(newStudent);
            writeStudentsToDB(studentList, "informalDatabase.txt");
            System.out.println("New student added successfully.");
        }
    }
}

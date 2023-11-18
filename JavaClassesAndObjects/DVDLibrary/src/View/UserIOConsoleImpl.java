package View;
import java.text.ParseException;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.InputMismatchException;
import java.util.Scanner;


public class UserIOConsoleImpl implements UserIO {

    private SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
    private Scanner scanner = new Scanner(System.in);

    @Override
    public void print(String str) {
        System.out.println(str);
    }

    @Override
    public double readDouble(String prompt) {
        return 0;
    }

    @Override
    public double readDouble(String prompt, double min, double max) {
        return 0;
    }

    @Override
    public float readFloat(String prompt) {
        return 0;
    }

    @Override
    public float readFloat(String prompt, float min, float max) {
        return 0;
    }

    @Override
    public int readInt(String prompt) {
        return 0;
    }

    public int readInt(String prompt, int min, int max) {
        int sel = 0;
        boolean validInput = false;

        while (!validInput) {
            try {
                print(prompt);
                sel = Integer.parseInt(scanner.nextLine());

                if (sel >= min && sel <= max) {
                    validInput = true;
                } else {
                    print("Please enter a number within the specified range (" + min + " - " + max + ")");
                }
            } catch (NumberFormatException e) {
                print("Invalid input. Please enter a valid integer.");
            }
        }

        return sel;
    }

    @Override
    public long readLong(String prompt) {
        return 0;
    }

    @Override
    public long readLong(String prompt, String min, String max) {
        return 0;
    }

    @Override
    public String readString(String prompt) {
        return "";
    }

    @Override
    public Date readDate(String dateString) {
        Date releaseDate = null;
        try {
            releaseDate = dateFormat.parse(dateString);
        } catch (ParseException e) {
            System.out.println("Error parsing the date. Please enter a valid date format.");
        }
        return releaseDate;
    }
}

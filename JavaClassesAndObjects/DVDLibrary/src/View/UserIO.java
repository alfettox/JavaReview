package View;

import java.util.Date;

public interface UserIO {

    void print (String str);
    double readDouble(String prompt);
    double readDouble(String prompt, double min, double max);
    float readFloat(String prompt);
    float readFloat(String prompt, float min, float max);
    int readInt(String prompt);
    int readInt(String prompt, int min, int max);
    long readLong(String prompt);
    long readLong(String prompt, String min, String max);
    String readString(String prompt);

    Date readDate(String enterTheDate);
}

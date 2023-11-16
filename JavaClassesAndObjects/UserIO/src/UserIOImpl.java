import java.util.Scanner;

public class UserIOImpl implements UserIO {
    Scanner scanner = new Scanner(System.in);



    @Override
    public void print(String message) {
        System.out.println(message);
    }

    @Override
    public String readString(String prompt) {
        print(prompt);
        String input = "";
        try {
            input = scanner.nextLine();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return input;
    }

    @Override
    public int readInt(String prompt) {
        print(prompt);
        String input;
        int inputInt = 0;
        while (true) {
            try {
                input = scanner.nextLine();
                inputInt = Integer.parseInt(input);
                break;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        return inputInt;
    }

    @Override
    public int readInt(String prompt, int min, int max) {
        print(prompt);

        while (true) {
            String input;
            int inputInt = 0;
            try {
                input = scanner.nextLine();
                inputInt = Integer.parseInt(input);
                if (inputInt >= min && inputInt <= max)
                    return inputInt;
                else
                    System.out.println("Value must be between " + min + " and " + max);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    @Override
    public double readDouble(String prompt) {
        print(prompt);

        double inputDouble = 0;
        while (true) {
            String input;
            try {
                input = scanner.nextLine();
                inputDouble = Double.parseDouble(input);
                break;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        return inputDouble;
    }

    @Override
    public double readDouble(String prompt, double min, double max) {
        print(prompt);

        while (true) {
            String input;
            double inputDouble = 0;
            try {
                input = scanner.nextLine();
                inputDouble = Double.parseDouble(input);
                if (inputDouble >= min && inputDouble <= max)
                    return inputDouble;
                else
                    System.out.println("Value must be between " + min + " and " + max);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    @Override
    public float readFloat(String prompt) {
        print(prompt);

        float inputFloat = 0;
        while (true) {
            String input;
            try {
                input = scanner.nextLine();
                inputFloat = Float.parseFloat(input);
                break;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        return inputFloat;
    }

    @Override
    public float readFloat(String prompt, float min, float max) {
        print(prompt);

        while (true) {
            String input;
            float inputFloat = 0;
            try {
                input = scanner.nextLine();
                inputFloat = Float.parseFloat(input);
                if (inputFloat >= min && inputFloat <= max)
                    return inputFloat;
                else
                    System.out.println("Value must be between " + min + " and " + max);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }

    @Override
    public long readLong(String prompt) {
        print(prompt);

        long inputLong = 0;
        while (true) {
            String input;
            try {
                input = scanner.nextLine();
                inputLong = Long.parseLong(input);
                break;
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
        return inputLong;
    }

    @Override
    public long readLong(String prompt, long min, long max) {
        print(prompt);

        while (true) {
            String input;
            long inputLong = 0;
            try {
                input = scanner.nextLine();
                inputLong = Long.parseLong(input);
                if (inputLong >= min && inputLong <= max)
                    return inputLong;
                else
                    System.out.println("Value must be between " + min + " and " + max);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }
    }
}

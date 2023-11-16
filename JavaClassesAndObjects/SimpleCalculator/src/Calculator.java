import java.util.Scanner;

public class Calculator implements Calculations {
    private static Calculator calculator;

    private Calculator() {
        // Private constructor to enforce singleton pattern
    }

    public static Calculator getSingletonCalculator() {
        if (calculator == null) {
            System.out.println("Do you want a: \n 1- Simple Calculator or" +
                    "\n 2 -Scientific calculator (with quadratic function 'power')");
            Scanner scanner = new Scanner(System.in);
            int input;
            try {
                input = scanner.nextInt();
                if (input != 1 && input != 2) {
                    throw new IllegalArgumentException("Invalid input. Please enter either 1 or 2.");
                }
            } catch (Exception e) {
                System.out.println("Exception: " + e.getMessage());
                return null;
            } finally {
//                scanner.close();
            }

            switch (input) {
                case 1:
                    calculator = new Calculator();
                    break;
                case 2:
                    calculator = new ScientificCalculator();
                    break;
                default:
                    return null;
            }
        }
        return calculator;
    }

    public static void run() {
        Calculator calc = getSingletonCalculator();
        if (calc == null) {
            System.out.println("Calculator initialization failed.");
            return;
        }

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the first number: ");
        double a = scanner.nextDouble();

        System.out.println("Please enter the second number: ");
        double b = scanner.nextDouble();

        scanner.close();

        calc.performCommonCalculations(a, b);

        if (calc instanceof ScientificCalculator) {
            ScientificCalculator scientificCalc = (ScientificCalculator) calc;
            scientificCalc.performScientificCalculations(a, b);
        }
    }

    @Override
    public double addition(double a, double b) {
        return round(a + b);
    }

    @Override
    public double subtraction(double a, double b) {
        return round(a - b);
    }

    @Override
    public double multiplication(double a, double b) {
        return round(a * b);
    }

    @Override
    public double division(double a, double b) {
        if (b != 0) {
            return round(a / b);
        } else {
            throw new ArithmeticException("Error dividing by zero");
        }
    }

    private static double round(double num) {
        return Math.round(num * 100.0) / 100.0; // Round to two decimal places
    }

    private static class ScientificCalculator extends Calculator {
        @Override
        public double addition(double a, double b) {
            return round(a + b);
        }

        @Override
        public double subtraction(double a, double b) {
            return round(a - b);
        }

        @Override
        public double multiplication(double a, double b) {
            return round(a * b);
        }

        @Override
        public double division(double a, double b) {
            if (b != 0) {
                return round(a / b);
            } else {
                throw new ArithmeticException("Error dividing by zero");
            }
        }

        // Specific method for ScientificCalculator
        public double power(double num) {
            return round(num * num);
        }

        // Common method to perform scientific calculations
        public void performScientificCalculations(double a, double b) {
            System.out.println("a^2 = " + power(a));
            System.out.println("b^2 = " + power(b));
        }
    }

    // Common method to perform basic calculations
    private void performCommonCalculations(double a, double b) {
        System.out.println("a + b = " + addition(a, b));
        System.out.println("a - b = " + subtraction(a, b));
        System.out.println("a * b = " + multiplication(a, b));
        System.out.println("a / b = " + division(a, b));
    }
}

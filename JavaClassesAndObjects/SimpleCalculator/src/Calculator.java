import java.util.Scanner;

public class Calculator implements calculations{
    private static Calculator calculator;

    private Calculator(){};

    public static Calculator getSingletonCalculator() {
        if (calculator == null) {
            calculator = new Calculator();
        }
        return calculator;
    }

    public static void run() {
        getSingletonCalculator();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the first number: ");
        double a = scanner.nextDouble();

        System.out.println("Please enter the second number: ");
        double b = scanner.nextDouble();

        System.out.println("a+b = " + calculator.addition(a,b));
        System.out.println("a-b = " + calculator.subtraction(a,b));
        System.out.println("a*b = " + calculator.multiplication(a,b));
        System.out.println("a/b = " + calculator.division(a,b));


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

    private double round(double num){
        return Math.round(num);
    }

}


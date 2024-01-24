
import java.util.Scanner;

public class TwoDigitCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the first number:");
        int num1 = scanner.nextInt();

        System.out.println("Enter the operator (+, -, *, /):");
        char operator = scanner.next().charAt(0);

        System.out.println("Enter the second number:");
        int num2 = scanner.nextInt();

        String result = performCalculation(operator, num1, num2);
        System.out.println(result);
    }

    private static String performCalculation(char operator, int num1, int num2) {
        if (operator != '+' && operator != '-' && operator != '*' && operator != '/') {
            return "Invalid operator. Please use '+', '-', '*', or '/'.";
        }

        if (operator == '/' && num2 == 0) {
            return "Division by zero is undefined. Please provide a non-zero divisor.";
        }

        int result = 0;

        switch (operator) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                result = num1 / num2;
                break;
        }

        return "The result of " + num1 + " " + operator + " " + num2 + " is: " + result;
    }
}
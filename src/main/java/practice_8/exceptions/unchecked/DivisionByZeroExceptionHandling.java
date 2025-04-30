package practice_8.exceptions.unchecked;

public class DivisionByZeroExceptionHandling {
    public static void main(String[] args) {
        divisionWithCheck(7, 0);
    }
    public static void divisionWithCheck(int numerator, int denominator) {
        try {
            double result = numerator / denominator;
            System.out.println("Quotient: " + result);
        } catch (ArithmeticException e) {
            System.err.println("Attempt to divide by zero: " + e.getMessage());
        }
    }

}

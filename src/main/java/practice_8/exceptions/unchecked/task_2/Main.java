package practice_8.exceptions.unchecked.task_2;

/**
 * Обработка непроверяемого исключения
 * Условие задачи: Напишите метод, который принимает на вход два числа и выполняет их деление.
 * Обработайте ситуацию, когда второе число равно нулю, чтобы избежать исключения при делении.
 */
public class Main {
    public static void divideNumbers(int x, int y) {
        try {
            int result = x / y;
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("Can't divide by zero " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        divideNumbers(5, 0);
        divideNumbers(50, 25);
    }
}

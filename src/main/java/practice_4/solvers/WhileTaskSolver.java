package practice_4.solvers;

import java.util.Scanner;

public class WhileTaskSolver {
    public static void main(String[] args) {
        // проверка метода по распечатке всех чісел от 1 до 10
        // printAllNumbersBefore10();

        // проверка программы по считыванию команд, пока не введут exit
        // commandReader();

        // проверка метода по подсчету сумм цифр в числе
//        System.out.println(sumOfDigits(12345));

        // 4.1 проверка метода работы факторіала
//        System.out.println(factorial());

        // 4.2 проверка метода по выводу четных чисел
//        printEvenNumbers();

        // 4.3 проверка метода вывода чисел в порядке убывания
        printPositiveNumbersDesc();
    }
    public static void printAllNumbersBefore10() {
        int i = 1;
        while (i <= 10) {
            System.out.print(i + " ");
            i++;
        }
    }

    public static void commandReader() {
        Scanner scanner = new Scanner(System.in);

        String command = "";

        while (!command.equals("exit")) {
            System.out.print("Enter command: ");
            command = scanner.nextLine();
        }

        System.out.println("Program completed");
    }

    public static int sumOfDigits(int number) {
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        return sum;
    }

    public static int factorial() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number for find factorial: ");
        int number = scanner.nextInt();
        int fact = 1;
        int i = 1;

        while (i <= number) {
            fact *= i;
            i++;
        }
        return fact;
    }

    public static void printEvenNumbers() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = scanner.nextInt();

        int i = 2;
        while (i <= number) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
            i++;
        }
    }

    public static void printPositiveNumbersDesc() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter positive number");
        int number = scanner.nextInt();

        while (number >= 1) {
            System.out.println(number);
            number--;
        }
    }
}

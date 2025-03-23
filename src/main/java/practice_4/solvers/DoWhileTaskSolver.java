package practice_4.solvers;

import java.util.Random;
import java.util.Scanner;

public class DoWhileTaskSolver {
    public static void main(String[] args) {
//        // проверка метода по угадываюию рандомного числа
//        findNumber(100);
//        // проверка метода по поиску минимального введенного числа
//        findMin();
//        // проверка метода по введению логина и пароля
//        checkCredentials();
//
//        // 4.1 проверка метода по вводу положительного числа
//        enterPositiveNumber();
//
//        // 4.2 проверка метода по введению пароля
//        checkPassword();
//
//        // 4.3 проверка метода по выводу чисел от 1 до 10
//        printNumbers();



    }
    public static void findNumber(int bound) {
        Scanner scanner = new Scanner(System.in);

        int random = new Random().nextInt(bound);

        int number;

        do {
            System.out.print("Guess number: ");
            number = scanner.nextInt();
            if (number < random) {
                System.out.println("More!");
            }
            if (number > random) {
                System.out.println("Less!");
            }
        } while (number != random);

        System.out.println("Right!");
    }

    public static void  findMin() {
        Scanner scanner = new Scanner(System.in);

        int number;
        int min = 2147483647;

        do {
            System.out.print("Enter number: ");
            number = scanner.nextInt();
            if (number < min && number >= 0) min = number;
        } while (number >= 0);

        System.out.println("Minimum number: " + min);
    }

    public static void checkCredentials() {
        Scanner scanner = new Scanner(System.in);

        String login;
        String password;

        do {
            System.out.print("Enter login: ");
            login = scanner.nextLine();
            System.out.print("Enter password: ");
            password = scanner.nextLine();
        } while (!login.equals("admin") || !password.equals("123"));

        System.out.println("Access granted!");
    }

    public static void enterPositiveNumber() {
        Scanner scanner = new Scanner(System.in);
        int number;

        do {
            System.out.print("Enter number: ");
            number = scanner.nextInt();
        } while (number <= 0);

        System.out.println("Hooray! You entered a positive number!");
    }

    public static void checkPassword() {
        String password;
        Scanner scanner = new Scanner(System.in);
        String passw = "ISTQB";
        do {
            System.out.print("Enter password: ");
            password = scanner.nextLine();
        } while (!password.equals(passw));

        System.out.println("Password is correct.");
    }

    public static void printNumbers() {
        int i = 1;
        do {
            System.out.println(i);
            i++;
        } while (i <= 10);
    }

    public static void sumPositiveNumbers() {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int number;

        do {
            System.out.print("Enter number: ");
            number = scanner.nextInt();
            if (number >= 0) {
                sum += number;
                System.out.println(sum);
            } else break;
        } while (number >= 0);
    }
}

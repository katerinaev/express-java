package practice_4.solvers;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class ForTaskSolver {
    public static void main(String[] args) {
//        // 3.3 проверка таблицы умножения для числа
        multiplyTable();
//
//        // 3.2 проверка суммы всех чисел до числа
//        System.out.println(sumOfAllNumbers());
//
//        // проверка метода по определению простого числа
//        System.out.println(checkNumberIsSimple(7));
//        System.out.println(checkNumberIsSimple(6));

        // проверка вывода всех простых чісел от 1 до 100
//        printAllSimpleNumbersBefore100();

        // 3.1 проверка метода вывода чисел, кратных 3 от 1 до 100
        checkDivisibleBy3();

    }
    public static void multiplyTable() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number for multiply table: ");
        int number = scanner.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(
                    number + " x " + i + " = " + number * i);
        }
    }

    public static int sumOfAllNumbers() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number to find sum: ");
        int n = scanner.nextInt();
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public static boolean checkNumberIsSimple(int number) {
        boolean isSimple = true;
        for (int i = 2; i <= number - 1; i++) {
            if (number % i == 0) {
                isSimple = false;
                break;
            }
        }
        return isSimple;
    }

    public static void printAllSimpleNumbersBefore100() {
        for (int i = 2; i <=100; i++) {
            if (checkNumberIsSimple(i)) {
                System.out.println("Number " + i + " is simple");
            }
        }
    }

    public static void checkDivisibleBy3() {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
    }
}

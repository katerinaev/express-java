package practice_4.solvers;

import java.util.Scanner;

public class BreakContinueTaskSolver {
    public static void main(String[] args) {
//        // 6.1 проверка метода по выводу суммы положительных чисел
//        sumPositiveNumbers();
//
//        // 6.2 проверка метода по вывода чисел, кроме кратных 3
//        printNumbersSkip3();

        // 6.3 проверка методапо выводу чисел кратных 2 и 5
        printMultiplesOf2And5();
    }

    public static void sumPositiveNumbers() {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        while (true) {
            System.out.print("Enter number: ");
            int number = scanner.nextInt();

            if (number < 0) {
                break;
            }
            sum += number;
        }

        System.out.println("Final sum: " + sum);
    }

    public static void printNumbersSkip3() {
        for (int i = 1; i <= 20; i++) {
            if (i % 3 == 0) {
                continue;
            }
            System.out.println(i);
        }
    }

    public static void printMultiplesOf2And5() {
        int number = 1;
        int count = 0;

        while (true) {
            if (count == 10) break;
            if (number % 2 == 0 && number % 5 == 0) {
                System.out.println(number);
                count++;
            }
            number++;
        }
    }
}

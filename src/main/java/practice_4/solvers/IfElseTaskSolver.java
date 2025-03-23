package practice_4.solvers;

import java.util.Scanner;

public class IfElseTaskSolver {
    public static void main(String[] args) {
//        // проверка метода четности
        System.out.println(checkParity(4));
        System.out.println(checkParity(7));

        // проверка метода определения возраста
        System.out.println(checkAge(4));
        System.out.println(checkAge(21));
        System.out.println(checkAge(71));

        // проверка метода по нахождению максимального среди 3 чисел
        System.out.println(checkMax(10, 25, -8));

        // 1.1 проверка знака числа
        System.out.println(checkSign());

        // 1.2 нахождение наибольшего из 2 чисел
        System.out.println(findMax(55, -25));

        // 1.3 вывод описания оценки
        System.out.println(outputGrade());
    }
    /**
     * Метод для проверки четности числа number
     * @param number
     * @return
     */
    public static String checkParity(int number) {
        // if - else
        // number % 2 == 0 -> Четное
        // number % 2 == 1 -> Нечетное
        // number = 2; -> 2 % 2 == 0 -> Четное
        // number = 7; -> 7 % 2 == 1 -> Нечентное
        // в методе должен быть 1 return

        String parity = "Нечетное";

        if (number % 2 == 0) {
            parity = "Четное";
        }

        return parity;
    }

    public static String checkAge(int age) {
        String ageDescription = "";
        if (age < 18) {
            ageDescription = "Несовершеннолетний";
        }
        if (age >= 18 && age <= 60) {
            ageDescription = "Взрослый";
        }
        if (age > 60) {
            ageDescription = "Пожилой";
        }
        return ageDescription;
    }

    public static int checkMax(int a, int b, int c) {
        int maxAB = b;
        if (a > b) {
            maxAB = a;
        }
        int max = maxAB;
        if (c > maxAB) {
            max = c;
        }
        return max;
    }

    public static String checkSign() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите любое число: ");
        int number = scanner.nextInt();
        String signDescription = "";
        if (number > 0) {
            signDescription = "Число положительное";
        }
        if (number < 0) {
            signDescription = "Число отрицательное";
        }
        if (number == 0) {
            signDescription = "Число равно 0";
        }
        return signDescription;
    }

    public static int findMax(int number1, int number2) {
        int maxNumber = number1;
        if (number1 < number2) {
            maxNumber = number2;
        }
        return maxNumber;
    }

    public static String outputGrade() {
        String gradeDescription = "";
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите оценку от 1 до 5: ");
        int grade = scanner.nextInt();
        if (grade == 5) {
            gradeDescription = "Отлично";
        }
        if (grade == 4) {
            gradeDescription = "Хорошо";
        }
        if (grade == 3) {
            gradeDescription = "Удовлетворительно";
        }
        if (grade == 2 || grade == 1) {
            gradeDescription = "Неудовлетворітельно";
        }
        return gradeDescription;
    }
}

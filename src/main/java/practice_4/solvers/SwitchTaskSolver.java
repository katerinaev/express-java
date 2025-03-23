package practice_4.solvers;

import practice_4.Planet;
import practice_4.Season;

import java.util.Scanner;

public class SwitchTaskSolver {
    public static void main(String[] args) {
        // проверка метода, возвращающего день недели по числу
        System.out.println(dayOfWeek(1));
        System.out.println(dayOfWeek(5));
//
//        // проверка метода по описанию сезона
//        System.out.println(describeSeason(Season.WINTER));
//        System.out.println(describeSeason(Season.SUMMER));
//
//        // проверка метода введенного числа дня недели
//        System.out.println(dayName());
//
//        // проверка метода с информацией о планетах
//        Scanner scanner = new Scanner(System.in);
//        System.out.print("Введите планетy: ");
//        String input = scanner.nextLine().toUpperCase();
//        System.out.println(planetInfo(Planet.valueOf(input)));

//        // check calculator
//        System.out.println(SwitchTaskSolver.calculator());
    }
    public static String dayOfWeek(int day) {
        String dayOfWeek = "";

        switch (day) {
            case 1:
                dayOfWeek = "Понедельник";
                break;
            case 2:
                dayOfWeek = "Вторник";
                break;
            case 3:
                dayOfWeek = "Среда";
                break;
            case 4:
                dayOfWeek = "Четверг";
                break;
            case 5:
                dayOfWeek = "Пятница";
                break;
            case 6:
                dayOfWeek = "Суббота";
                break;
            case 7:
                dayOfWeek = "Воскресенье";
                break;
            default:
                dayOfWeek = "Несуществующий день недели";
        }

        return dayOfWeek;
    }

    public static String describeSeason(Season season) {
        String description = "";
        switch (season) {
            case WINTER -> description = "Зима - холодно и снежно.";
            case SUMMER -> description = "Лето - жарко.";
            case SPRING -> description = "Весна - все цветет.";
            case AUTUMN -> description = "Осень - очей очарованье";
        }

        return description;
    }

    public static String dayName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число от 1 до 7");
        int dayNumber = scanner.nextInt();

        String dayName = "";
        switch (dayNumber) {
            case 1 -> dayName = "Понедельник";
            case 2 -> dayName = "Вторник";
            case 3 -> dayName = "Среда";
            case 4 -> dayName = "Четверг";
            case 5 -> dayName = "Пятница";
            case 6 -> dayName = "Суббота";
            case 7 -> dayName = "Воскресенье";
        }

        return dayName;
    }

    public static String planetInfo(Planet planet) {
        int order = 0;
        double mass = 0.0;

        switch (planet) {
            case MERCURY:
                order = 1;
                mass = 0.055;
                break;
            case VENUS:
                order = 2;
                mass = 0.815;
                break;
            case EARTH:
                order = 3;
                mass = 1;
                break;
            case MARS:
                order = 4;
                mass = 0.107;
                break;
            case JUPITER:
                order = 5;
                mass = 317.8;
                break;
            case SATURN:
                order = 6;
                mass = 95.1;
                break;
            case URANUS:
                order = 7;
                mass = 14.5;
                break;
            case NEPTUNE:
                order = 8;
                mass = 17.1;
                break;
            default:
                System.out.println("Некорректное название планеты");
        }
        return "Порядковый номер: " + order + ", Масса относительно Земли: " + mass;
    }

    public static double calculator() {
        double number1;
        double number2;
        double result = 0.0;
        String operation;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ыыедіте первый операнд");
        number1 = scanner.nextDouble();
        System.out.println("Введіте второй операнд");
        number2 = scanner.nextDouble();
        System.out.println("Введіте знак операции");
        operation = scanner.next();

        switch (operation) {
            case "+":
                result = number1 + number2;
                break;
            case "-":
                result = number1 - number2;
                break;
            case "*":
                result = number1 * number2;
                break;
            case "/":
                result = number1 / number2;
                break;
        }
        return result;
    }
}

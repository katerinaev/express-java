package practice_1;
/**
 1. Напишите класс MathOperations
 Создайте методы:
 add(int x, int y) — возвращает сумму двух чисел.
 subtract(int x, int y) — возвращает разность двух чисел.
 multiply(int x, int y) — возвращает произведение двух чисел.
 divide(int x, int y) — возвращает результат деления (тип double).
 В методе main вызовите каждый метод с любыми значениями и выведите результаты.

 2. Реализуйте метод для нахождения максимума двух чисел
 Создайте метод findMax(int a, int b), который возвращает большее из двух чисел.
 В качестве подсказки используйте метод Math.max(a, b).
 Вызовите метод из main и выведите результат.

 3. Реализуйте метод для нахождения разницы между двумя числами
 Создайте метод difference(int x, int y), который возвращает разницу между двумя числами.
 Проверьте работу метода в main.

 4. Создайте методы для вычисления площади и периметра квадрата
 Создайте методы:
 squareArea(int side) — возвращает площадь квадрата (side×sideside \times side).
 squarePerimeter(int side) — возвращает периметр квадрата (4×side4 \times side).
 Вызовите методы в main с примерными значениями.

 5. Реализуйте метод для перевода секунд в минуты
 Напишите метод convertSecondsToMinutes(int seconds), который возвращает значение в формате:
 минуты=секунды/60\text{минуты} = \text{секунды} / 60.
 Вызовите метод в main и выведите результат.

 6. Напишите метод для вычисления средней скорости
 Создайте метод averageSpeed(double distance, double time), который вычисляет
 среднюю скорость по формуле:
 скорость=расстояние/время\text{скорость} = \text{расстояние} / \text{время}.
 Проверьте работу метода с несколькими значениями.

 7. Реализуйте метод для нахождения гипотенузы
 Напишите метод findHypotenuse(double a, double b), который вычисляет гипотенузу
 прямоугольного треугольника по теореме Пифагора:
 гипотенуза=a2+b2\text{гипотенуза} = \sqrt{a^2 + b^2}.
 Используйте метод Math.sqrt() для вычисления корня.
 Проверьте работу метода.

 8. Напишите метод для вычисления длины окружности
 Создайте метод circleCircumference(double radius), который возвращает длину окружности
 (2πr2 \pi r).
 Используйте значение π\pi из Math.PI.
 Проверьте метод на нескольких радиусах.

 9. Реализуйте метод для вычисления процентов
 Напишите метод calculatePercentage(double total, double part), который возвращает,
 какой процент от общего составляет часть.
 Формула:
 процент=(часть/общее)×100\text{процент} = (\text{часть} / \text{общее}) \times 100.
 Вызовите метод в main.

 10. Создайте методы для перевода градусов Цельсия в Фаренгейты и обратно
 Реализуйте два метода:

 celsiusToFahrenheit(double celsius) — переводит температуру из градусов Цельсия
 в Фаренгейты (F=C×9/5+32F = C \times 9/5 + 32).

 fahrenheitToCelsius(double fahrenheit) — переводит температуру из Фаренгейтов
 в Цельсии (C=(F−32)×5/9C = (F - 32) \times 5/9).

 Проверьте методы на нескольких значениях
 */
public class MathOperations {
    public static void main(String[] args) {
        int sum1 = add(20, 30);
        System.out.println("Sum is: " + sum1);

        int subs1 = subtract(500, 400);
        System.out.println("Subtraction is: " + subs1);

        int mult1 = multiply(500, 400);
        System.out.println("Multiplication is: " + mult1);

        double div1 = divide(21, 5);
        System.out.println("Quotient of numbers: " + div1);

        int max1 = findMax(35, -50);
        System.out.println("Maximum of numbers " + max1);

        int dif1 = difference(-5, -20);
        System.out.println("Difference of numbers x and y: " + dif1);

        int square = squareArea(5);
        int perimeter = squarePerimeter(5);
        System.out.println("Square area: " + square);
        System.out.println("Perimeter area: " + perimeter);

        int seconds = 91;
        System.out.println("There are " + convertSecondsToMinutes(seconds) + " minutes " + "in " + seconds + " seconds");

        double averageSpeed1 = averageSpeed(1000, 6);
        double averageSpeed2 = averageSpeed(300, 0.8);
        System.out.println("Average speed for distance 1000 and time 6 is: " + averageSpeed1);
        System.out.println("Average speed for distance 300 and time 0.8 is: " + averageSpeed2);

        double hypotenuse1 = findHypotenuse(3, 4);
        System.out.println("Hypotenuse with legs 3 and 4: " + hypotenuse1);

        double circumference1 = circleCircumference(5);
        double circumference2 = circleCircumference(30);
        System.out.println("Circle circumference with a radius 5: " + circumference1);
        System.out.println("Circle circumference with a radius 30: " + circumference2);

        double percent1 = calculatePercentage(100.0, 20.0);
        System.out.println("20 is " + percent1 + "% of 100.");

        System.out.println("25°C in Fahrenheit: " + celsiusToFahrenheit(25));
        System.out.println("77°F in Celsius: " + fahrenheitToCelsius(77));
    }

    public static int add(int x, int y) {
        return x + y;
    }

    public static int subtract(int x, int y) {
        return x - y;
    }

    public static int multiply(int x, int y) {
        return x * y;
    }

    public  static double divide(int x, int y) {
        return (double) x / y;
    }

    public static int findMax(int a, int b) {
        return Math.max(a, b);
    }

    public static int difference(int x, int y) {
        return Math.abs(x - y);
    }

    public static int squareArea(int side) {
        return side * side;
    }

    public static int squarePerimeter(int side) {
        return side * 4;
    }

    public static double convertSecondsToMinutes(int seconds) {
        return seconds / 60.0;
    }

    public static double averageSpeed(double distance, double time) {
        return distance / time;
    }

    public static double findHypotenuse(double a, double b) {
        return Math.sqrt(a * a + b * b);
    }

    public static double circleCircumference(double radius) {
        return 2 * Math.PI * radius;
    }

    public static double calculatePercentage(double total, double part) {
        return part / total * 100;
    }

    public static double celsiusToFahrenheit(double celsius) {
        return celsius * 9 / 5 + 32;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
}

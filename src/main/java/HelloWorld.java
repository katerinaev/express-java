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

public class HelloWorld {
    // поля
    static int a = 1;

    // methods
    public static void main(String[] args) {
        int sum1 = add(55, 99);
        System.out.println("Result of addition: " + sum1);

        int sub1 = subtract(20, 5);
        System.out.println("Result of subtraction: " + sub1);

        int mult1 = multiply(1000, 5000);
        System.out.println("Result of multiplication: " + mult1);

        double div1 = divide(25, 2);
        System.out.println("Division result: " + div1);
    }

    public static int add(int x, int y) {
        // the body of a method
        return x + y;
    }

    public static int subtract(int x, int y) {
        return x - y;
    }

    public static int multiply(int x, int y) {
        return x * y;
    }

    public static double divide(int x, int y) {
        return (double) x / y;
    }
}

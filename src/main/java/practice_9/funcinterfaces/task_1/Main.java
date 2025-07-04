package practice_9.funcinterfaces.task_1;

/**
 * Создайте свой функциональный интерфейс
 * Задача: Напишите интерфейс MathOperation, который принимает два числа и возвращает
 * результат операции. Реализуйте его с помощью лямбда-выражений: сложение, вычитание,
 * умножение, деление.
 */
public class Main {
    public static void main(String[] args) {
        MathOperations add = (x, y) -> x +y;
        MathOperations subtract = (x, y) -> x - y;
        MathOperations multiply = (x, y) -> x * y;
        MathOperations divide = (x, y) -> x / y;

        System.out.println(add.apply(5, 6));
        System.out.println(subtract.apply(30, 20));
        System.out.println(multiply.apply(7, 7));
        System.out.println(divide.apply(121, 11));
    }
}

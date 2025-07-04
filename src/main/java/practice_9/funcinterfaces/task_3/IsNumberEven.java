package practice_9.funcinterfaces.task_3;
/**
 * Лямбда-выражение с Predicate
 * Задача: Напишите лямбду, которая проверяет, является ли число чётным.
 */

import java.util.function.Predicate;

public class IsNumberEven {
    public static void main(String[] args) {
        Predicate<Integer> isEven = n -> n % 2 == 0;

        System.out.println(isEven.test(36));
    }
}

package collections.arraylist.task_2;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Задача 2
 * Напишите программу, которая выводит все чётные числа из ArrayList.
 * Подсказка:
 * Создай ArrayList<Integer> и заполни числами.
 * Используй цикл for-each для прохода по списку.
 * Внутри цикла используй условие if (number % 2 == 0), чтобы проверить чётность.
 * Выводи подходящие числа с помощью System.out.println().
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(10, 11, 12, 13, 14, 15, 16, 17, 18));
        for (int number : numbers) {
            if (number % 2 == 0) {
                System.out.println(number);
            }
        }
    }
}

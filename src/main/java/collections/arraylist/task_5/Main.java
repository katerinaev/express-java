package collections.arraylist.task_5;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Задача 5:
 * Создайте ArrayList из целых чисел. Напишите программу, которая находит и выводит
 * максимальное число из списка.
 * Подсказка:
 * Можно использовать Collections.max(list).
 * Или вручную:
 * Объяви переменную int max = list.get(0) (предположим, что список не пуст).
 * Пройдись по списку в цикле.
 * Если текущее число больше max, обнови значение переменной.
 * После цикла выведи max.
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(10, 100, 1000, -50, 1200));
        System.out.println(numbers);
        int max = numbers.get(0);

        for (int num : numbers) {
            if (num > max) {
                max = num;
            }
        }

        System.out.println("Max number in list is " + max);
    }
}

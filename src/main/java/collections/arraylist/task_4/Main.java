package collections.arraylist.task_4;
/**
 * Задача 4:
 * Создайте ArrayList из целых чисел. Напишите программу, которая вычисляет и выводит сумму
 * всех чисел в списке.
 * Подсказка:
 * Объяви int sum = 0.
 * Используй цикл for-each для перебора всех элементов списка.
 * На каждой итерации прибавляй текущее число к переменной sum.
 * После цикла выведи sum через System.out.println().
 */

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9));
        System.out.println(numbers);
        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }
        System.out.println("Sum of all numbers: " + sum);
    }
}

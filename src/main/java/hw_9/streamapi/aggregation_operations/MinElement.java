package hw_9.streamapi.aggregation_operations;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 *  Поиск минимального элемента
 * Задача: Напишите программу, которая принимает список чисел и находит в нем
 * наименьшее число, используя Stream API.
 */
public class MinElement {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(15, 20, -8, 36, 100);

        Integer min = numbers.stream()
                .min(Comparator.naturalOrder())
                .get();

        System.out.println("Min value: " + min);
    }
}

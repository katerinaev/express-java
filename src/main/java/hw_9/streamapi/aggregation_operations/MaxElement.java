package hw_9.streamapi.aggregation_operations;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * Поиск максимального элемента
 * Задача: Напишите программу, которая принимает список чисел и находит в нём самое
 * большое число, используя Stream API.
 */

public class MaxElement {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(55, 44, 77, 88, 100);
        Integer max = numbers.stream()
                .max(Comparator.naturalOrder())
                .get();

        System.out.println(max);
    }
}

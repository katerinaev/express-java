package hw_9.streamapi.aggregation_operations;

import java.util.Arrays;
import java.util.List;

/**
 * Сумма всех элементов списка
 * Задача: Напишите программу, которая принимает список чисел
 * и вычисляет их сумму, используя Stream API.
 */
public class ElementsSum {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(100, 200, 300, 400, 500);

        int sum = numbers.stream()
                .mapToInt(Integer::valueOf)
                .sum();

        System.out.println(sum);
    }
}

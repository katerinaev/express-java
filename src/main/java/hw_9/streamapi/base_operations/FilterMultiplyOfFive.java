package hw_9.streamapi.base_operations;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Фильтрация чисел, кратных 5
 * Задача: Напишите программу, которая принимает список чисел и отбирает только те,
 * которые делятся на 5 без остатка, используя Stream API.
 */
public class FilterMultiplyOfFive {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 5, 8, 15, 17, 20);

        List<Integer> filteredNumbers = numbers.stream()
                .filter(n -> n % 5 == 0)
                .toList();

        System.out.println(filteredNumbers);
    }
}

package hw_9.streamapi.base_operations;

import java.util.Arrays;
import java.util.List;

/**
 * Удаление дубликатов из списка
 * Задача: Напишите программу, которая принимает список элементов и удаляет
 * из него все дубликаты, используя Stream API.
 */
public class RemoveDuplicates {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 3, 6, 7, 3, 6, 2, 8, 1);

        List<Integer> withoutDuplicates = numbers.stream()
                .distinct()
                .toList();

        System.out.println(withoutDuplicates);
    }
}

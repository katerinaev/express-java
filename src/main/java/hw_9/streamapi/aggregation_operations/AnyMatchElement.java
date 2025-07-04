package hw_9.streamapi.aggregation_operations;

import java.util.Arrays;
import java.util.List;

/**
 * Проверка наличия хотя бы одного элемента по условию
 * Задача: Напишите программу, которая проверяет, есть ли хотя бы один элемент в списке,
 * который удовлетворяет заданному условию (например, является чётным числом),
 * используя Stream API
 */
public class AnyMatchElement {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(22, 44, 17, 11, 38);

        boolean isAnyElement = numbers.stream()
                .anyMatch(n -> n % 2 == 0);

        System.out.println(isAnyElement);
    }
}

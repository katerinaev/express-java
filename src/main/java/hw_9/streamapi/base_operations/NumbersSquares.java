package hw_9.streamapi.base_operations;

import java.util.Arrays;
import java.util.List;

/**
 * Создание списка квадратов чисел
 * Задача: Напишите программу, которая принимает список чисел и преобразует его в новый список,
 * где каждое число заменено на его квадрат, используя Stream API.
 */
public class NumbersSquares {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

        List<Integer> numbersSquares = numbers.stream()
                .map(n -> n * n)
                .toList();

        System.out.println(numbersSquares);
    }
}

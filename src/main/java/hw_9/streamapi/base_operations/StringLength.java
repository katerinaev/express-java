package hw_9.streamapi.base_operations;

/*
 * Преобразование строк в их длины
 * Задача: Напишите программу, которая принимает список строк и заменяет каждую строку на её длину,
 * используя Stream API.
 */

import java.util.Arrays;
import java.util.List;

public class StringLength {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("Apple", "Ginger", "Pear", "Orange");

        List<Integer> lengths = strings.stream()
                .map(String::length)
                .toList();

        System.out.println(lengths);
    }
}

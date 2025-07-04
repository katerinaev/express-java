package hw_9.streamapi.aggregation_operations;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * Поиск первого элемента, начинающегося на "Б"
 * Задача: Напишите программу, которая принимает список строк и находит первую строку,
 * начинающуюся на букву "Б", используя Stream API.
 *
 * Напишите программу, которая принимает список строк и находит все строки,
 *  * начинающуюся на букву "Б"
 */
public class StringStartsWithB {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("Apple", "Banana", "Orange", "Bob");

        Optional<String> stringB = strings.stream()
                .filter(s -> s.startsWith("B"))
                .findFirst();

        System.out.println(stringB.get());

        List<String> stringsB = strings.stream()
                .filter(s -> s.startsWith("B"))
                .toList();

        System.out.println(stringsB);
    }
}

package hw_9.streamapi.base_operations;

import java.util.Arrays;
import java.util.List;

public class FilterStrings {
    public static void main(String[] args) {

        // Фильтрация строк по длине больше 5
        // Задача: Напишите программу, которая принимает список строк и удаляет из него
        // все строки длиной 5 символов и менее, используя Stream API.

        List<String> strings = Arrays.asList("First", "Second", "Third", "Forth", "Fifth", "Sixth", "Seventh");
        List<String> filteredStrings = strings.stream()
                .filter(s -> s.length() > 5)
                .toList();

        System.out.println(filteredStrings);
    }
}

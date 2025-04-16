package collections.arraylist.task_3;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Задача 3:
 * Создайте ArrayList из строк. Найдите в нём самую длинную строку и выведите её.
 * Подсказка:
 * Объяви переменную String longest = "".
 * Пройдись по списку с помощью цикла for-each.
 * Внутри цикла сравни длину текущей строки с longest.length() и обнови longest,
 * если найдена строка длиннее.
 * После цикла выведи longest.
 */
public class Main {
    public static void main(String[] args) {
        ArrayList<String> strings = new ArrayList<>(Arrays.asList("First", "Joy", "Happiness",
                "Peace", "Love", "Abundance"));
        System.out.println(strings);
        String longest = "";
        for (String str : strings) {
            if (str.length() > longest.length()) {
                longest = str;
            }
        }
        System.out.println("The longest string: " + longest);
    }
}

package practice_9.funcinterfaces.task_4;
/**
 * Лямбда-выражение с Function
 * Задача: Создайте лямбду, которая принимает строку и возвращает её длину.
 */

import java.util.function.Function;

public class StringLength {
    public static void main(String[] args) {
        Function<String, Integer> getLength = str -> str.length();
        String str1 = "Hello World!";
        System.out.println(str1 + " - length: " + getLength.apply(str1));
    }
}

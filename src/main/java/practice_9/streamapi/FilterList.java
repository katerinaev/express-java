package practice_9.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class FilterList {
    public static void main(String[] args) {
        // 1. Создать список целых чивел, далее отфильтровать все четные числа и суммировать их
        // Промежуточная операция: фильтрация по четности
        // Терминальная операция: суммирование

        List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

        IntStream stream = numbers.stream()
                .filter(n -> {
                    System.out.println("Filter: " + n);
                    return n % 2 == 0;
                })
                .mapToInt(n -> {
                    System.out.println("mapToInt: " + n);
                    return n;
                });

        System.out.println("Стрим создан, но терминальная операция еще не выполнена.");

        int sum = stream.sum();

        System.out.println(sum);
    }
}

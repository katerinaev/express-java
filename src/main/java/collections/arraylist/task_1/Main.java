package collections.arraylist.task_1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 Задача 1:
 Создайте ArrayList из 5 чисел. Добавьте ещё одно число в конец. Выведите весь список.
 Подсказка:
 Используй Arrays.asList() для создания списка из 5 чисел.
 Чтобы добавить ещё одно число, оберни в new ArrayList<>(...), потому что список из Arrays.asList()
 фиксирован по размеру.
 Для добавления — метод add(), для вывода — System.out.println(list) или цикл for.
 */
public class Main {
    public static void main(String[] args) {
        List<Integer> initialList = Arrays.asList(32, 18, 55, 25, -8);
        ArrayList<Integer> list = new ArrayList<>(initialList);
        list.add(100);
        System.out.println(list);
    }
}

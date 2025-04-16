package collections.treemap.task_3;

import java.util.TreeMap;

/**
 * Задача 3: Нахождение ближайшего большего и меньшего ключа к заданному в
 * TreeMap
 * Цель: Демонстрация использования методов higherKey() и lowerKey() для
 * нахождения ключей, близких к заданному.
 * Подход:
 * 1. Добавление данных: Заполнение TreeMap<Integer, String> значениями.
 *
 * 2. Поиск ближайших ключей: Использование методов higherKey() и
 * lowerKey() для нахождения ключей, находящихся непосредственно выше и
 * ниже заданного значения.
 *
 * 3. Вывод результатов: Вывод значений ближайших ключей.
 */
public class Main {
    public static void main(String[] args) {
        TreeMap<Integer, String> treeMap = new TreeMap<>();

        treeMap.put(8, "August");
        treeMap.put(5, "May");
        treeMap.put(10, "October");
        treeMap.put(3, "March");
        treeMap.put(1, "January");

        int requiredKey = 4;
        int higherKey = treeMap.higherKey(requiredKey);
        int lowerKey = treeMap.lowerKey(requiredKey);

        System.out.println("Closest largest to the key " + requiredKey + " is: " +
                higherKey + " ("+ treeMap.get(higherKey) + ")");
        System.out.println("Closest smallest to the key " + requiredKey + " is: " +
                lowerKey + " (" + treeMap.get(lowerKey) + ")");
    }
}

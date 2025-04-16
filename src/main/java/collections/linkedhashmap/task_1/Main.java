package collections.linkedhashmap.task_1;
/**
 * Задача 1:
 * Создайте LinkedHashMap и добавьте в него 5 элементов. Выведите их в порядке добавления.
 * Подсказка:
 * Используй LinkedHashMap<String, Integer> или другой тип на выбор
 * Добавляй элементы методом put(key, value)
 * Используй цикл for (Map.Entry<K, V> entry : map.entrySet())
 * LinkedHashMap сохраняет порядок добавления — элементы выведутся в том же порядке,
 * в котором были добавлены
 */

import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        LinkedHashMap<String, Integer> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("E", 5);
        linkedHashMap.put("A", 4);
        linkedHashMap.put("B", 3);
        linkedHashMap.put("C", 2);
        linkedHashMap.put("D", 1);

        for (Map.Entry<String, Integer> entry : linkedHashMap.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}

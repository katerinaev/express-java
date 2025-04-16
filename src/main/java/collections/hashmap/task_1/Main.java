package collections.hashmap.task_1;
/**
 * Задача 1:
 * Создайте HashMap<String, Integer>, добавьте 5 пар (имя – возраст) и выведите все записи.
 * Подсказка:
 * Используй HashMap<String, Integer>
 * Добавь пары с помощью put("Имя", возраст)
 * Пройдись по паре Map.Entry<String, Integer> с помощью for-each цикла
 * Используй entry.getKey() и entry.getValue() для вывода каждой записи
 */

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Ross", 26);
        map.put("Monica", 25);
        map.put("Rachel", 24);
        map.put("Chandler", 26);
        map.put("Phoebe", 27);
        map.put("Joey", 25);

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " is " + entry.getValue());
        }
    }
}

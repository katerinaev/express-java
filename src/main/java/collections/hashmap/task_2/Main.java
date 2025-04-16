package collections.hashmap.task_2;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Задача 2:
 * Проверьте, есть ли определённое имя в HashMap.
 * Подсказка:
 * Используй метод containsKey("Имя")
 * Имя можно задать вручную или получить через Scanner
 * Если имя найдено — выведи возраст или сообщение "Найдено"
 * Если не найдено — выведи "Не найдено"
 */
public class Main {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Artem", 10);
        map.put("Ivan", 14);
        map.put("Igor", 23);
        map.put("Karina", 22);
        System.out.println("Enter name: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();

        if (map.containsKey(name)) {
            System.out.println(name + " is " + map.get(name) + " years old.");
        } else {
            System.out.println(name + " is not found.");
        }
    }
}

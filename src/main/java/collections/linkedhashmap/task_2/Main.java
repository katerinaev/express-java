package collections.linkedhashmap.task_2;

import java.util.LinkedHashMap;
import java.util.Scanner;

/**
 * Задача 2:
 * Реализуйте телефонную книгу с LinkedHashMap. Добавьте и найдите контакт.
 * Подсказка:
 * Используй LinkedHashMap<String, String> где ключ — имя, значение — номер телефона
 * Для добавления используй put(name, phone)
 * Для поиска используй containsKey(name) и get(name)
 * Имя можно передать в метод или считать с клавиатуры
 * Если контакт найден — выведи номер телефона, иначе сообщение "Контакт не найден"
 */
public class Main {
    public static void main(String[] args) {
        LinkedHashMap<String, String> telephoneBook = new LinkedHashMap<>();
        telephoneBook.put("Bob", "123-456-7890");
        telephoneBook.put("Ann", "789-321-3333");
        telephoneBook.put("Sam", "444-555-7777");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter name: ");
        String name = scanner.nextLine();
        if (telephoneBook.containsKey(name)) {
            System.out.println(name + " has telephone number: " + telephoneBook.get(name));
        } else {
            System.out.println("There's no contact in telephone book");
        }
        scanner.close();
    }
}

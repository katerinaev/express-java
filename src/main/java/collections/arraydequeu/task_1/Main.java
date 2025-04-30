package collections.arraydequeu.task_1;
/**
 * Задача 1:
 * Создайте ArrayDeque, добавьте 5 элементов и выведите их.
 * Подсказка:
 * Используй ArrayDeque<String> (или другой тип по желанию)
 * Добавляй элементы с помощью add() или addLast()
 * Для вывода используй for-each цикл или System.out.println(deque)
 * ArrayDeque сохраняет порядок добавления при обычном использовании
 */

import java.util.ArrayDeque;
import java.util.Deque;

public class Main {
    public static void main(String[] args) {
        Deque<String> year = new ArrayDeque<>();
        year.add("March");
        year.addLast("April");
        year.addFirst("February");
        year.addFirst("January");
        year.offer("May");

        for (String month : year) {
            System.out.println(month);
        }
    }
}

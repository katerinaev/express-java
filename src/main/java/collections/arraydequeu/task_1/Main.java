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
        Deque<String> deque1 = new ArrayDeque<>();
        deque1.addFirst("January");
        deque1.add("February");
        deque1.add("March");
        deque1.addLast("April");
        deque1.offer("May");

        for (String month : deque1) {
            System.out.println(month);
        }
    }
}

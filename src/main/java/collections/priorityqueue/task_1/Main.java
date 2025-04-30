package collections.priorityqueue.task_1;

import java.util.PriorityQueue;

/**
 * Задача 1:
 * Создайте PriorityQueue и добавьте 5 чисел. Выведите их в порядке удаления.
 * Подсказка:
 * Используй PriorityQueue<Integer>
 * Добавляй числа через add() или offer()
 * Элементы автоматически сортируются по возрастанию при извлечении
 * Используй poll() в цикле while (!queue.isEmpty()) для поочерёдного извлечения и вывода
 */
public class Main {
    public static void main(String[] args) {
        PriorityQueue<Integer> numbers  = new PriorityQueue<>();
        numbers.offer(4);
        numbers.offer(8);
        numbers.offer(10);
        numbers.offer(1);
        numbers.offer(3);
        System.out.println(numbers);
        System.out.println("Elements in PriorityQueue: ");
        while (!numbers.isEmpty()) {
            System.out.println(numbers.poll());
        }
    }
}

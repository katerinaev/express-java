package collections.priorityqueue.task_1;

import com.sun.security.jgss.GSSUtil;

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
        PriorityQueue<Integer> queue  = new PriorityQueue<>();
        queue.offer(4);
        queue.offer(8);
        queue.offer(10);
        queue.offer(1);
        queue.offer(3);

        System.out.println("Elements in PriorityQueue: ");
        while (!queue.isEmpty()) {
            System.out.println(queue.poll());
        }
    }
}

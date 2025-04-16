package collections.linkedlist.task_2;
/**
 * Задача 2: Реализация очереди с использованием LinkedList
 * Цель: Использовать LinkedList для реализации простой очереди задач и их
 * обработки.
 */

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> tasks = new LinkedList<>();
        tasks.add("Task 1");
        tasks.add("Task 2");
        tasks.add("Task 3");
        tasks.add("Task 4");
        tasks.add("Task 5");

        while(!tasks.isEmpty()) {
            System.out.println("Processing " + tasks.poll());
        }
    }
}

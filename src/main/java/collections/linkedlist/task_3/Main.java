package collections.linkedlist.task_3;
/**
 * Задача 3: Печать первого и последнего элемента LinkedList
 * Цель: Написать программу, которая выводит первый и последний элементы LinkedList.
 */

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        list.add("First");
        list.add("Middle");
        list.add("Last");

        list.poll();

        if (!list.isEmpty()) {
            System.out.println("First element: " + list.getFirst());
            System.out.println("Last element: " + list.getLast());;
        }
    }
}

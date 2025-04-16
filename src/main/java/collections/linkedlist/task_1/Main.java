package collections.linkedlist.task_1;
/**
 * Задача 1: Создание LinkedList и вывод всех элементов
 * Цель: Создать LinkedList, добавить в него элементы и вывести их.
 */

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        list.add("Sunday");
        list.add("Monday");
        list.add("Tuesday");
        list.add("Wednesday");
        list.add("Thursday");
        list.add("Friday");
        list.add("Saturday");

        System.out.println("LinkedList: " + list);
    }
}

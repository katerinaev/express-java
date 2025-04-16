package collections.linkedlist.task_4;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> numbers = new LinkedList<>();
        int sum = 0;
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        for (int item : numbers) {
            sum += item;
        }

        System.out.println("Sum of all elements: " + sum);
    }
}

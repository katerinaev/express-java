package collections.linkedlist.task_5;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        LinkedList<String> list5 = new LinkedList<>(Arrays.asList("First", "Second", "Third", "Fourth", "Fifth"));

        ListIterator<String> iterabtor = list5.listIterator();
        System.out.println("Direct list: ");
        while (iterabtor.hasNext()) {
            System.out.print(iterabtor.next() + " ");
        }

        System.out.println("\nReverse list: ");
        while (iterabtor.hasPrevious()) {
            System.out.print(iterabtor.previous() + " ");
        }
    }
}

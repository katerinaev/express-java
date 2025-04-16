package collections.arraydequeu.task_2;
/**
 * Задача 2:
 * Используйте ArrayDeque как стек: добавьте элементы и извлеките их в обратном порядке.
 * Подсказка:
 * Добавляй элементы с помощью push()
 * Извлекай с помощью pop() — они будут извлекаться в порядке LIFO (последним добавлен — первым извлечён)
 * Используй while (!deque.isEmpty()) для последовательного извлечения и вывода
 */

import java.util.ArrayDeque;

public class Main {
    public static void main(String[] args) {
        ArrayDeque<String> stack = new ArrayDeque<>();
        stack.push("Base");
        stack.push("Ham");
        stack.push("Mushrooms");
        stack.push("Cheese");
        stack.push("Tomatoes");

        System.out.println("Our pizza: " + stack);

        while (!stack.isEmpty()) {
            System.out.println("Removed " + stack.pop());
            System.out.println(stack + " left.");
        }
    }
}

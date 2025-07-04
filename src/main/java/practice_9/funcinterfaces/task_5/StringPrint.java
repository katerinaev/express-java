package practice_9.funcinterfaces.task_5;

import java.util.function.Consumer;

/**
 * Использование Consumer
 * Задача: Напишите лямбду, которая принимает строку и печатает её в консоль.
 */
public class StringPrint {
    public static void main(String[] args) {
        String string = "Hello world";
        Consumer<String> printer = System.out::println;
        printer.accept(string);
    }
}

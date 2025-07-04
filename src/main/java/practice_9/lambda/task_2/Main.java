package practice_9.lambda.task_2;
/**
 * Использование анонимного класса
 * Задача: Создайте анонимный класс, реализующий интерфейс Runnable, который выводит сообщение
 * "Hello from anonymous class!".
 */
public class Main {
    public static void main(String[] args) {
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello from anonymous class!");
            }
        };

        r1.run();
    }
}

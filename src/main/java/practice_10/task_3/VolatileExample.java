package practice_10.task_3;

/**
 * Задача: использование volatile
 * Условие задачи: Создайте поток, который бесконечно увеличивает счетчик.
 * В основном потоке через 2 секунды установите флаг stop = true, чтобы остановить
 * поток
 */
public class VolatileExample {
    private volatile boolean stop = false;
    public static void main(String[] args) {

    }
}

package practice_10.twothreads;

/**
 *  Задача: создание двух потоков
 * Условие задачи: Создайте два потока. Один поток должен печатать "A", второй — "B",
 * каждый по 5 раз с небольшой задержкой.
 */
public class CreateTwoThreads {
    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new Thread(() -> {
            for (int i = 1; i <=5; i++) {
                System.out.println("A");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        Thread t2 = new Thread(() -> {
            for (int i = 1; i <=5; i++) {
                System.out.println("B");
                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        t1.start();
        t2.start();

        t1.join();
        t2.join();
    }
}

package practice_10.onethread;

/**
 * создание одного потока
 * Условие задачи: Напишите программу, в которой создается отдельный поток,
 * выводящий сообщение "Привет из потока!" 5 раз с паузой в 1 секунду между сообщениями.
 */
public class CreateOneThread {
    public static void main(String[] args) {
        Thread thread = new Thread(() -> {
            for (int i = 1; i <=5; i++) {
                System.out.println("Hello from the thread!");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        thread.start();
    }
}

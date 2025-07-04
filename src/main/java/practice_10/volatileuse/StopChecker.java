package practice_10.volatileuse;

/**
 *  Задача: использование volatile
 * Условие задачи: Создайте поток, который бесконечно увеличивает счетчик.
 * В основном потоке через 2 секунды установите флаг stop = true,
 * чтобы остановить поток.
 */
public class StopChecker implements Runnable {
    private volatile boolean stop = false;
    private int count;

    @Override
    public void run() {
        while (!stop) {
            count++;
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
    }

    public void stop() {
        this.stop = true;
    }

    public int getCount() {
        return this.count;
    }
}

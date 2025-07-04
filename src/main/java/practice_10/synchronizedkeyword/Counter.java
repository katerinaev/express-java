package practice_10.synchronizedkeyword;

/**
 * Задача: использование synchronized
 * Условие задачи: Напишите класс Counter с методом increment, увеличивающим значение
 * счётчика. Создайте два потока, каждый из которых вызывает increment() 1000 раз.
 * Обеспечьте правильную работу с помощью synchronized
 */
public class Counter {
    private int count = 0;

    public synchronized void increment() {
        this.count++;
    }

    public synchronized int getCount() {
        return this.count;
    }
}

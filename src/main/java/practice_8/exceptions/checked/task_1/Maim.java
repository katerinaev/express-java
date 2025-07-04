package practice_8.exceptions.checked.task_1;

import java.io.FileNotFoundException;
import java.io.FileReader;

/**
 *  Обработка проверяемого исключения
 * Условие задачи:
 * Напишите программу, которая пытается открыть файл с именем "data.txt".
 * Если файл не найден, программа должна обработать исключение и вывести сообщение:
 * "Файл не найден".
 */
public class Maim {
    public static void readFile(String fileName) {
        try {
            FileReader reader = new FileReader(fileName);
        } catch (FileNotFoundException e) {
            System.out.println("File not found " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        readFile("data.txt");
    }
}

package practice_8.exceptions.checked;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class CheckedExceptionExample {
    public static void main(String[] args) {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader("src/main/resources/data1.txt"));
            String line = null;
            while ((line = reader.readLine()) != null)
                System.out.println(line);
        } catch (FileNotFoundException e) {
            System.out.println("File not found " + e.getMessage());
        } catch (IOException exc) {
            System.out.println(exc.getMessage());
        }
    }
}

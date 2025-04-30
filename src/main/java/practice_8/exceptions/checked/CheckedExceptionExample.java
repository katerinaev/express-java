package practice_8.exceptions.checked;

import java.io.BufferedReader;
import java.io.FileReader;

public class CheckedExceptionExample {
    public static void main(String[] args) {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader("data.txt"));
            String line = null;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (java.io.IOException e) {
            System.err.println("File not found " + e.getMessage());
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (java.io.IOException e) {
                System.err.println("Error closing file " + e.getMessage());
            }
        }
    }
}

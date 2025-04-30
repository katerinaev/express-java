package practice_8.exceptions.unchecked;

public class IndexOutOfBoundsExceptionExample {
    public static void main(String[] args) {
        try {
            int[] numbers = {1, 2, 3};
            int number = numbers[5]; // Attempt to access non-existing index
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Attempt to access index outside array bounds");
        }

    }
}

package practice_8.errors;

public class StackOverflowError {
    public static void recursuvePrint(int num) {
        System.out.println(num + 1);
        recursuvePrint(num + 1);
    }

    public static void main(String[] args) {
        recursuvePrint(1);
    }
}

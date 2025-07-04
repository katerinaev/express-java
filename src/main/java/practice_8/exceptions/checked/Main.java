package practice_8.exceptions.checked;

public class Main {
    public static void main(String[] args) {
        try {
            AgeCheck.checkAge(25);
            AgeCheck.checkAge(150);
            AgeCheck.checkAge(-5);
        } catch (AgeNotValidException e) {
            System.out.println("Caught exception: " + e.getMessage());
        }
    }
}

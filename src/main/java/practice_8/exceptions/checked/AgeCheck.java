package practice_8.exceptions.checked;

public class AgeCheck {
    public static void checkAge(int age) throws AgeNotValidException {
        if (age < 0 || age > 150) {
            throw new AgeNotValidException("Age " + age + " - is not valid. Age must be between 0 and 150.");
        } else {
            System.out.println("Age " + age + " is valid.");
        }
    }

}

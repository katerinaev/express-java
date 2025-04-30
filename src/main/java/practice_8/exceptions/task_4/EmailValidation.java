package practice_8.exceptions.task_4;

public class EmailValidation {
    public static void checkEmail(String email) throws InvalidEmailException {
        if (email.matches("^[\\w-\\.]+@[\\w-]+(\\.[\\w-]+)*\\.[a-z]{2,}$")) {
            System.out.println("Email " + email + " is valid.");
        } else throw new InvalidEmailException("Email " + email + " is not valid.");
    }
}

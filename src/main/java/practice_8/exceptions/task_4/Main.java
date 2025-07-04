package practice_8.exceptions.task_4;

import java.util.Scanner;

public class Main {
    public static void checkEmail(String email) {
        if (email.matches("^[\\w-\\.]+@[\\w-]+(\\.[\\w-]+)*\\.[a-z]{2,}$")) {
            System.out.println("Email " + email + " is valid");
        } else throw new InvalidEmailException("Email " + email + " is not valid");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter email: ");
        String email = scanner.nextLine();
        try {
            checkEmail(email);
        } catch (InvalidEmailException e) {
            System.out.println(e.getMessage());
        }
    }
}

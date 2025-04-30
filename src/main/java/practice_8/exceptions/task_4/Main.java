package practice_8.exceptions.task_4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter email: ");
        String email = scanner.nextLine();
        EmailValidation.checkEmail(email);
    }
}

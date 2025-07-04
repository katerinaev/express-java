package practice_8.exceptions.checked.task_3;

/**
 * Создание и использование собственного проверяемого исключения
 * Условие задачи: Разработайте метод, который проверяет валидность возраста пользователя.
 * Если возраст меньше 0 или больше 150, метод должен выбрасывать проверяемое исключение.
 */
public class Main {
    public static void checkAge(int age) throws InvalidAgeException {
        if (age < 0 || age > 150) {
            throw new InvalidAgeException(age + " is not valid age. It must be between 0 and 150.");
        } else System.out.println("Age " + age + " is valid.");
    }

    public static void main(String[] args) {
        try {
            checkAge(2);
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
    }
}

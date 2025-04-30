package practice_8.exceptions.unchecked;

public class NullPointerExeptionExample {
    public static void main(String[] args) {
        try {
            String text = null;
            int length = text.length(); // This will throw NullPointerException
        } catch (NullPointerException e) {
            System.out.println("Attempt to call a method on null object");
        }
    }
}

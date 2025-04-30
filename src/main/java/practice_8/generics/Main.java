package practice_8.generics;

public class Main {
    public static void main(String[] args) {
        Box<String> boxString = new Box<>();
        boxString.setElement("Artem");
        System.out.println(boxString.getElement());

        Box<Integer> boxInteger = new Box<>();
        boxInteger.setElement(555);
        System.out.println(boxInteger.getElement());

        Box<Magazine> boxWithBooks = new Box<>();
        boxWithBooks.setElement(new Magazine("Dune"));
    }
}

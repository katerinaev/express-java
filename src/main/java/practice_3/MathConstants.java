package practice_3;

public class MathConstants {
    final static double PI = 3.14159;
    final static double E = 2.71828;

    public static double circleArea(double radius) {
        return PI * radius * radius;
    }

    public static double circumference(double radius) {
        return 2 * PI * radius;
    }

    public static void main(String[] args) {
        double radius1 = 5.0;
        double radius2 = 10.0;

        System.out.println("Circle area with radius " + radius1 + ": " + circleArea(radius1));
        System.out.println("Circumference with radius " + radius1 + ": " + circumference(radius1));

        System.out.println("Circle area with radius " + radius2 + ": " + circleArea(radius2));
        System.out.println("Circumference with radius " + radius2 + ": " + circumference(radius2));
    }
}

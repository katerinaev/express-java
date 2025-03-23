package practice_3;

public class MathConstants {
    final static double PI = 3.14159;
    final double E = 2.71828;

    public static double circleArea(double radius) {
        return PI * radius * radius;
    }

    public static double circumference(double radius) {
        return 2 * PI * radius;
    }
}

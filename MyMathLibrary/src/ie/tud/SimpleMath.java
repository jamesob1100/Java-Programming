package ie.tud;

public class SimpleMath {

    public static int add(int a, int b) {
       return a+b;
    }

    public static int subtract(int a, int b) {
      return a - b;    }

    public static int multiply(int a, int b) {
        return a * b;
    }

    public static double divide(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Cannot divide by zero");
        }
        return a / b;
    }

    public static int max(int a, int b) {
        return (a > b) ? a : b;
    }

    public static int min(int a, int b) {
        return (a < b) ? a : b;
    }

    public static int abs(int x) {
        return (x < 0) ? -x : x;
    }

    // clamp value into [min, max]
    public static int clamp(int value, int min, int max) {
        if (value < min) return min;
        if (value > max) return max;
        return value;
    }

    public static int square(int x) {
        return x * x;
    }

    public static int cube(int x) {
        return x * x * x;
    }

    public static double average(double a, double b) {
        return (a + b) / 2.0;
    }

    public static boolean isEven(int x) {
        return x % 2 == 0;
    }
}
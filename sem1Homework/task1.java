package sem1Homework;

// Реализуйте 3 метода, чтобы в каждом из них получить разные стандартные для Java исключения;

public class task1 {
    public static void main(String[] args) {
        stackOverflowError();

    }

    // 1.
    public static int arrayIndexOutOfBoundsException() {
        int[] array = new int[] {};
        return array[1];
    }

    // 2.

    public static void arithmeticException() {
        int dividend = 10;
        int divider = 0;

        System.out.println(dividend / divider);

    }

    // 3.

    public static void stackOverflowError() {
        assistant();

    }

    private static void assistant() {
        stackOverflowError();
    }

}

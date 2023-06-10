package sem1Homework;

import java.util.Arrays;

// Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращает новый массив, каждый 
// элемент которого равен разности элементов 
// двух входящих массивов в той же ячейке. Если длины массивов не равны, необходимо как-то оповестить пользователя

public class task3 {
    public static void main(String[] args) {
        int[] arrayOne = new int[] { 6, 10 };
        int[] arrayTwo = new int[] { 2, 7 };

        System.out.println(Arrays.toString(arrayDifference(arrayOne, arrayTwo)));
    }

    public static int[] arrayDifference(int[] one, int[] two) {
        if (one.length == two.length) {
            int length = one.length;
            int[] result = new int[length];

            for (int i = 0; i < length; i++) {
                result[i] = one[i] - two[i];
            }
            return result;
        } else
            throw new RuntimeException("Длины заданных масивов не равны. Расчет невозможен");

    }
}

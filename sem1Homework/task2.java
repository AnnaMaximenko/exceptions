package sem1Homework;

// Посмотрите на код, и подумайте сколько разных типов исключений вы тут сможете получить? 

// 1)NumberFormatException метод не может преобразовать String в числовой тип.
// 2)ArrayIndexOutOfBoundsException метод не может работать с пустым массивом
// 3)ArrayIndexOutOfBoundsException метод не может работать, если во вложенном массиве менее 5 элементов

public class task2 {
    public static void main(String[] args) {

        String[][] arr0 = new String[][] { null };

        System.out.println(sum2d(arr0));

    }

    public static int sum2d(String[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < 5; j++) {
                int val = Integer.parseInt(arr[i][j]);
                sum += val;
            }
        }
        return sum;
    }

}

package Sem2Homework;

// Если необходимо, исправьте данный код 
// (задание 2 https://docs.google.com/document/d/17EaA1lDxzD5YigQ5OAal60fOFKVoCbEJqooB9XfhT7w/edit)

// try {
//    int d = 0;
//    double catchedRes1 = intArray[8] / d;
//    System.out.println("catchedRes1 = " + catchedRes1);
// } catch (ArithmeticException e) {
//    System.out.println("Catching exception: " + e);
// }

public class task2 {
    public static void main(String[] args) {

    }

    double catchedRes1 = 0;
    boolean mark = true;

    public void getDevision(int[] arr, int position, int someNumber) {
        int d = someNumber;
        try {
            catchedRes1 = arr[position] / d;
        } catch (IndexOutOfBoundsException e) {
            mark = false;
            System.err.println("Возможна ошибка в индексе");
        } catch (ArithmeticException e) {
            mark = false;
            System.out.println("Catching exception: " + e);
        }
        if (mark)
            System.out.println("catchedRes1 = " + catchedRes1);
    }

}

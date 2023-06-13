package Sem2Homework;
// Разработайте программу, которая выбросит Exception, когда пользователь

import java.util.InputMismatchException;
import java.util.Scanner;

//  вводит пустую строку. Пользователю должно показаться сообщение, что пустые строки вводить нельзя.

public class task4 {
    public static void main(String[] args) {
        emptyString1();

    }

    public static void emptyString1() {
        boolean mark = true;
        while (mark) {
            System.out.println("Введите строку: ");
            Scanner input = new Scanner(System.in);
            String string = input.nextLine();
            if (string.isEmpty() || string.isBlank()) {
                System.err.println("Вероятно, вы ввели пустую строку");
            } else
                System.out.println("Ваша строка: " + string);
            mark = false;
            input.close();
        }

    }
}

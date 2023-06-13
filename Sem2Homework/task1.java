// Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float),
//и возвращает введенное значение. Ввод текста вместо числа не должно 
// приводить к падению приложения, вместо этого, необходимо повторно запросить у пользователя ввод данных.

package Sem2Homework;

import java.util.InputMismatchException;
import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {

        inputFractions();

    }

    private static void inputFractions() {
        while (true) {
            try {
                Scanner input = new Scanner(System.in);
                System.out.println("Введите число (типа float)");
                float franction = input.nextFloat();
                System.out.println("Ваше число: " + franction);
                input.close();
                return;
            } catch (InputMismatchException e) {
                System.out.println("Вероятно, вы ввели недопустимый формат данных ");
            }
        }
    }
}

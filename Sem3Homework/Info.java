import java.util.Scanner;

public class Info {

    public String getInfoAboutHuman() {
        boolean flag = true;
        String data = "";
        while (flag) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Введите данные пользователя, отделяйте слова пробелом");
            data = scanner.nextLine();

            try {
                isCorrectInputByCount(data);
            } catch (RuntimeException e) {
                e.printStackTrace();
            }

            if (getLength(parse(data)) != 6) {
                flag = true;
                scanner.close();
            } else
                flag = false;
        }

        return data;
    }

    public String[] parse(String str) {
        String[] array = str.split(" ");
        return array;
    }

    private int getLength(String[] arr) {
        return arr.length;
    }

    private void isCorrectInputByCount(String str) {
        if (getLength(parse(str)) != 6)
            throw new RuntimeException("В строке должно быть 6 слов. Проверьте свои данные: "
                    + str);

    }

}

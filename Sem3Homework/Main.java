import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


import javax.xml.crypto.Data;

public class Main {
    public static void main(String[] args) {

        boolean flag = true;
        while (flag) {
            Human people = new Human();
            String[] info = null;
            Info data = new Info();
            CheckInfo check = new CheckInfo();
            try {
                info = data.parse(data.getInfoAboutHuman());
                check.correctDate(info);
                check.correctTel(info);
                check.correctSex(info);
                people = new Human(info[0], info[1], info[2], info[3], info[4], info[5]);

                File file = new File(info[0]);
                try (FileWriter fw = new FileWriter(file, true);) {
                    fw.write(people.toString());
                    fw.append('\n');
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }

            } catch (DateException | SexException | PhoneException e) {
                e.printStackTrace();
            } catch (RuntimeException e) {
                System.err.println("Запись в файл невозможна");
            }

        }

    }

}

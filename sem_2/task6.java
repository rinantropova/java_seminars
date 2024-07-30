//Напишите метод, который определит тип (расширение) файлов из
//текущей папки и выведет в консоль результат вида
//1 Расширение файла: txt
//2 Расширение файла: pdf
//3 Расширение файла:
//4 Расширение файла: jpg

package sem_2;

import java.nio.file.Path;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;


public class task6 {
    public static void printFileExtensions () {
        try {
            Path currentDir = Paths.get(".");
            File[] files = currentDir.toFile().listFiles();

            if (files != null) {
                int count = 1;
                for (File file : files) {
                    if (file.isFile()) {
                        String name = file.getName();
                        int lastIndexOf = name.lastIndexOf(".");
                        String extension = lastIndexOf > 0 ? name.substring(lastIndexOf + 1) : "";

                        System.out.println(count + "File extension " + extension);
                        count++;
                    }
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        printFileExtensions();
    }
}

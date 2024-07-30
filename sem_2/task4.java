//Задание №4
//        Напишите метод, который составит строку, состоящую из 100
//повторений слова TEST и метод, который запишет эту строку в
//простой текстовый файл, обработайте исключения.

package sem_2;

import java.io.*;

public class task4 {
    public static String newString(String word, int num) {
        StringBuilder newLine = new StringBuilder();
        for (int i = 0; i < num; i++) {
            newLine.append(word).append(" ");
        }
        return newLine.toString();
    }

    public static void createDoc(String path, String line) throws IOException {
        try (FileWriter fw = new FileWriter(path)) {
            fw.write(line);
            fw.flush();
            fw.close();
        }
    }

    public static void main(String[] args) throws IOException {
        String word = "TEST";
        int repeatNum = 100;

        System.out.println(newString(word, repeatNum));
        createDoc("task4_file.txt", newString(word, repeatNum));
    }
}

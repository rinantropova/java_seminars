//Задание №5
//Напишите метод, который вернет содержимое текущей папки в виде массива строк.
//Напишите метод, который запишет массив, возвращенный предыдущим методом в файл.
//Обработайте ошибки с помощью try-catch конструкции. В случае возникновения исключения, оно должно записаться
//в лог-файл.
package sem_2;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class task5 {

//    static Logger log = Logger.getLogger(task5.class.getName());
    static final Logger LOGGER = Log.getLogger(task5.class.getName());

    public static void main(String[] args) {
        writeFile("sem2.txt", "C:\\Users\\Administrator\\OneDrive\\Documents\\GeekBrains\\java_intro" +
                "\\lectures");
    }
    public static List<String> readDir(String path) {
        File folder = new File(path);
//        if (isThrow()) {
//            LOGGER.log(Level.INFO, "Error reading directory: " + folder.getAbsolutePath());
//        }

        if (!folder.isDirectory()) {
//            return null;
            throw new RuntimeException("File is not a directory!");
        }
        File[] files = folder.listFiles();
        List<String> result = new ArrayList<>();

        for (File file : files) {
            String name = file.getName();
            result.add(name);
            if (isThrow()) {
                LOGGER.log(Level.INFO, "Error reading directory: " + folder.getAbsolutePath());
            }
        }
//        String line;
//
//        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
//            while ((line = br.readLine()) != null) {
//                result.add(line);
//            }
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
        return result;

    }

    public static void writeFile(String pathIn, String pathOut) {
        List<String> list = readDir(pathOut);

        try (FileWriter fw = new FileWriter(pathIn);) {
            for (String s : list) {
                fw.write(s + "\n");
                fw.flush();
                if (isThrow()) {
                    LOGGER.log(Level.INFO, "Error writing directory: " + s);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }


    private static boolean isThrow() {
        int a = 0;
        int b = 2;
        int digit = a + (int) (Math.random() * b);
//        System.out.println(digit);
        return digit > 0;
    }

}

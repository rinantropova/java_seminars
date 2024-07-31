/*
Реализуйте алгоритм сортировки пузырьком числового массива,
результат после каждой итерации запишите в лог-файл.
Напишите свой код в методе sort класса BubbleSort. Метод sort принимает на вход один параметр:
int[] arr - числовой массив
После каждого прохода по массиву ваш код должен делать запись в лог-файл 'log.txt'
в формате год-месяц-день час:минуты {массив на данной итерации}.
Для логирования использовать логгер logger класса BubbleSort.
 */
package hw_2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Arrays;
import java.util.Date;
import java.util.logging.FileHandler;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class task2 {
    private static final Logger logger = Logger.getLogger(task2.class.getName());

    static {
        try {
            FileHandler fh = new FileHandler("log.txt");
            SimpleFormatter formatter = new SimpleFormatter() {
                @Override
                public synchronized String format(java.util.logging.LogRecord lr) {
                    return lr.getMessage() + System.lineSeparator();
                }
            };
            fh.setFormatter(formatter);
            logger.addHandler(fh);
            logger.setUseParentHandlers(false);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

public static void sort(int[] arr) {
        int length = arr.length;
        boolean isSorted;

        for (int i = 0; i < length - 1; i++) {
            isSorted = false;
            for (int j = 0; j < length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    isSorted = true;
                }
            }
            logArrayState(arr);
            if (!isSorted)
                break;
        }
    }

private static void logArrayState(int[] arr) {
    LocalDateTime now = LocalDateTime.now();
    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
    String dateTime = now.format(formatter);
    String arrayState = Arrays.toString(arr);
    logger.info(dateTime + " " + arrayState);
}

    public static void main(String[] args) {
        int[] array = new int[] {2, 4, 1, 5, 3};
        sort(array);
        try (BufferedReader br = new BufferedReader(new FileReader("log.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

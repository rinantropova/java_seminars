// Настроить проект, вывести в консоль “Hello world!”.
// Вывести в консоль системные дату и время.

package sem_1;
// import java.util.Scanner;

//import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class task1 {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        System.out.println(dtf.format(now));
        System.out.println("Hello, world!");
        System.out.println("Привет");
        System.out.println("Today and now: " + dtf.format(now));


    }
}

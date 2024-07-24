// В консоли запросить имя пользователя. В зависимости от текущего времени, вывести приветствие вида 
// "Доброе утро, <Имя>!", если время от 05:00 до 11:59
// "Добрый день, <Имя>!", если время от 12:00 до 17:59;
// "Добрый вечер, <Имя>!", если время от 18:00 до 22:59;
// "Доброй ночи, <Имя>!", если время от 23:00 до 4:59


package sem_1;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class task2_1 {
    public static void main(String[] args) {
        LocalDateTime dateTime = LocalDateTime.now();
        LocalTime time = dateTime.toLocalTime();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("HH:mm:ss");
        System.out.println("Time is: " + dtf.format(time));
        LocalTime morningStart = LocalTime.of(5, 0);
        LocalTime morningEnd = LocalTime.of(11, 59);

        LocalTime afternoonStart = LocalTime.of(12, 0);
        LocalTime afternoonEnd = LocalTime.of(17, 59);

        LocalTime eveningStart = LocalTime.of(18, 0);
        LocalTime eveningEnd = LocalTime.of(22, 59);

        // LocalTime nightStart = LocalTime.of(23, 0);
        // LocalTime nightEnd = LocalTime.of(4, 59);

        Scanner iScanner = new Scanner(System.in);
        System.out.println("What is your name: ");
//        String name = new Scanner(System.in).next();
        String name = iScanner.nextLine();
        // System.out.printf("Hello, %s", name);
        if (time.isAfter(morningStart) && time.isBefore(morningEnd.plusSeconds(1))) {
            System.out.printf("Good morning, %s", name);
        }
        else if (time.isAfter(afternoonStart) && time.isBefore(afternoonEnd.plusSeconds(1))) {
            System.out.printf("Good afternoon, %s", name);
        }
        else if (time.isAfter(eveningStart) && time.isBefore(eveningEnd.plusSeconds(1))) {
            System.out.printf("Good evening, %s", name);
        }
        else {
            System.out.printf("Good night, %s", name);
        }

        iScanner.close();
    }
}
// streams should be closed. Scanner is a stream.
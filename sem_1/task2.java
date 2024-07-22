// Написать программу, которая попросит пользователя ввести <Имя> в консоли. 
// Получит введенную строку и напечатает в консоль сообщение “Привет, <Имя>!”


package sem_1;
import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.println("What is your name: ");
        String name = iScanner.nextLine();
        System.out.printf("Hello, %s", name);
        iScanner.close();
    }
}

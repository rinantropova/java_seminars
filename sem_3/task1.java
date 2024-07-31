/*
Заполнить список десятью случайными числами.
Отсортировать список методом sort() и вывести его на экран.
 */
package sem_3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class task1 {
    public static void main(String[] args) {
        extracted1();
        extracted2();
    }

    public static void extracted1() {
        List<Integer> numbers = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            numbers.add(random.nextInt(96) + 5); // Generate numbers from 5 to 100
//            numbers.add(random.nextInt(100) + 1); // Generate numbers from 1 to 100
        }

        System.out.println("Unsorted list: " + numbers);

        Collections.sort(numbers, Collections.reverseOrder()); // Sort the list

        System.out.println("Sorted list: " + numbers); // Print sorted list
    }

    public static void extracted2() {
        List<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
//            int randomNum = (int)(Math.random() * 96) + 5; // Generates numbers from 5 to 100
            int randomNum = (int)(Math.random() * 100) + 1; // Generates numbers from 1 to 100
            numbers.add(randomNum);
        }

        System.out.println("Unsorted list: " + numbers);

        Collections.sort(numbers);

        System.out.println("Sorted list: " + numbers);
    }
}

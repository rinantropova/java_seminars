//Задание №3
//        Напишите метод, который принимает на вход строку (String) и
//определяет является ли строка палиндромом (возвращает
//boolean значение).

package sem_2;

public class task3 {
    public static boolean isPalindrome(String input) {
        String newInput = input.toLowerCase();
        return new StringBuilder(newInput).reverse().toString().equals(newInput);
    }

    public static void main(String[] args) {
        String word = "Hannah";

        System.out.println(isPalindrome(word));
    }
}

//Задание №2
//        Напишите метод, который сжимает строку.
//Пример: aaaabbbcdd → a4b3cd2

package sem_2;

public class task2 {
    public static String squeezeString(String input) {
        if (input == null || input.isEmpty()) {
            return input;
        }

        StringBuilder res = new StringBuilder();
        char lastChar = input.charAt(0);
        res.append(lastChar);

        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            if (currentChar != lastChar) {
                res.append(currentChar);
                lastChar = currentChar;
            }
        }
        return res.toString();
    }

    public static void main(String[] args) {
        String line = "aaaabbbcdd";

        System.out.println(squeezeString(line));
    }
}

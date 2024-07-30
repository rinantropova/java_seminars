//Задание №1
//Дано четное число N (>0) и символы c1 и c2.
//Написать метод, который вернет строку длины N*2, которая
//состоит из чередующихся символов c1 и c2, начиная с c1.
// result: c1c2c1…c2 (всего N символов)

package sem_2;

public class task1 {
    public static String alternateChars(int n, String c1, String c2) {
        if (n <= 0 || n % 2 != 0) {
            throw new IllegalArgumentException("N must be a positive even number");
        }

        StringBuilder result = new StringBuilder(n);
        for (int i = 0; i < n*2; i++) {
            result.append(i % 2 == 0 ? c1 : c2);
        }
        return result.toString();
    }

    public static void main(String[] args) {
        int n = 6;
        String c1 = "c1";
        String c2 = "c2";

        System.out.println(alternateChars(n, c1, c2));


    }
}

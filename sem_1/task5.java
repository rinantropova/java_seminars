// Во фразе "Добро пожаловать на курс по Java" переставить слова в обратном порядке.


package sem_1;

public class task5 {
    public static void main(String[] args) {
        String s = "Добро пожаловать на курс по Java";
        String reversed = reverseWords(s);
        System.out.println(reversed);

        // String rs = "Добро пожаловать на курс по Java";
        // String reversedSt = new StringBuilder(rs).reverse().toString();
        // String[] words = rs.split(" ");
        // for (String word : words) {
        //     System.out.println(word);
        }
    

    public static String reverseWords(String s) {
        String[] words = s.split(" ");

        for (int i = 0; i < words.length / 2; i++) {
            String temp = words[i];
            words[i] = words[words.length - 1 - i];
            words[words.length - 1 - i] = temp;
        }
        return String.join(" ", words);
    }
}

package sem_3;

public class task0 {
    public static void main(String[] args) {

        Task0_0.isEqual(Task0_0.s1, Task0_0.s6);
    }
}

class Task0_0 {
    public static String s1 = "hello";
    public static String s2 = "hello";

    public static String s3 = s1;

    public static String s4 = "h" + "e" + "l" + "l" + "o";
    public static String s5 = new String("hello");
    public static String s6 = new String(new char[]{'h', 'e', 'l', 'l', 'o'});

    public static void isEqual(String arg0, String arg1) {
//        s1 = s2 + "werdhtfcjylhkjh";
        if (arg0 == arg1) {
            System.out.println("Equals as links");
        } else if (arg0 != arg1) {
            System.out.println("Not equal as links");
        }
        if (arg0.equals(arg1)) {
            System.out.println("Equals as values");
        } else if (!arg0.equals(arg1)) {
            System.out.println("Not equal as values");
        }
    }
}

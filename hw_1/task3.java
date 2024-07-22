// Реализовать простой калькулятор

package hw_1;

public class task3 {
    public static double calculate(char op, int a, int b) {
        switch (op) {
            case '+':
                return a + b;
            case '-':
                return a - b;
            case '*':
                return a * b;
            case '/':
                if (b != 0) {
                    return (double) a / b;
                } else {
                    throw new IllegalArgumentException("Division by zero is not allowed");

                }
            default:
                throw new IllegalArgumentException("Invalid operator: " + op);
        }
    }
    public static void main(String[] args) {
        int a = 7;
        char op = '+';
        int b = 3;
        System.out.println(calculate(op, a, b));
    }
}

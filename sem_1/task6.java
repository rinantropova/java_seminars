// Реализовать функцию возведения числа а в степень b. a, b из Z. Сводя количество выполняемых действий к минимуму.
// Пример 1: а = 3, b = 2, ответ: 9
// Пример 2: а = 2, b = -2, ответ: 0.25
// Пример 3: а = 3, b = 0, ответ: 1

package sem_1;

public class task6 {
    public static void main(String[] args) {
        double a = 3;
        double b = 0;
        double result = Math.pow(a, b);
        System.out.println(result);
    }
}

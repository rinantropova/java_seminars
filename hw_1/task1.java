// 1. Вычислить n-ое треугольного число(сумма чисел от 1 до n), 
// 


package hw_1;

public class task1 {
    public static void main(String[] args) {
        int n = 5;
        int res = countTriangle(n);
        System.out.println(res);
    }
    public static int countTriangle(int n) {
        if (n < 1) {
            return -1;
        }
        if (n == 1) {
            return 1;
        }
        return n + countTriangle(n-1);
       
       
    }
}

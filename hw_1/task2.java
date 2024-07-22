// Вывести все простые числа от 1 до 1000 


package hw_1;

public class task2 {
    public static void printPrimeNums() {
        int n = 1000;
        boolean[] isPrime = new boolean[n + 1];

        for (int i = 2; i <= n; i++) {
            isPrime[i] = true;
        }

        for (int i = 2; i * i < n; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j < n; j += i) {
                    isPrime[j] = false;
                }
            }
        }
        
        for (int i = 2; i < n; i++) {
            if (isPrime[i]) {
                System.out.println(i);
            }
        }
    }
    public static void main(String[] args) {
        printPrimeNums();
    }
}

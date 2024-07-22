// Дан массив двоичных чисел, например [1,1,0,1,1,1], вывести максимальное количество подряд идущих 1.


package sem_1;

public class task3 {
    public static void main(String[] args) {
        
        int[] arr = new int[] { 1, 1, 0, 1, 1, 1, 0, 0, 0, 0 };
        System.out.println(arr.length);

        int count = 0;
        int maxCount = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) {
                count += 1;
                maxCount = Math.max(maxCount, count);
            }
            else {
                count = 0;
            }
        }
        System.out.println(maxCount);
    }
}

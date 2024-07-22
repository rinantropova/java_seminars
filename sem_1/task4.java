// Дан массив nums = [3,2,2,3] и число val = 3. 
// Если в массиве есть числа, равные заданному, нужно перенести эти элементы в конец массива. 
// Таким образом, первые несколько (или все) элементов массива должны быть отличны от заданного, 
//  остальные - равны ему.


package sem_1;

import java.util.Arrays;

public class task4 {
    public static void main(String[] args) {
        int[] arr = new int[] { 3, 2, 2, 3 };
        int val = 3;
        
        int endIndex = arr.length - 1;

        for (int i = 0; i <= endIndex;) {
            if (arr[i] == val) {
                int temp = arr[i];
                arr[i] = arr[endIndex];
                arr[endIndex] = temp;
                endIndex--;
            }
            else {
                i++;
            }
            
        }
        System.out.println(Arrays.toString(arr));
    }

    
}

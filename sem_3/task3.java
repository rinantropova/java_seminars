/*
Создать список типа ArrayList<String>.
Поместить в него как строки, так и целые числа.
Пройти по списку, найти и удалить целые числа.
 */
package sem_3;

import java.util.ArrayList;

public class task3 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList<String>(); // way to mislead compilation
        list.add("a");
        list.add("FDFDFD");
//        list.add(23); // list should have only strings according to the task
        list.add(23);
        System.out.println(list);
    }

}

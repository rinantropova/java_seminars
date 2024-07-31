/* Каталог товаров книжного магазина сохранен в виде двумерного списка List<ArrayList<String>> так,
что на 0-й позиции каждого внутреннего списка содержится название жанра,
а на остальных позициях - названия книг. Напишите метод для заполнения данной структуры.
 */
package sem_3;

import java.util.ArrayList;
import java.util.List;

public class task4 {
    private static final List<List<String>> LIBRARY = new ArrayList<>();

    public static List<List<String>> fillLibrary(List<String> genreAndBooks) {
        LIBRARY.add(genreAndBooks);
        return LIBRARY;
    }

    public static List<List<String>> getLibrary() { return LIBRARY; }

    public static void main(String[] args) {
        List<String> books0 = List.of("prose", "War and Peace", "12 chairs");
        List<String> books1 = List.of("poetry", "Borodino", "Eugene Onegin");

        fillLibrary(books0);
        fillLibrary(books1);

        System.out.println(getLibrary());
    }
}

/*
Заполнить список названиями планет Солнечной системы в произвольном порядке с повторениями.
Вывести название каждой планеты и количество его повторений в списке.
Пройти по списку из предыдущего задания и удалить повторяющиеся элементы.
 */

package sem_3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class task2 {
    public static void main(String[] args) {
        planets();
    }

    public static void planets() { // first way to solve the task within one method
        String[] planets = { "Mercury", "Venus", "Earth", "Mars", "Jupiter", "Saturn", "Uranus", "Neptune", "Pluto"};

        List<String> planetList = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < 20; i++) {
            int index = random.nextInt(planets.length); // Generates random index
            planetList.add(planets[index]); // Adds planet to the list
        }

        System.out.println("List of planets: " + planetList);

        List<String> uniquePlanets = new ArrayList<>();
        List<Integer> counts = new ArrayList<>();

        for (String planet : planetList) {
            int index = uniquePlanets.indexOf(planet); // finds planet's index in unique values
            if (index == -1) { // if planet isn't added
                uniquePlanets.add(planet); // adds planet
                counts.add(1); // sets up counter for the new planet
            } else {
                counts.set(index, counts.get(index) + 1); // increases counter for existing planet
            }
        }
        System.out.println("Amount of repetitions for each planet is: ");
        for (int i = 0; i < uniquePlanets.size(); i++) {
            System.out.println(uniquePlanets.get(i) + ": " + counts.get(i));
        }
        List<String> strings = removeEquals(planetList);
        System.out.println("Unique: " + strings);
    }

    public static void getPlanets(List<String> planets) { // second way to solve with additional methods to print and remove
        // synchronization of 2 lists
        List<String> uniquePlanets = new ArrayList<>();
        List<Integer> planetCounts = new ArrayList<>();

        for (String planet : planets) {
            int position = uniquePlanets.indexOf(planet);
            if (position >= 0) {
                planetCounts.set(position, planetCounts.get(position) + 1);

            } else {
                uniquePlanets.add(planet);
                planetCounts.add(1);
            }
        }
        printPlanetCount(uniquePlanets, planetCounts);
    }

    private static void printPlanetCount(List<String> planets, List<Integer> counts) {
        for (int i = 0; i < planets.size(); i++) {
            System.out.printf("%-10s : %3d%n", planets.get(i), counts.get(i));
        }
    }

    public static List<String> removeEquals(List<String> elements) {
        elements.sort(String::compareTo);
        for (int i = 1; i < elements.size(); i++) {
            if (elements.get(i).equals(elements.get(i - 1))) {
                elements.remove(elements.get(i));
                i--;
            }
        }
//        System.out.println(elements);
        return elements;
    }

    //region Third solution with 2 For loops
    public static void planets2for(List<String> planets) {
        StringBuilder builder = new StringBuilder();
        List<String> result = new ArrayList<>();
        for (int i = 0; i < planets.size(); i++) {
            if (!result.contains(planets.get(i))) {
                result.add(planets.get(i));
                int counter = 0;
                for (int j = 0; j < planets.size(); j++) {
                    if (planets.get(j).equals(planets.get(i))) counter++;
                }
                builder.append(planets.get(i)).append(" : "). append(counter).append(", ");
            }
        }
        System.out.println(builder);
    }

}

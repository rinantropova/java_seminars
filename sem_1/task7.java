// Записать в файл следующие данные:

// Name Surname Age
// Kate Smith 20
// Paul Green 25
// Mike Black 23 

package sem_1;
import java.io.*;

public class task7 {
    public static void main(String[] args) {
        try (FileWriter fw = new FileWriter("data.txt", false)) {
            fw.write("Name Surname Age");
            fw.append("\n");
            fw.write("Kate Smith 20");
            fw.append("\n");
            fw.write("Paul Green 25");
            fw.append("\n");
            fw.write("Mike Black 23");
            fw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

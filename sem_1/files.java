package sem_1;

import java.io.*;

public class files {
    public static void main(String[] args) {
        writetoFile("file_2.txt", "Second Hello world!\nBack to USSR");
        readFile("file_2.txt");
    }
//    private static void writetoFile(String path, String content) {
////        File file = new File(path);
//        FileWriter fw = null;
//        try {
//            fw = new FileWriter(path);
//            fw.write(content);
//            fw.flush();
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        } finally {
//            try {
//                fw.close();
//            } catch (IOException e) {
//                throw new RuntimeException(e);
//            }
//        }
//    }

    private static void writetoFile(String path, String content) {

       try (FileWriter fw = new FileWriter(path);) {
            fw.write(content);
            fw.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static String readFile(String path) {
        String line;
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return line;
    }
}

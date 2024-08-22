package Ultimate_Java_Masterclass.Problem4;

import java.io.*;

public class question1 {
    public static void main(String[] args) throws IOException {
        try (FileWriter fw = new FileWriter("test.txt")) {
            fw.write("Hello This is Ashwin");
            System.out.println("Successfully added \"Hello This is Ashwin\" to the file");
        }
        catch (IOException e) {
            System.out.println(e);
        }

        try (BufferedReader reader = new BufferedReader(new FileReader("test.txt"))) {
            String line;
            System.out.println("Content read from file:");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        }
        catch (IOException e) {
            System.out.println(e);
        }

    }
}

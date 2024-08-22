package Ultimate_Java_Masterclass.assignment3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class question2 {

    public static void readFile(String filePath) throws IOException {
        BufferedReader reader = null;
        try {
            reader = new BufferedReader(new FileReader(filePath));
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println("Checked Exception caught: " + e.getMessage());
            throw e;
        } finally {
            if (reader != null) {
                reader.close();
            }
        }
    }

    public static void divideNumbers(int a, int b) {
        try {
            int result = a / b;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Unchecked Exception caught: Division by zero is not allowed.");
        }
    }

    public static void main(String[] args) {
        try {
            readFile("test.txt");
        } catch (IOException e) {
            System.out.println("Handled IOException in main: " + e.getMessage());
        }

        divideNumbers(10, 0);

        try {
            int[] numbers = {1, 2, 3};
            System.out.println(numbers[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Unchecked Exception caught: " + e.getMessage());
        }
    }
}

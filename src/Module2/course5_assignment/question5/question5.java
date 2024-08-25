package Module2.course5_assignment.question5;

public class question5 {
    public static void main(String[] args) {
        DataProcessor processor = new DataProcessor();

        try {
            int[] validData = {10, 20, 30, 40, 50};
            double average = processor.processData(validData);
            System.out.println("Average of valid data: " + average);
        } catch (InvalidDataException e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            int[] emptyData = {};
            double average = processor.processData(emptyData);
            System.out.println("Average of empty data: " + average);
        } catch (InvalidDataException e) {
            System.out.println("Error: " + e.getMessage());
        }

        try {
            int[] nullData = null;
            double average = processor.processData(nullData);
            System.out.println("Average of null data: " + average);
        } catch (InvalidDataException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}

package Module2.course5_assignment.question5;

public class DataProcessor {
    public double processData(int[] data) throws InvalidDataException {
        if (data == null || data.length == 0) {
            throw new InvalidDataException("Array is null or empty");
        }

        int sum = 0;
        for (int num : data) {
            sum += num;
        }
        return (double) sum / data.length;
    }
}

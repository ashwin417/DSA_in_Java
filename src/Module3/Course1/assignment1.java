package Module3.Course1;

public class assignment1 {
    public static void main(String[] args) {
        int numerator = 10;
        int denominator = 0;

        try {
            int result = divideNumbers(numerator, denominator);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero.");
        }
    }

    private static int divideNumbers(int numerator, int denominator) throws ArithmeticException {
        if (denominator == 0) {
            throw new ArithmeticException("Denominator cannot be zero.");
        }
        return numerator / denominator;
    }
}

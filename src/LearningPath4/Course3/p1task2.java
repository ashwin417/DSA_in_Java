package LearningPath4.Course3;

public class p1task2 {
    public static void main(String[] args) {

        String sample = "Hello, This is Ash!";

        String upperCaseString = sample.toUpperCase();
        System.out.println("Uppercase: " + upperCaseString);

        String lowerCaseString = sample.toLowerCase();
        System.out.println("Lowercase: " + lowerCaseString);

        int lengthOfString = sample.length();
        System.out.println("Length: " + lengthOfString);

        char charAtIndex = sample.charAt(7);
        System.out.println("Character at index 7: " + charAtIndex);

        String substring = sample.substring(7, 12);
        System.out.println("Substring from index 7 to 12: " + substring);
    }
}

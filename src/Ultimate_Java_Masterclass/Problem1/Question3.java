package Ultimate_Java_Masterclass.Problem1;

public class Question3 {
    public static void main(String[] args) {
        double doubleVar = 3.14159;
        System.out.println("Double Value: " + doubleVar);

        double doubleResult = doubleVar * 2;
        System.out.println("Double after multiplication: " + doubleResult);

        char charVar = 'A';
        System.out.println("\nChar Value: " + charVar);

        charVar = (char) (charVar + 1);
        System.out.println("Next Character: " + charVar);

        float floatVar = 9.81f;
        System.out.println("\nFloat Value: " + floatVar);

        float floatResult = floatVar / 2;
        System.out.println("Float after division: " + floatResult);

        boolean booleanVar = true;
        System.out.println("\nBoolean Value: " + booleanVar);

        booleanVar = !booleanVar;
        System.out.println("Boolean after negation: " + booleanVar);

        int intVar = 100;
        System.out.println("\nInt Value: " + intVar);

        int intResult = intVar + 50;
        System.out.println("Int after addition: " + intResult);
    }
}

//Output:
//Double Value: 3.14159
//Double after multiplication: 6.28318
//
//Char Value: A
//Next Character: B
//
//Float Value: 9.81
//Float after division: 4.905
//
//Boolean Value: true
//Boolean after negation: false
//
//Int Value: 100
//Int after addition: 150
//
//Process finished with exit code 0
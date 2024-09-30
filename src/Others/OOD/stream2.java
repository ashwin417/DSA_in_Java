package Others.OOD;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class stream2 {

    public static void main(String[] args) {
        String[] fruits = {"apple", "banana", "cherry", "peach", "grape", "chikoo", "orange", "mango", "apricot", "lichi"};

        List<String> fil = Arrays.stream(fruits)
                .filter(fruit -> fruit.contains("ch"))
                .collect(Collectors.toList());

        System.out.println(fil);
    }
}

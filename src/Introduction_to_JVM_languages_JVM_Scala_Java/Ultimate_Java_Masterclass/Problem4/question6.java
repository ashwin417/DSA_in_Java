package Introduction_to_JVM_languages_JVM_Scala_Java.Ultimate_Java_Masterclass.Problem4;

import java.util.HashMap;
import java.util.Map;

public class question6 {
    public static void main(String[] args) {
        Map<Integer, Integer> map = new HashMap<>();
        map.put(1, 2);
        map.put(2, 3);
        map.put(3, 4);
        map.put(4, 5);
        System.out.println("Map is "+map);
        int size = map.size();
        System.out.println("Size of the map is "+size);
    }
}

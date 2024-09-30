import java.util.*;
import java.util.stream.*;

public class Main{
    public static void main(String[] args) {


        List<Integer> list = Arrays.asList(10,33,40,69,90,98,13,19,48);
        List<Integer> some = list.stream()
                .filter( n -> n % 2 == 0)
                .map( n -> n * n)
                .collect(Collectors.toList());
        System.out.println(some);
        //.forEach(System.out::println);
    }
}
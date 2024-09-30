import java.util.*;

@FunctionalInterface
interface Calculator{
    int square(int y);  // single abstract method
    default int add(int a, int b)
    {
        return a + b;
    }
    default int sub(int a, int b)
    {
        return a - b;
    }
    static int div(int a, int b)
    {
        return a/b;
    }
    static int mul(int a, int b)
    {
        return a * b ;
    }
}

public class Main implements Calculator{
    public static void main(String[] args) {
        int a = 20;
        int b = 9;
        Main m = new Main();

        int add = m.add(a,b);
        int sub = m.sub(a,b);
        int mul = Calculator.mul(a,b);
        float div = Calculator.div(a,b);
        System.out.println(add);
        System.out.println(sub);
        System.out.println(mul);
        System.out.println(div);
    }
    public int square(int x)
    {
        return x * x;
    }
}
@FunctionalInterface
interface Area{
    int calcualte(int y);
}

public class Main {
    public static void main(String[] args) {
        int side = 20;
        Area a = (int x) -> x * x;
        int res = a.calcualte(side);
        System.out.println("the result is : " + res);
    }
}
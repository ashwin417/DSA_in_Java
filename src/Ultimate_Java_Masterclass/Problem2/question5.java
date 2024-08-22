//Create a class Rectangle with length and breadth properties. Write a default constructor to assign default length and breadth with the value 10. Also write a parameter constructor to initialize length and breadth with any given values. Write the main program to test the functionality of Rectangle class. Use the "this" keyword wherever it is required.
package Ultimate_Java_Masterclass.Problem2;

class Rectangle{
    int length;
    int breadth;

    Rectangle()
    {
        length = 10;
        breadth = 10;
    }

    Rectangle(int l, int b){
        this.length = l;
        this.breadth = b;
    }

    int area(){
        return length * breadth;
    }

}
public class question5 {
    public static void main(String[] args) {
        Rectangle r = new Rectangle();
        System.out.println("Default Constructor\nLength is " + r.length);
        System.out.println("Breadth is " + r.breadth);
        System.out.println("Area = "+r.area());

        Rectangle r1 = new Rectangle(5,5);
        System.out.println("\nParameterized Constructor\nLength is " + r1.length);
        System.out.println("Breadth is " + r1.breadth);
        System.out.println("Area = " + r1.area());
    }
}

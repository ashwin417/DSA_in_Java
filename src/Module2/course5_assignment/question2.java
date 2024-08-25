package Module2.course5_assignment;

interface shape {
    double calculateArea();
    void displayShapeInfo();
}

class circle implements shape {

    private double radius;

    public circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        double v = Math.PI * radius * radius;
        return v;
    }

    @Override
    public void displayShapeInfo() {
        System.out.println("The circle is at radius " + radius + ".");
        System.out.println("Area is " + calculateArea());
    }
}

class rectangle implements shape {
    private double width;
    private double height;
    public rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    public double calculateArea() {
        return width * height;
    }
    public void displayShapeInfo() {
        System.out.println("The rectangle is at radius " + width + "x" + height + ".");
        System.out.println("Area is " + calculateArea());
    }
}

public class question2 {
    public static void main(String[] args) {
        shape circle = new circle(5);
        circle.displayShapeInfo();
        shape rectangle = new rectangle(5, 10);
        rectangle.displayShapeInfo();
    }
}

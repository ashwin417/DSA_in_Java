package Module2.course5_assignment;

abstract class animal {
    String name;
    public animal(String name) {
        this.name = name;
    }
    public void makeSound() {
        System.out.println("MakeSound");
    }
}

class Dog extends animal {
    public Dog(String name) {
        super(name);
    }

    public void makeSound() {
        System.out.println(name + " says Bow Bow");
    }
}
class Cat extends animal {
    public Cat(String name) {
        super(name);
    }

    public void makeSound() {
        System.out.println(name + " says Meow Meow");
    }
}

public class question3 {
    public static void main(String[] args) {
        animal[] animals = new animal[4];
        animals[0] = new Dog("Jay");
        animals[1] = new Cat("Kunal");
        animals[2] = new Dog("Febin");
        animals[3] = new Cat("Hemant");

        for (animal animal : animals) {
            animal.makeSound();
            System.out.println();
        }
    }
}


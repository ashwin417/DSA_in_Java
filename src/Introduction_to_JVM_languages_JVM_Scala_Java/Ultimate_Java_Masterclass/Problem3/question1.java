abstract class Animal {
    abstract void makeSound();
}

class Dog extends Animal {
    @Override
    void makeSound() {
        System.out.println("The dog barks.");
    }
}

public class question1 {
    public static void main(String[] args) {
        Animal myDog = new Dog();

        myDog.makeSound();
    }
}

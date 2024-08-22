package Ultimate_Java_Masterclass.Problem3;

import java.util.Arrays;
import java.util.Comparator;

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + "}";
    }

    public int getAge() {
        return age;
    }
}

public class question5 {
    public static void main(String[] args) {
        Person[] people = {
                new Person("Ana", 30),
                new Person("Ash", 25),
                new Person("Dev", 35)
        };

        System.out.println("Before sorting:");
        for (Person person : people) {
            System.out.println(person);
        }

        Arrays.sort(people, Comparator.comparingInt(Person::getAge));

        System.out.println("\nAfter sorting by age:");
        for (Person person : people) {
            System.out.println(person);
        }
    }
}

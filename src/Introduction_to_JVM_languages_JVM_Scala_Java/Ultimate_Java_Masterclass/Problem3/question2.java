package Introduction_to_JVM_languages_JVM_Scala_Java.Ultimate_Java_Masterclass.Problem3;

abstract class Student {
    abstract void study();

    void attendClass() {
        System.out.println("Attending classes.");
    }
}

class UndergraduateStudent extends Student {
    void study() {
        System.out.println("Undergraduate student is studying general subjects.");
    }
}

class PostgraduateStudent extends Student {
    void study() {
        System.out.println("Postgraduate student is researching advanced topics.");
    }
}

public class question2 {
    public static void main(String[] args) {
        Student undergrad = new UndergraduateStudent();
        Student postgrad = new PostgraduateStudent();

        System.out.println("Undergraduate Student:");
        undergrad.attendClass();
        undergrad.study();

        System.out.println("\nPostgraduate Student:");
        postgrad.attendClass();
        postgrad.study();
    }
}


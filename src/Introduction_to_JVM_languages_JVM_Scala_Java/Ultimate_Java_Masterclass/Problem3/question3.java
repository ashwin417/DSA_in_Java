interface Student {
    void study();
}

class Undergraduate implements Student {
    @Override
    public void study() {
        System.out.println("Undergraduate student is studying for exams.");
    }
}

class Graduate implements Student {
    @Override
    public void study() {
        System.out.println("Graduate student is conducting research.");
    }
}

public class question3 {
    public static void main(String[] args) {
        Student undergrad = new Undergraduate();
        Student grad = new Graduate();

        undergrad.study();
        grad.study();
    }
}

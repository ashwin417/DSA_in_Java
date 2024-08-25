package Module2.course1;

public class q1 {
    public static void main(String[] args) {
        Department dept1 = new Department("CSE", "001", "Block A", 1995);
        Department dept2 = new Department("ECE", "002", "Block B", 1996);

        Teaching_Staff teacher1 = new Teaching_Staff("T001", "Dr. Smith", "PhD", "CSE", 2005);
        Teaching_Staff teacher2 = new Teaching_Staff("T002", "Prof. John", "MTech", "ECE", 2008);

        Student_Details student1 = new Student_Details("S001", "Alice", "alice@gmail.com", "CSE", "T001", 1234567890);
        Student_Details student2 = new Student_Details("S002", "Bob", "bob@gmail.com", "ECE", "T002", 1876543210);
        Student_Details student3 = new Student_Details("S003", "Charlie", "charlie@gmail.com", "CSE", "T001", 1122334455);
        Student_Details student4 = new Student_Details("S004", "David", "david@gmail.com", "ECE", "T002", 1988776655);
        Student_Details student5 = new Student_Details("S005", "Eve", "eve@gmail.com", "CSE", "T001", 1234987654);

        Student_Marks marks1 = new Student_Marks("S001", 1, 80, 75, 90, 85);
        Student_Marks marks2 = new Student_Marks("S002", 1, 88, 79, 91, 86);
        Student_Marks marks3 = new Student_Marks("S003", 1, 78, 85, 84, 82);
        Student_Marks marks4 = new Student_Marks("S004", 1, 92, 88, 85, 90);
        Student_Marks marks5 = new Student_Marks("S005", 1, 75, 80, 79, 82);

        marks1.display();
        marks2.display();
        marks3.display();
        marks4.display();
        marks5.display();
    }
}

class Department {
    public String name, code, building;
    public long year;

    Department(String name, String code, String building, long year) {
        this.name = name;
        this.code = code;
        this.building = building;
        this.year = year;
    }
}

class Teaching_Staff {
    String ID, name, qualification, department_code;
    long doj;

    Teaching_Staff(String ID, String name, String qualification, String department_code, long doj) {
        this.ID = ID;
        this.name = name;
        this.qualification = qualification;
        this.department_code = department_code;
        this.doj = doj;
    }
}

class Student_Details {
    String ID, name, email_ID, department_code, teacher_code;
    long phone_number;

    Student_Details(String ID, String name, String email_ID, String department_code, String teacher_code, long phone_number) {
        this.ID = ID;
        this.name = name;
        this.email_ID = email_ID;
        this.department_code = department_code;
        this.teacher_code = teacher_code;
        this.phone_number = phone_number;
    }
}

class Student_Marks {
    String ID;
    long sem_no;
    float s1, s2, s3, s4;

    Student_Marks(String ID, long sem_no, float s1, float s2, float s3, float s4) {
        this.ID = ID;
        this.sem_no = sem_no;
        this.s1 = s1;
        this.s2 = s2;
        this.s3 = s3;
        this.s4 = s4;
    }

    float calculateTotal() {
        return s1 + s2 + s3 + s4;
    }

    float calculateAverage() {
        return calculateTotal() / 4;
    }

    void display() {
        System.out.println("Student ID: " + ID);
        System.out.println("Semester: " + sem_no);
        System.out.println("Subject 1 Marks: " + s1);
        System.out.println("Subject 2 Marks: " + s2);
        System.out.println("Subject 3 Marks: " + s3);
        System.out.println("Subject 4 Marks: " + s4);
        System.out.println("Total Marks: " + calculateTotal());
        System.out.println("Average Marks: " + calculateAverage());
        System.out.println("--------------------------");
    }
}

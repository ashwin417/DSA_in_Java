//Create a class named 'Member' having the following members:
//Data members
//1 - Name
//2 - Age
//3 - Phone number
//4 - Address
//5 - Salary
//It also has a method named 'print Salary' which prints the salary of the members.
//Two classes 'Employee' and 'Manager' inherits the 'Member' class. The 'Employee' and
//'Manager' classes have data members 'specialization' and 'department' respectively.
//Now, assign the name, age, phone number, address and salary to an employee and a
//manager by making an object of both classes and print the same".

package Ultimate_Java_Masterclass.Problem2;

class Member{
    String name;
    int age;
    int phone_number;
    String address;
    float salary;

    void printsalary()
    {
        System.out.println("Salary = " + salary);
    }
}

class Employee extends Member{
    String specialization;

    void printempd(){
        System.out.println("Name = " + name);
        System.out.println("Age = " + age);
        System.out.println("Phone_number = " + phone_number);
        System.out.println("Address = " + address);
        System.out.println("Specialization = " + specialization);
        printsalary();
    }
}

class Manager extends Member{
    String department;

    void printmand(){
        System.out.println("Name = " + name);
        System.out.println("Age = " + age);
        System.out.println("Phone_number = " + phone_number);
        System.out.println("Address = " + address);
        System.out.println("Department = " + department);
        printsalary();
    }
}

public class Question6 {
    public static void main(String[] args) {
        System.out.println("Employee Details:");
        Employee e1 = new Employee();
        e1.name = "Ash";
        e1.age = 18;
        e1.phone_number = 1234222222;
        e1.address = "San Francisco";
        e1.salary = 50000;
        e1.specialization = "Engineering";
        e1.printempd();

        System.out.println();
        System.out.println("Manager Details:");
        Manager e2 = new Manager();
        e2.name = "Ping";
        e2.age = 28;
        e2.phone_number = 1234225522;
        e2.address = "Washington";
        e2.salary = 80000;
        e2.department = "Management";
        e2.printmand();
    }
}

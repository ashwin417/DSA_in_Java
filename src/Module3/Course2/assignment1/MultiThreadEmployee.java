package Module3.Course2.assignment1;

import java.util.Scanner;

class Employee {
    private String name;
    private int ID;
    private String department;
    public Employee(String name, int ID, String department) {
        this.name = name;
        this.ID = ID;
        this.department = department;
    }

    public void displayd(){
        System.out.println("Name: " + name);
        System.out.println("ID: " + ID);
        System.out.println("Department: " + department);
    }
}

class EmployeeThread implements Runnable{
    private Employee employee;
    public EmployeeThread(Employee employee){
        this.employee = employee;
    }
    public void run(){
        System.out.println("Processing Employee Thread" + Thread.currentThread().getName());
        employee.displayd();
        System.out.println("Processed Employee Thread" + Thread.currentThread().getName());
    }
}

public class MultiThreadEmployee{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of employees: ");
        int n = sc.nextInt();
        sc.nextLine();
        for(int i=0; i<n; i++){
            System.out.println("Enter details of Employee "+(i+1)+": ");
            System.out.println("Enter employee name: ");
            String name = sc.nextLine();

            System.out.println("Enter employee ID: ");
            int ID = sc.nextInt();
            sc.nextLine();

            System.out.println("Enter employee department: ");
            String department = sc.nextLine();

            Employee employee = new Employee(name, ID, department);
            Thread thread = new Thread(new EmployeeThread(employee));
            thread.start();

            try {
                thread.join();
            }
            catch (InterruptedException e){
                e.printStackTrace();
            }

        }
        sc.close();
    }
}
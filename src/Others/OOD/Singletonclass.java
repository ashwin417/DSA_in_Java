package Others.OOD;

//Singleton class -----

        import java.util.*;
        import java.util.stream.*;

public class Singletonclass {
    public static void main(String[] args) {
        Employee emp1 = Employee.getInstance(); // returning the object reference to emp1 variable
        Employee emp2 = Employee.getInstance();
        Employee emp3 = Employee.getInstance();
        System.out.println(emp1.hashCode());
        System.out.println(emp2.hashCode());
        System.out.println(emp3.hashCode());
        if(emp1 == emp2  && emp2 == emp3){
            System.out.println("Same memeory address");
        }
        else{
            System.out.println("Not Same memeory address");
        }
    }
}

class Employee
{
    //Step 1:
    private static Employee instance = null;   // object variable
    public String str;
    //Step2: make a constructor as private
    private Employee()
    {
        str = "This is my first program of singleton class";
    }
    //Step3: design one static method which will return the object of singleton class
    public static synchronized Employee getInstance()
    {
        if(instance == null)
        {
            instance = new Employee();  //Step4: Here we are creating the instance of the Main class
        }
        return instance;
    }
}
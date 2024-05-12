//Single inheritance is the simplest type of inheritance in java. In this, a class inherits the properties from a single class.

 class parent {
    int salary;
    String name;

    parent() {
        salary = 30000;
        name = "rahul";
    }
}

class child extends parent {
    int age;

    child() {
        super(); // calling the parent class constructor
        age = 10;
    }
}

public class single {
    public static void main(String[] args) {
        child obj = new child();

      
       
        System.out.println("Child's age: " + obj.age);
        // We can also access salary and name from the parent class
        System.out.println("Parent's salary: " + obj.salary);
        System.out.println("Parent's name: " + obj.name);
    }
}

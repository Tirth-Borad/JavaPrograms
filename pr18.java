class Person {
    String Name;
    int age;

    Person(String Name, int age) {
        this.Name = Name;
        this.age = age;
    }

    void displayPerson() {
        System.out.println("Name = " + Name);
        System.out.println("Age = " + age);
    }
}

class Employee extends Person {
    int EID, Salary;

    Employee(int EID, String Name, int age, int Salary) {
        super(Name, age);
        this.EID = EID;
        this.Salary = Salary;
    }

    void displayEmployee() {
        System.out.println("Employee ID = " + EID);
        System.out.println("Salary = " + Salary);
    }
}

public class pr18 {
    public static void main(String[] args) {
        Employee Yash = new Employee(100, "Yash Wadhvani", 19, 50000);
        Yash.displayPerson();
        Yash.displayEmployee();
    }
}
public class Employee extends Person{

    int salary;
    String office;


    public Employee(String name, String address, int phoneNumber, String email, int salary, String office) {

        super(name, address, phoneNumber, email);
        this.salary = salary;
        this.office = office;

    }

    public String toString() {
        return super.toString() + "\nSalary: " + salary + "\nOffice: " + office;
    }
}

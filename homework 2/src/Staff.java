public class Staff extends Employee{

    String title;

    public Staff(String name, String address, int phoneNumber, String email, String title, int salary, String office) {

        super(name, address, phoneNumber, email, salary, office);
        this.title = title;
    }

    public String toString() {
        return super.toString() + "\nTitle: " + title + "\n";
    }
}

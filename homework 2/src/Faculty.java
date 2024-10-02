public class Faculty extends Employee{

    String officeHours;
    String rank;

    public Faculty(String name, String address, int phoneNumber, String email, String officeHours, String rank, int salary, String office) {

        super(name, address, phoneNumber, email, salary, office);
        this.officeHours = officeHours;
        this.rank = rank;

    }

    public String toString() {
        return super.toString() + "\nOffice Hours: " + officeHours + "\nRank: " + rank;
    }
}

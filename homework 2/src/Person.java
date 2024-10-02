public class Person {

    String name;
    String address;
    int phoneNumber;
    String email;

    public Person(String name, String address, int phoneNumber, String email) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String toString() {
        return "Name: " + name + "\n " + "Address: " +address + "\n " +  "Phone number:" + phoneNumber + "\n " + "Email:" + email;
    }

}

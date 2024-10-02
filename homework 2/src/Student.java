public class Student extends Person{

    final String FRESHMAN = "Freshman";
    final String SOPHOMORE = "Sophomore";
    final String JUNIOR = "Junior";
    final String SENIOR = "Senior";

    public Student(String name, String address, int phoneNumber, String email, String year) {
        super(name, address, phoneNumber, email);

        switch (year) {
            case "Junior":
                year = JUNIOR;
                break;
            case "Senior":
                year = SENIOR;
                break;
            case "Freshman":
                year = FRESHMAN;
                break;
            case "Sophomore":
                year = SOPHOMORE;
                break;

        }


    }

    public String toString(){
        return super.toString();
    }


}

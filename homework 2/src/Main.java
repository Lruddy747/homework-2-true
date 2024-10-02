public class Main {
    public static void main(String[] args) {

        Student aria = new Student("aria", "123 qwerty", 4547, "aria@email", "Freshman");
        Staff jim = new Staff("jim", "856dgfg", 7852, "@gmaill","baller", 100, "poop inc");
        Employee herb = new Faculty("herb", "845 serb", 7318, "you@gmail", "5 0 clock", "officer",500, "stoop media");


        System.out.println(jim.toString());
        System.out.println(herb.toString());



    }
}
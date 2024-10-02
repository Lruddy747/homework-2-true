public class Account {

    private int id = 0;
    private double balance = 0;
    private double annualInterestRate = 0;

    public Account(double annualInterestRate, double balance, int id) {
        this.annualInterestRate = annualInterestRate;
        this.balance = balance;
        this.id = id;
    }


    public double getMonthlyInterestRate(){

        double monthlyInterestR = annualInterestRate / 12;

        return monthlyInterestR;

    }

    public double getMonthlyInterest(){

        double monthlyInterest = getMonthlyInterestRate() * balance;

        return monthlyInterest;

    }

    public double withdraw(double amount){

        balance = balance - amount;

        return balance;

    }

    public double deposit(double amount){

        balance = balance + amount;

        return balance;

    }

    public void checkBalance(){

        System.out.println("Check balance is: $" + balance);

    }

}
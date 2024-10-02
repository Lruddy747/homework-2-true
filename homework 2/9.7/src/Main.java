public class Main {
    public static void main(String[] args) {

        Account account1 = new Account(.045, 20000.0, 1122);

        account1.withdraw(2500);

        account1.deposit(3000);

        account1.checkBalance();

        System.out.println("The monthly interest is $" + account1.getMonthlyInterest());


    }
}
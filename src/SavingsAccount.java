public class SavingsAccount extends Account {

    private double interest;

    public SavingsAccount(int id, double sB, double i) {
        super(id, sB);
        interest = i;
    }

    public void withdraw(double x) {
        if(x < currentBalance()) {
            decreaseBalance(x);
        }
        else {
            System.out.println("[ERROR: INSUFFICIENT FUNDS]");
        }
    }

    public double monthlyInterest() {
        return(currentBalance()*interest)/12;
    }
}

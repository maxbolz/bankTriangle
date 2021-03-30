public class SpecialCheckingAccount extends CheckingAccount {

    private double minBalance;
    private double interest;

    public SpecialCheckingAccount(int id, double sB, double cC, double i, double mB) {
        super(id, sB, cC);
        interest = i;
        minBalance = mB;
    }

    public void clearCheck(double amount) {
        if(currentBalance() > minBalance) {
            decreaseBalance(amount);
        }
        else {
            super.clearCheck(amount);
        }
    }

    public double monthlyInterest() {
        if (currentBalance() > minBalance) {
            return(currentBalance()*interest)/12;
        }
        else {
            return super.monthlyInterest();
        }
    }
}

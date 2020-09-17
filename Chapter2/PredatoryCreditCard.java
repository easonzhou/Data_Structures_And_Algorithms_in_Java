package Chapter2;

public class PredatoryCreditCard extends CreditCard {
    // Additional instance variable
    private double apr; // annual percentage rate
    private long count = 0;
    public static final int CHARGE_LIMIT = 10;


    // Constructor for this class
    public PredatoryCreditCard(String cust, String bk, String acnt, int lim, double initialBal, double rate) {
        super(cust, bk, acnt, lim, initialBal); // initialize superclass attributes
        apr = rate;
    }

    // A new method for assessing monthly interest charges
    public void processMonth() {
        System.out.println("balance " + balance);
        if (count > 10) {
            balance += count - 10;
            count = 0;
        }
        System.out.println("balance " + balance);

        if (balance > 0) { // only charge interest on a positive balance
            double monthlyFactor = Math.pow(1 + apr, 1.0 / 12); // compute monthly rate
            balance *= monthlyFactor;
        }
    }

    public boolean charge(double price) {
        boolean isSuccess = super.charge(price);
        if (!isSuccess)
            balance += 5;

        count++;
        return isSuccess;
    }

    public static void main(String[] args) {
        PredatoryCreditCard card = new PredatoryCreditCard("Yinsheng", "DBS", "12345678", 100, 100, 0.1);
        card.charge(10);
        card.charge(10);
        card.charge(10);
        card.charge(10);
        card.charge(10);
        card.charge(10);
        card.charge(10);
        card.charge(10);
        card.charge(10);
        card.charge(10);
        card.charge(10);
        card.charge(10);
        card.processMonth();
        System.out.println(card.balance);
    }
}

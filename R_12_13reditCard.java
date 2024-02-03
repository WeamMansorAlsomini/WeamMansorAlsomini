public class R_12_13reditCard {
    private String customer;
    private String bank;
    private String account;
    private int limit;
    protected double balance;

    public void R_11CreditCard(String customer, String bank, String account, int limit, double balance) {
        this.customer = customer;
        this.bank = bank;
        this.account = account;
        this.limit = limit;
        this.balance = balance;
    }

    public String getCustomer() {
        return customer;
    }

    public String getBank() {
        return bank;
    }

    public String getAccount() {
        return account;
    }

    public int getLimit() {
        return limit;
    }

    public double getBalance() {
        return balance;
    }

    public boolean charge(double price) {
        if (price + balance > limit) {
            return false;
        }
        balance += price;
        return true;
    }

    public void makePayment(double amount) {
        if (amount < 0) {
            return; // Ignore negative payment amount
        }
        balance -= amount;
    }

//R_13
    public static void main(String[] args) {
        R_11CreditCard creditCard = new R_11CreditCard("John Doe", "Bank ABC", "123456789", 5000);

        System.out.println("Current Balance: " + creditCard.getBalance());

        creditCard.makePayment(1000);
        System.out.println("Updated Balance: " + creditCard.getBalance());

        creditCard.makePayment(-500); // Negative payment amount, ignored
        System.out.println("Balance after Ignored Payment: " + creditCard.getBalance());

    }
}

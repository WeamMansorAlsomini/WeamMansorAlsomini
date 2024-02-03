public class R_11CreditCard {
    private String customer;
    private String bank;
    private String account;
    private int limit;
    protected double balance;

    public R_11CreditCard(String customer, String bank, String account, int limit) {
        this.customer = customer;
        this.bank = bank;
        this.account = account;
        this.limit = limit;
        this.balance = balance;
    }

    public void setLimit(int limit) {
        this.limit = limit;
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
        balance -= amount;
    }
//---------------------------------

    public static void main(String[] args) {
        R_11CreditCard creditCard = new R_11CreditCard("John Doe", "Bank ABC", "123456789", 5000);

        System.out.println("Current Credit Limit: " + creditCard.getLimit());

        creditCard.setLimit(7000);
        System.out.println("Updated Credit Limit: " + creditCard.getLimit());

    }
}

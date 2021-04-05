package Class.BankAccount_2;

public class Customer {
    private String name;
    private Account account;

    public Customer(String name, Account account) {
        this.name = name;
        this.account = account;
    }

    public void deposit(double amount, String currency) {
        this.account.deposit(amount, currency);
    }

    public void withdraw(double amount) {
        this.account.withdraw(amount);
    }

    public void report() {
        System.out.println("Customer " + this.name + " ");
        this.account.report();
    }

    public String getName() {
        return name;
    }

    public Account getAccount() {
        return account;
    }
}

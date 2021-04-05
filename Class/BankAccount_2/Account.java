package Class.BankAccount_2;

public class Account {
    private int number;
    private double balance;
    private double exchangeRate;
    private String currency;

    // Constructor
    public Account(int number, double balance,double exchangeRate, String currency) {
        this.number = number;
        this.exchangeRate = exchangeRate;
        if (balance > 0)
            this.balance = balance;
        else
            this.balance = 0;
        checkSetCurrency(currency);
    }

    public Account(int number, double balance, String currency) {
        this(number,balance,8.17,currency);
    }

    public Account(int number, double balance) {
        this(number,balance,8.17,"TL");
    }

    public Account(int number) {
        this(number,0.0,8.17,"TL");
    }

    public void setCurrency(String currency) {
        if (this.currency.equals("TL") && currency.equals("USD"))
            balance *= exchangeRate;
        else if (this.currency.equals("USD") && currency.equals("TL"))
            balance /= exchangeRate;
        if (currency.equals("TL") || currency.equals("USD"))
            this.currency = currency;
    }

    private void checkSetCurrency(String currency) {
        if (currency.equals("USD"))
            this.currency = currency;
        else if (currency.equals("TL"))
            this.currency = currency;
        else{
            this.currency = null;
            System.out.println("This currency is not valid in our bank.");
        }
    }

    public void deposit(double amount, String currency) {
       if (amount > 0) {
           if (this.currency.compareTo(currency) == 0)
               balance += amount;
           else if (this.currency.equals("USD") && currency.equals("TL"))
               balance += (amount/exchangeRate);
           else if (this.currency.equals("TL") && currency.equals("USD"))
               balance += (amount*exchangeRate);
           System.out.println(amount + " " + currency + " have been deposited.");
           System.out.println("The balance is " + balance + " " + this.currency);
       } else
           System.out.println("The amount should be positive.");
    }

    public void withdraw(double amount) {
        if (amount > 0) {
            if (balance < amount)
                System.out.println("Account does not have " + amount + " " + currency);
            else {
                balance -= amount;
                System.out.println(amount + " " + currency + " have been withdrawn.");
                System.out.println("The balance is " + balance + " " + currency);
            }
        } else {
            System.out.println("The amount should be positive.");
        }
    }

    public void report() {
        System.out.println("Account_" + number + ":\n" +
                "Balance: " + balance + " " + currency);
    }

    public String toString() {
        return "Account_" + number + ": " + balance + " " + currency;
    }
}

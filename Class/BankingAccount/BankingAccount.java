package Class.BankingAccount;

public class BankingAccount {
    private String id;
    private double balance;
    private double fee;

    public BankingAccount(String id, double balance) {
        this.id = id;
        this.balance = balance;
        this.fee = 5.0;
    }

    public void transfer(BankingAccount account, double transfer) {
        if (transfer >= 5)
            this.balance -= 5;
        if (this.balance > transfer) {
            account.balance += transfer;
            this.balance -= transfer;
            System.out.printf("%s:\nTransfer: -%.2f\nNew Balance: %.2f\nFee: %.2f\n", id, transfer, balance, fee);
            System.out.println("======================");
            System.out.printf("%s:\nTransfer: +%.2f\nNew Balance: %.2f\n", account.id, transfer, account.balance);
            System.out.println("======================");
        } else if (this.balance == 0) {
            System.out.println("I am sorry. You don't have enough money.");
        } else if (this.balance < transfer) {
            account.balance += this.balance;
            this.balance = 0;
            System.out.printf("%s:\nTransfer: -%.2f\nNew Balance: %.2f\nFee: %.2f\n", id, transfer, balance, fee);
            System.out.println("======================");
            System.out.printf("%s:\nTransfer: +%.2f\nNew Balance: %.2f\n", account.id, transfer, account.balance);
            System.out.println("======================");
        }
    }

    public void deposit(double money) {
        balance += money;
        System.out.printf("%s:\nDeposit: +%.2f\nNew Balance: %.2f\n", id, money, balance);
        System.out.println("=======================");
    }

    public void withdraw(double money) {
        if (money > balance) {
            System.out.println("I am sorry. You don't have enough money.");
            System.out.println("=======================");
        } else if (money <= balance) {
            balance -= money;
            System.out.printf("%s:\nWithdraw: -%.2f\nNew Balance: %.2f\n", id, money, balance);
            System.out.println("=======================");
        }
        if (balance < 100) {
            System.out.println("Your balance is less than the 100$");
            System.out.println("=======================");
        }

    }
}

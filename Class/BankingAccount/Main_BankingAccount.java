package Class.BankingAccount;

public class Main_BankingAccount {

    public static void main(String[] args) {
        BankingAccount bankingAccount1 = new BankingAccount("Arda Erdoğan", 10_000);

        bankingAccount1.deposit(1_000);
        bankingAccount1.withdraw(500);
        bankingAccount1.withdraw(10450);

        BankingAccount bankingAccount2 = new BankingAccount("Bill Gates", 100_000);

        bankingAccount2.deposit(30_000);
        bankingAccount2.withdraw(10_000);
        bankingAccount2.transfer(bankingAccount1,50_000);
    }
}

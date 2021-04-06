package Class.BankAccount_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Bank bank = new Bank("Trust Bank");
        int accountNo = 0;

        System.out.println("Welcome to " + bank.getName());
        while (true) {
            System.out.print("Enter customer name (empty to quit): ");
            String customerName = input.nextLine();
            if (customerName.equals(""))
                break;

            System.out.print("Enter currency: ");
            String currency = input.nextLine();

            System.out.print("Enter initial balance: ");
            double balance = Double.parseDouble(input.nextLine());

            bank.addCustomer(new Customer(customerName, new Account(accountNo,balance,currency)));
            bank.display();
            accountNo++;
        }
        System.out.println("Bye!");

        System.out.println("Do you want to do another transaction?");
        System.out.println("[Deposit, Withdraw, Transfer]");
        String transactionType = input.nextLine();

        if (transactionType.toLowerCase().equals("deposit"))
            deposit(input,bank);
        else if (transactionType.toLowerCase().equals("withdraw"))
            withdraw(input,bank);
    }

    public static void withdraw(Scanner input, Bank bank) {
        while (true) {
            System.out.print("Enter the account_no: ");
            int accountNo = input.nextInt();
            input.nextLine();

            System.out.print("Enter the amount you want to withdraw: ");
            double amount = Double.parseDouble(input.nextLine());

            bank.getCustomers().get(accountNo).withdraw(amount);

            System.out.print("Do you want to make another withdraw (Empty to quit): ");
            String withdraw = input.nextLine();
            if (withdraw.equals(""))
                break;
        }
        System.out.println("Bye!");
    }

    public static void deposit(Scanner input, Bank bank) {
        System.out.print("Would you like to deposit money into any account(Y/N): ");
        String deposit = input.nextLine();

        while (deposit.toLowerCase().equals("yes")) {
            System.out.print("Enter the account_no: ");
            int accountNo = input.nextInt();
            input.nextLine();

            System.out.print("Enter the amount you want to deposit: ");
            double amount = Double.parseDouble(input.nextLine());
            System.out.print("Enter currency: ");
            String currency = input.nextLine();

            bank.getCustomers().get(accountNo).deposit(amount,currency);

            System.out.print("Do you want to make another deposit(Y/N) (Empty to quit): ");
            deposit = input.nextLine();
            if (deposit.equals("") || deposit.toLowerCase().equals("no"))
                break;
        }
        System.out.println("Bye!");
    }
}

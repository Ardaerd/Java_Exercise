package Class.BankAccount_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Bank bank = new Bank("Trust Bank");
        int accountNo = 1;

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
    }
}

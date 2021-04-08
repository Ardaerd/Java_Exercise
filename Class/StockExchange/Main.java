package Class.StockExchange;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // This program tracks the user's purchase of two stocks,
        // Computing and reporting which stock was profitable.

        Scanner console = new Scanner(System.in);

        // First Stock
        System.out.print("First stock's symbol: ");
        String symbol1 = console.nextLine();

        Stock stock1 = new Stock(symbol1);
        double profit1 = makePurchases(stock1, console);

        // Second Stock
        System.out.print("Second stock's symbol: ");
        String symbol2 = console.nextLine();
        Stock stock2 = new Stock(symbol2);
        double profit2 = makePurchases(stock2,console);

        // Report which stock made more money
        if (profit1 > profit2)
            System.out.println(symbol1 + " more profitable than " + symbol2 + ".");
        else if (profit2 > profit1)
            System.out.println(symbol2 + " more profitable than " + symbol1 + ".");
        else  // Profit1 == Profit2
            System.out.println(symbol1 + " and " + symbol2 + " are equally profitable.");

    }

    // Make purchases of stock and return the profit
    public static double makePurchases(Stock currentStock, Scanner console) {
        System.out.print("How many purchases did you make: ");
        int numPurchases = console.nextInt();
        console.nextLine();

        // ask about each purchases
        for (int i = 1; i <= numPurchases; i++) {
            System.out.println(i + ": How many shares, at what price per share: ");
            System.out.print("Number of shares: ");
            int numShares = console.nextInt();
            console.nextLine();
            System.out.print("Price per share: ");
            double pricePerShare = console.nextDouble();
            console.nextLine();

            // ask the stock object to record this purchase
            currentStock.purchase(numShares,pricePerShare);
        }

        // Use the Stock object to compute profit
        System.out.println("What is today's price per share: ");
        double currentPrice = console.nextDouble();
        console.nextLine();

        double profit = currentStock.getProfit(currentPrice);
        System.out.printf("Net profit/loss: $%.2f\n", profit);
        System.out.printf("Profit margin is %.2f%%\n",
                (currentStock.getProfit(currentPrice)/currentStock.getTotalCost())*100);
        System.out.println("--------------------------");
        return profit;
    }
}

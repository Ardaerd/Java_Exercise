package Inheritance_and_Interface.StockExchange;

// A stock object represent purchases of shares of a stock.
public class Stock {
    private String symbol;
    private int totalShares;
    private double totalCost;

    public Stock(String symbol, int totalShares, double totalCost) {
        this.symbol = symbol;
        this.totalShares = totalShares;
        this.totalCost = totalCost;
    }

    // initializes a new stock with no shares purchased
    public Stock(String symbol) {
        this(symbol,0,0.0);
    }

    // Returns the total profit or loss earned on this stock
    public double profit(double currentPrice) {
        double marketValue = totalShares * currentPrice;
        return marketValue - totalCost;
    }

    public void purchase(int shares, double pricePerShares) {
        totalShares += shares;
        totalCost += shares * pricePerShares;
    }
}

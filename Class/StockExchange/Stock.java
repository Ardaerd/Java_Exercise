package Class.StockExchange;

public class Stock {
    private String symbol;
    private int totalShares;
    private double totalCost;

    public Stock(String symbol, int totalShares, double totalCost) {
        if (symbol == null)
            throw new NullPointerException();
        this.symbol = symbol;
        this.totalShares = totalShares;
        this.totalCost = totalCost;
    }

    // Initializes a new stock with no shares purchased
    public Stock(String symbol) {
        this(symbol,0,0.0);
    }

    public double getProfit(double currentPrice) {
        return (currentPrice - totalCost) * totalShares;
    }

    // Record a purchase of the given number of shares of this stock
    // at the given price per share
    public void purchase(int shares, double pricePerShare) {
        totalShares += shares;
        totalCost += pricePerShare * shares;
    }
}

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

    // Returns the total profit or loss earned on this stock,
    // based on the given price per share
    public double getProfit(double currentPrice) {
        if (currentPrice < 0.0)
            throw new IllegalArgumentException();

        double marketValue = currentPrice * totalShares;
        return marketValue - totalCost;
    }

    // Record a purchase of the given number of shares of this stock
    // at the given price per share
    public void purchase(int shares, double pricePerShare) {
        if (shares < 0 || pricePerShare < 0)
            throw new IllegalArgumentException();

        totalShares += shares;
        totalCost += pricePerShare * shares;
    }
}

package Inheritance_and_Interface.StockExchange;

public class DividendStock extends Stock{
    private double dividends; // amount of dividends paid

    // constructs a new dividend stock with the given symbol
    // and no shares purchased
    public DividendStock(String symbol) {
        super(symbol); // call stock constructor
        dividends = 0.0;
    }
    // records a dividend of the given amount per share
    public void payDividend(double amountPerShare) {
        dividends += amountPerShare * getTotalShares();
    }

    // returns the total profit or loss earned on this stock,
    // including profits made from dividends
    public double getProfit(double currentPrice) {
        return super.getProfit(currentPrice) + dividends;
    }
}

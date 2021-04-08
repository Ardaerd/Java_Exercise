package Class.StockExchange;

public class Stock {
    private String symbol;
    private int totalShares;
    private double totalCost;

    public double getProfit(double currentPrice) {
        return (currentPrice - totalCost) * totalShares;
    }

    public void purchase(int shares, pricePerShare) {
        
    }
}

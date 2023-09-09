package Chapter9.Exercises;
//9.2 (The Stock class) Following the example of the Circle class in Section 9.2,
//design a class named Stock that contains:
//■ A string data field named symbol for the stock’s symbol.
//■ A string data field named name for the stock’s name.
//■ A double data field named previousClosingPrice that stores the stock
//price for the previous day.
//■ A double data field named currentPrice that stores the stock price for the
//current time.
//■ A constructor that creates a stock with the specified symbol and name.
//■ A method named getChangePercent() that returns the percentage changed
//from previousClosingPrice to currentPrice.
// Draw the UML diagram for the class then implement the class. Write a test program
// that creates a Stock object with the stock symbol ORCL, the name Oracle
//Corporation, and the previous closing price of 34.5. Set a new current price to
//34.35 and display the price-change percentage.
public class Stock {
    String symbol;
    String name;
    double previousClosingPrice;
    double currentPrice;
    public Stock(String symbol, String name) {
        this.symbol = symbol;
        this.name = name;
    }
    public double getChangePercent(){
        return (currentPrice - previousClosingPrice) / (previousClosingPrice);
    }
    public double getPreviousClosingPrice() {
        return previousClosingPrice;
    }
    public double getCurrentPrice() {
        return currentPrice;
    }
    public void setPreviousClosingPrice(double previousClosingPrice) {
        this.previousClosingPrice = previousClosingPrice;
    }
    public void setCurrentPrice(double currentPrice) {
        this.currentPrice = currentPrice;
    }

    public static void main(String[] args) {
        Stock stock = new Stock("ORCL", "Oracle Corporation");
        System.out.println("Stock: " + stock.symbol + "  " + stock.name);
        stock.setPreviousClosingPrice(34.5);
        stock.setCurrentPrice(34.35);
        System.out.println("Previous price: " + stock.getPreviousClosingPrice());
        System.out.println("Current Price: " + stock.getCurrentPrice());
        System.out.println("Price change: " + stock.getChangePercent() + " %");
    }
}
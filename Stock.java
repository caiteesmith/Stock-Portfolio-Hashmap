/* DESCRIPTION OF CLASS
- Stock() is the constructor.
- getSymbol() returns the stock symbol as a String
- getPrice() returns the stock price as a double
- setPrice() returns void, passed a double representing stock price
- toString() returns a string representation of the stock
*/

public class Stock {
    String symbol;
    double price;

    public Stock(String symbol) {
        this.symbol = symbol;
        this.price = 0;
    }

    public String getSymbol() {
        return symbol;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Symbol\t Price" + "\n" +
                symbol + "\t\t $" + price;
    }
}
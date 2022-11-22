
/**
 * Stock.java: Creates a "Stock" with its company name, its stock symbol and price.
 *
 * @author Adolfo Sanpedro Gante
 * @version Module 12, Lab
 */
public class Stock
{
    //Instance Variables
    String name = " ";
    String symbol = " ";
    double price = 0.0;

    //constructors

    /**
     * <p>
     * Three arg constructor, company name, company symbol, and company stock price.
     * </p>
     * 
     * @param name a company's name (e.g., Apple).
     * @param symbol a company's stock symbol (e.g., AAPL).
     * @param price a company's stock price.
     */
    public Stock (String name, String symbol, double price) {
        this.name = name;
        this.symbol = symbol;
        this.price = price;
    }

    //setters

    /**
     * <p>
     * Mutates a company's name.
     * </p>
     * 
     * @param name name a company's name (e.g., Apple).
     */
    public void setName (String name) {
        this.name = name;   
    }

    /**
     * <p>
     * Mutates a company's stock symbol.
     * </p>
     * 
     * @param symbol a company's stock symbol (e.g., AAPL).
     */
    public void setSymbol (String symbol) {
        this.symbol = symbol;   
    }

    /**
     * <p>
     * Mutates a companys stock price.
     * </p>
     * 
     * @param price a company's stock price.
     */
    public void setPrice (double price) {
        this.price = price;   
    }

    //getters
    
    /**
     * <p>
     * Accesses a company's name.
     * </p>
     * 
     * @return a company's name.
     */
    public String getName() {
        return (name);   
    }
    
    /**
     * <p>
     * Accesses a companys stock symbol.
     * </p>
     * 
     * @return a company's stock symbol.
     */
    public String getSymbol() {
        return (symbol);
    }
    
    /**
     * <p>
     * Accesses a companys stock price.
     * </p>
     * 
     * @return a company's stock price.
     */
    public double getPrice() {
        return (price);   
    }

    /**
     * <p>
     * Prints a Company's name, stock symbol and stock price.
     * </p>
     * 
     * @return name, stock symbol and stock price.
     */
    public String toString() {
        return ("Company Name: " + name + ", Symbol: " + symbol + ", Stock Price: $" + price);   
    }
    
    /**
     * <p>
     * Compares a Stock's name, symbol and price.
     * </p>
     * 
     * @return either true or false.
     */
    public boolean equals(Object anObject){
        if (anObject == null) {
            return false;   
        }
        if (getClass() != anObject.getClass()) {
            return false;
        }
        Stock anotherStock = (Stock) anObject;
        return (name.equals(anotherStock.getName()) && symbol.equals(anotherStock.getSymbol()) && price == anotherStock.getPrice());
    }
}

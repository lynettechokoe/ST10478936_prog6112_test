package consoledevicesales;

/**
 *
 * @author YourName
 */
public abstract class Consoles implements IConsoles {
    
    // Variables to store the console device type, store name, and total amount of sales
    protected String consoleType;
    protected String storeName;
    protected int totalSales;
    
    // Constructor that accepts console type, store name, and total sales as parameters
    public Consoles(String consoleType, String storeName, int totalSales) {
        this.consoleType = consoleType;
        this.storeName = storeName;
        this.totalSales = totalSales;
    }
    
    // Method to get the console type
    @Override
    public String getConsoleType() {
        return consoleType;
    }
    
    // Method to get the store name
    @Override
    public String getStore() {
        return storeName;
    }
    
    // Method to get the total sales
    @Override
    public int getTotalSales() {
        return totalSales;
    }
}
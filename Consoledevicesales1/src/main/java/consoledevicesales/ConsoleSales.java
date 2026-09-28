package consoledevicesales;

/**
 *
 * @author YourName
 */
public class ConsoleSales extends Consoles {
    
    // Constructor that accepts console type, store name, and total sales as parameters
    public ConsoleSales(String consoleType, String storeName, int totalSales) {
        super(consoleType, storeName, totalSales);
    }
    
    // Method to print the report
    public void printReport() {
        System.out.println("========================================");
        System.out.println("     CONSOLE DEVICE SALES REPORT        ");
        System.out.println("========================================");
        System.out.println("Console Type : " + getConsoleType());
        System.out.println("Store Name   : " + getStore());
        System.out.println("Total Sales  : R" + getTotalSales());
        System.out.println("========================================");
    }
}
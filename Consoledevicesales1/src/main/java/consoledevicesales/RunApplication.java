package consoledevicesales;

import java.util.Scanner;

/**
 *
 * @author YourName
 */
public class RunApplication {
    
    public static void main(String[] args) {
        // Create Scanner for user input
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("========================================");
        System.out.println("   CONSOLE DEVICE SALES APPLICATION     ");
        System.out.println("========================================");
        System.out.println();
        
        // ===== Step 1: Ask user to select console device type =====
        System.out.println("Please select a console device type:");
        System.out.println("1. PlayStation 5");
        System.out.println("2. Xbox Series X");
        System.out.println("3. Nintendo Switch");
        System.out.println("4. PlayStation 4");
        System.out.println("5. Xbox One");
        System.out.print("\nEnter your choice (1-5): ");
        
        String choice = scanner.nextLine();
        String consoleType = getConsoleType(choice);
        
        // ===== Step 2: Ask for store name =====
        System.out.print("\nEnter the store name: ");
        String storeName = scanner.nextLine();
        
        // ===== Step 3: Ask for total sales =====
        System.out.print("Enter the total amount of sales (R): ");
        int totalSales = 0;
        boolean validInput = false;
        
        while (!validInput) {
            try {
                totalSales = Integer.parseInt(scanner.nextLine());
                validInput = true;
            } catch (NumberFormatException e) {
                System.out.print("Invalid input. Please enter a number: ");
            }
        }
        
        // ===== Step 4: Create ConsoleSales object and print report =====
        System.out.println();
        ConsoleSales sales = new ConsoleSales(consoleType, storeName, totalSales);
        sales.printReport();
        
        // Close scanner
        scanner.close();
        
        System.out.println("\nPress Enter to exit...");
        scanner.nextLine();
    }
    
    // Helper method to convert choice number to console type name
    public static String getConsoleType(String choice) {
        return switch (choice) {
            case "1" -> "PlayStation 5";
            case "2" -> "Xbox Series X";
            case "3" -> "Nintendo Switch";
            case "4" -> "PlayStation 4";
            case "5" -> "Xbox One";
            default -> "Unknown Console";
        };
    }
}
package gamingconsolereport;

/**
 *
 * @author YourName
 */
public class GamingConsoleReport {
    
    public static void main(String[] args) {
        
        // ============================================
        // STEP 1: DECLARE AND POPULATE SINGLE ARRAYS
        // ============================================
        
        // 1D Array for city names
        String[] cities = {"CAPE TOWN", "PORT ELIZABETH", "PRETORIA"};
        
        // 1D Array for console types
        String[] consoles = {"PS5", "XBOX", "SWITCH"};
        
        // ============================================
        // STEP 2: DECLARE AND POPULATE 2D ARRAY
        // ============================================
        
        // 2D Array for sales data (3 cities x 3 consoles)
        // Row 0 = Cape Town, Row 1 = Port Elizabeth, Row 2 = Pretoria
        // Col 0 = PS5, Col 1 = XBOX, Col 2 = SWITCH
        int[][] sales = {
            {1000, 2000, 3000},   // Cape Town
            {2000, 3000, 4000},   // Port Elizabeth
            {1500, 1100, 1200}    // Pretoria
        };
        
        // ============================================
        // STEP 3: CALCULATE TOTALS FOR EACH CITY
        // ============================================
        
        // 1D Array to store total sales for each city
        int[] cityTotals = new int[cities.length];
        
        for (int i = 0; i < sales.length; i++) {
            int total = 0;
            for (int j = 0; j < sales[i].length; j++) {
                total += sales[i][j];
            }
            cityTotals[i] = total;
        }
        
        // ============================================
        // STEP 4: FIND THE CITY WITH MOST SALES
        // ============================================
        
        int maxSales = cityTotals[0];
        int maxIndex = 0;
        
        for (int i = 1; i < cityTotals.length; i++) {
            if (cityTotals[i] > maxSales) {
                maxSales = cityTotals[i];
                maxIndex = i;
            }
        }
        
        String topCity = cities[maxIndex];
        
        // ============================================
        // STEP 5: PRINT THE REPORT
        // ============================================
        
        System.out.println("================================================================");
        System.out.println("                    GAMING CONSOLE REPORT                       ");
        System.out.println("================================================================");
        System.out.println();
        
        // Print header row
        System.out.printf("%-20s", "");
        for (String console : consoles) {
            System.out.printf("%-12s", console);
        }
        System.out.println();
        System.out.println("----------------------------------------------------------------");
        
        // Print each city and its sales
        for (int i = 0; i < cities.length; i++) {
            System.out.printf("%-20s", cities[i]);
            for (int j = 0; j < sales[i].length; j++) {
                System.out.printf("%-12d", sales[i][j]);
            }
            System.out.println();
        }
        
        System.out.println();
        System.out.println("================================================================");
        System.out.println("               CONSOLE SALES TOTALS FOR EACH CITY               ");
        System.out.println("================================================================");
        System.out.println();
        
        // Print totals for each city
        for (int i = 0; i < cities.length; i++) {
            System.out.printf("%-20s %d%n", cities[i], cityTotals[i]);
        }
        
        System.out.println();
        System.out.println("================================================================");
        System.out.printf("CITY WITH THE MOST SALES: %s%n", topCity);
        System.out.println("================================================================");
    }
}
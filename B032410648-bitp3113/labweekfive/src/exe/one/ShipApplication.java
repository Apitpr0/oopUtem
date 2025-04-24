package exe.one;

public class ShipApplication {
    /**
     * Main entry point to the application
     * 
     * @param args
     */
    public static void main (String[] args) {
        
        // Create superclass object (Ship)
        Ship superShip = new Ship("KD Lekiu", 2024);
        
        // Display superShip information
        System.out.println("Ship Information");
        System.out.println("----------------");
        superShip.display();
        System.out.println();

        // Create two CruiseShip objects
        CruiseShip ship1 = new CruiseShip("FreeSpirit Heavenly Cruise", 2022, 3000);
        CruiseShip ship2 = new CruiseShip("Super Atlantic Cruise", 2023, 4500);

        // Display CruiseShip 1 information
        System.out.println("Cruise Ship 1 Information:");
        ship1.display();
        System.out.println();

        // Display CruiseShip 2 information
        System.out.println("Cruise Ship 2 Information:");
        ship2.display();
    }
}

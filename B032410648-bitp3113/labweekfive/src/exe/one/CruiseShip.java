package exe.one;

/**
 * This class represents a cruise ship
 * Author: Muhammad Afiq Muhaimin
 */
public class CruiseShip extends Ship {
    // Define variable
    private int maxPassanger;

    /**
     * Constructor with all parameters
     * 
     * @param name          the name of the cruise ship
     * @param year          the year the cruise ship was built
     * @param maxPassanger  the maximum number of passengers
     */
    public CruiseShip(String name, int year, int maxPassanger) {
        super(name, year);
        this.maxPassanger = maxPassanger;
    }

    /**
     * @return the maxPassanger
     */
    public int getMaxPassanger() {
        return maxPassanger;
    }

    /**
     * @param maxPassanger the maxPassanger to set
     */
    public void setMaxPassanger(int maxPassanger) {
        this.maxPassanger = maxPassanger;
    }

    /**
     * This method displays the cruise ship information.
     * Some of the information is retrieved through the super class.
     */
    @Override
    public void display() {
        System.out.println("Ship name: " + super.getName());
        System.out.println("Year build: " + super.getYear());
        System.out.println("Maximum Passenger: " + this.maxPassanger + " person");
    }
}

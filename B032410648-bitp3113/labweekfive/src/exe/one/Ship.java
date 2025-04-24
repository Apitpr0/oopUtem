/**
 * 
 */
package exe.one;

/**
 * This class represents a Ship entity, 
 * it is a super class for other class in this
 * exercise
 * 
 * @author Muhammad Afiq Muhaimin
 */
public class Ship {
	//Attribute declaration
	private String name;
	private int year;
	/**
	 * @param name
	 * @param year
	 */
	public Ship(String name, int year) {
		this.name = name;
		this.year = year;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the year
	 */
	public int getYear() {
		return year;
	}
	/**
	 * @param year the year to set
	 */
	public void setYear(int year) {
		this.year = year;
	}
	
	/**
	 * This method displays the ship information
	 */
	public void display() {
		System.out.println("Ship name: " + name);
		System.out.println("Year built: " + year);
	}
	
}

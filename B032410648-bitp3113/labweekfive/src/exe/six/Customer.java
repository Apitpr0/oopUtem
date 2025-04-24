/**
 * 
 */
package exe.six;

/**
 * This class is to allow this program to hold name, address and
 * telephone number
 */
public class Customer {
	//Declare name, address as private String so that only this class can access it
	private String name;
	private String address;
	
	//Declare phoneNo as protected to allow subclass to access it
	protected  phoneNumber;
	
	//Create default constructor 
	public Customer() {
		this.name="";
		this.address="";
		this.phoneNumber=
	}
	/**
	 * Create overloaded constructor with parameters defined
	 * @param name
	 * @param address
	 * @param phoneNumber
	 */
	public Customer(String name, String address, int phoneNumber) {
		this.name = name;
		this.address = address;
		this.phoneNumber = phoneNumber;
	}
	
	
	
}

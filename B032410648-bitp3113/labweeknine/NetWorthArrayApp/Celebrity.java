package labweeknine.NetWorthArrayApp;

/**
 * BITP 3113 Object Oriented Programming
 * 
 * This class models a celebrity's networth
 * 
 * @author Emaliana Kasmuri, FTMK
 */
public class Celebrity {
	
	private String name;
	private double networth;
	private String unit;
	
	/**
	 * @param name
	 * @param networth
	 * @param unit
	 */
	public Celebrity(String name, double networth, String unit) {
		this.name = name;
		this.networth = networth;
		this.unit = unit;
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
	 * @return the networth
	 */
	public double getNetworth() {
		return networth;
	}

	/**
	 * @param networth the networth to set
	 */
	public void setNetworth(double networth) {
		this.networth = networth;
	}

	/**
	 * @return the unit
	 */
	public String getUnit() {
		return unit;
	}

	/**
	 * @param unit the unit to set
	 */
	public void setUnit(String unit) {
		this.unit = unit;
	}
	
	
	

	
}

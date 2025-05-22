package labexception.exetwo;

import java.util.List;

/**
 * BITP 3113 Object Oriented Programming
 * 
 * This class represents a department and its member.
 * 
 * @author Emaliana Kasmuri, FTMK, UTeM
 */

public class Department {
	
	private int departmentId;
	private String name;
	
	private List<String> staff;
	
	/**
	 * @param departmentId
	 */
	public Department(int departmentId) {
		this.departmentId = departmentId;
	}
	
	/**
	 * @param name
	 */
	public Department(String name) {
		
		this.name = name;
		
		DataProducer producer = new DataProducer();
		this.setStaff(producer.getData());
			
	}
	
	/**
	 * @return the departmentId
	 */
	public int getDepartmentId() {
		return departmentId;
	}
	
	/**
	 * @param departmentId the departmentId to set
	 */
	public void setDepartmentId(int departmentId) {
		this.departmentId = departmentId;
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
	 * @return the staff
	 */
	public List<String> getStaff() {
		return staff;
	}

	/**
	 * @param staff the staff to set
	 */
	public void setStaff(List<String> staff) {
		this.staff = staff;
	}
	
	
	
	

}

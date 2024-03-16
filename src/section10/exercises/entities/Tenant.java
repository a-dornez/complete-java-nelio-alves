/*
 * Pair --> HostelRegister
 * How to write a method that validates data entry? Such as an valid email input?
 */
package section10.exercises.entities;

public class Tenant {
	
	private String tenantName;
	private String tenantEmail;
	private int tenantRoomNumber;
	
	public Tenant( String tenantName, String tenantEmail, int tenantRoomNumber) {
		this.tenantName = tenantName;
		this.tenantEmail = tenantEmail;
		this.tenantRoomNumber = tenantRoomNumber;
	}
	
	public String getTenantName() {
		return tenantName;
	}
	
	public void setTenantName(String tenantName) {
		this.tenantName = tenantName;
	}

	public String getTenantEmail() {
		return tenantEmail;
	}

	public void setTenantEmail(String tenantEmail) {
		this.tenantEmail = tenantEmail;
	}

	public int getTenantRoomNumber() {
		return tenantRoomNumber;
	}
	
	/* How modify an tenants room also in the array? How to modify their data allocated in the array? 
	 * I noticed this problem while creating getter for room number, that even if the attribute value
	 * would be modified, the array index in which that tenant's data is assigned would remain the same.
	 * May be I should create an specific method for each attribute? So, it should should require the
	 * current and new room number, use this to copy data to new room and then delete data stored in
	 * previous room number. For other methods, require current room number and new value to be assigned
	 * to name and/or email. 
	public void setTenantRoomNumber(int tenantRoomNumber) {
		this.tenantRoomNumber = tenantRoomNumber;
	}
	*/
	public String toString() {
		return tenantRoomNumber + ": "
			+ tenantName
			+ ", "
			+ tenantEmail;
	}
}


/*
 * 
 */

package section10.exercises.entities;

public class Employee {
	
	private Integer employeeId;
	private String employeeName;
	private Double employeeSalary;
	
	public Employee( Integer employeeId, String employeeName, Double employeeSalary ) {
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeSalary = employeeSalary;
	}
	
	public Integer getEmployeeId() {
		return employeeId;
	}
	
	public String getEmployeeName() {
		return employeeName;
	}
	
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	
	public Double getEmployeeSalary() {
		return employeeSalary;
	}
	
	public void SalaryRaise ( double readjustRate ) {
		employeeSalary += employeeSalary * readjustRate / 100;
	}
	
	public String toString() {
	return employeeId
			+ ", " + employeeName
			+ ", " + String.format("%.2f", employeeSalary);
	}
}


package section8.OOPIntroduction.exercises.entities;

public class Employee {
	
	public String name;
	public double grossSalary;
	public double tax;
	
	public double NetSalary() {
		return grossSalary - tax;
	}
	
	public void IncreaseSalary(double percentage) {
		grossSalary += grossSalary * ( percentage / 100 );
	}
	
	//this method was copied from instructor's solution. My approach was using a sysout in IncreaseSalary() method
	public String toString() {
		return name + ", $ " + String.format("%.2f", NetSalary() );
	}

}

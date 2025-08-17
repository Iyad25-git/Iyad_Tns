//Program to define base class Employee
package inheritance.multilevelinheritance;

import java.util.Date;

public class Employees extends Persona {
	private String deptName;
	private double baseSalary;
	
	public Employees() {}

	public Employees(String name, long contactNo, Date dateOfBirth, String deptName, double baseSalary) {
		super(name, contactNo, dateOfBirth);
		this.deptName = deptName;
		this.baseSalary = baseSalary;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public double getBaseSalary() {
		return baseSalary;
	}

	public void setBaseSalary(double baseSalary) {
		this.baseSalary = baseSalary;
	}

	@Override
	public String toString() {
		return "Employee ["+super.toString()+", deptName=" + deptName + ", baseSalary=" + baseSalary + "]";
	}

	
}

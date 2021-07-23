package set_example_byMe;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Employee implements Comparable<Employee>{
	
	static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	private String name;
	private Date birth;
	private Double salary;
	
	public Employee() {
	}

	public Employee(String name, Date birth, Double salary) {
		this.name = name;
		this.birth = birth;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getBirth() {
		return birth;
	}

	public void setBirth(Date birth) {
		this.birth = birth;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}
	
	@Override
	public String toString() {
		return "EMPLOYEE DATA\n" 
				+ "Name: " + getName()
				+ "\nBirth date: " + sdf.format(getBirth())
				+ "\nSalary: " + String.format("%.2f", getSalary()) + "\n-------------------";
	}
	
	@Override 
	public int compareTo(Employee other) {
		return getBirth().compareTo(other.getBirth());
	}
}

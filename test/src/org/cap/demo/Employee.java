package org.cap.demo;

public class Employee implements Comparable <Employee>{
	
	private int empId; //tsi
	private String firstName;
	private String lastName;
	private double salary;
	
	public Employee() { //test11333
	}

	public Employee(int empId, String firstName, String lastName, double salary){
		super();
		this.empId = empId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.salary = salary;
	}
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public boolean equals(Object obj) {
		System.out.println("Equals method: ");
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		if (empId != other.empId)
			return false;
		if (firstName == null) {
			if (other.firstName != null)
				return false;
		} else if (!firstName.equals(other.firstName))
			return false;
		return true;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + empId;
		result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
		return result;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", firstName=" + firstName + ", lastName=" + lastName + ", salary=" + salary
				+ "]";
	}

	@Override
	public int compareTo(Employee o) {
		System.out.println("o.getFirstName():"+o.getFirstName()+", this.getFirstName(): "+this.getFirstName()+" :: "+(o.getFirstName().compareTo(this.getFirstName())>0));;
	/*	if(o.getEmpId()>this.getEmpId()){
			return -1;
		}else if(o.getEmpId()<this.getEmpId()){
			return 1;
		} else 
			return 0;*/
		
		if(o.getFirstName().compareTo(this.getFirstName())>0){
			return -1;
		}else if(o.getFirstName().compareTo(this.getFirstName())<0){
			return 1;
		} else 
			return 0;
	}  
		
	/*@Override
	public int compareTo(Employee o) {
		return	this.empId - o.empId;
	} */ 

}

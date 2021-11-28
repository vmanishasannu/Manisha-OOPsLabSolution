package com.lab.work1;

public class Employee {
	public String firstName;
	public String lastName;
	public String getFirstName(){
		return firstName.toLowerCase();
	}
	public void setFirstName(String firstName){
		this.firstName=firstName;
	}
	public String getLastName(){
		return lastName.toLowerCase();
	}
	public void setLastName(String lastName){
		this.lastName=lastName;
	}
	public Employee(String firstname, String lastName) {
		this.setFirstName(firstname);
		this.setLastName(lastName);
	}
}

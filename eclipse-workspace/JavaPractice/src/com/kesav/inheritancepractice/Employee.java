package com.kesav.inheritancepractice;

import java.math.BigDecimal;

public class Employee extends Person {
	private String title;
	private String employerName;
	private char grade;
	private BigDecimal salary;
	
	public Employee(String name, String title) {
		super(name);
		this.title=title;
		System.out.println("Employee Constructor");
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getEmployerName() {
		return employerName;
	}
	public void setEmployerName(String employerName) {
		this.employerName = employerName;
	}
	public char getGrade() {
		return grade;
	}
	public void setGrade(char grade) {
		this.grade = grade;
	}
	public BigDecimal getSalary() {
		return salary;
	}
	public void setSalary(BigDecimal salary) {
		this.salary = salary;
	}
	
//	public String toString() {
//		return title + "#" + employerName + "#" + grade + "#" + super.getEmail() + super.getPhoneNumber();
//	}

	public String toString() {
		return super.toString() + title + "#" + employerName + "#" + grade + "#";
	}

}

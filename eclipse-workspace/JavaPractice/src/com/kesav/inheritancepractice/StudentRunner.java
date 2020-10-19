package com.kesav.inheritancepractice;

public class StudentRunner {

	public static void main(String[] args) {
//		Student student = new Student();
//		student.setName("xyz");
//		student.setEmail("abc@gmail.com");
//		student.setPhoneNumber("49876756246");
//		student.setCollege("klmn college");
//		student.setYear("2020");
		
		/*
		Person person = new Person();
		person.setName("xyz");
		person.setEmail("abc@gmail.com");
		person.setPhoneNumber("49876756246");
		String value = person.toString();
		System.out.println(value);
		System.out.println(person);
		*/
		
		Employee employee = new Employee("xyz", "programmer Analyst");
		//employee.setName("xyz");
		employee.setEmail("abc@gmail.com");
		employee.setPhoneNumber("49876756246");
		employee.setEmployerName("xyz");
		employee.setGrade('A');
		employee.setTitle("programmer Analyst");
		System.out.println(employee);
	}

}
 
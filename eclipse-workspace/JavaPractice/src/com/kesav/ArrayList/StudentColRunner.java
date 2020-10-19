package com.kesav.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class StudentColRunner {

	public static void main(String[] args) {
		Stud a = new Stud(1, "RAnga");
		Stud b = new Stud(100, "xyz");
		List<Stud> students = new ArrayList<Stud>();
		students.add(a);
		students.add(b);
				System.out.println(students);

	}

}

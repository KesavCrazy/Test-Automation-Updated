package com.kesav.set;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSet1 {
	public static void main(String[] args) {
		Set<Integer> ex = new LinkedHashSet<Integer>();
		ex.add(10);
		ex.add(20);
		ex.add(30);
		ex.add(40);
		ex.add(50);
		System.out.println(ex);
	}

}

package com.kesav.set;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ArrListTreeSet {
	public static void main(String[] args) {
		List<Integer> ex = new ArrayList<Integer>();
		Set<Integer> ex1 = new TreeSet<Integer>();
		ex.add(10);
		ex.add(20);
		ex.add(30);
		ex.add(40);
		System.out.println(ex);
		ex1.add(100);
		ex1.add(200);
		ex1.add(300);
		ex1.add(400);
		System.out.println(ex1);
		ex1.addAll(ex);
		System.out.println(ex1);
	}

}

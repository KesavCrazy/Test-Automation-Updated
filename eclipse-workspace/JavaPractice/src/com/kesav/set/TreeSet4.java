package com.kesav.set;

import java.util.Set;
import java.util.TreeSet;

public class TreeSet4 {
	public static void main(String[] args) {
		Set<Integer> ex  = new TreeSet<Integer>();
		ex.add(10);
		ex.add(20);
		ex.add(30);
		ex.add(40);
		ex.add(50);
		System.out.println(ex);
		for(int i:ex){
		System.out.println(i);
		}
	}

}

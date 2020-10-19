package com.kesav.HashTable;

import java.util.Enumeration;
import java.util.Hashtable;

public class HashTable1 {
	public static  void main(String[] args) {
		Hashtable balance = new Hashtable();
		Enumeration names;
		String str;
		double bal;
		
		balance.put("Aura", new Double(2343.324));
		balance.put("Sara", new Double(6565.090));
		balance.put("Nura", new Double(7324.676));
		balance.put("Dura", new Double(1231.544));
		balance.put("Zura", new Double(-125.342));
		
		names = balance.keys();
		
		while(names.hasMoreElements()) {
			str = (String) names.nextElement();
			System.out.println(str + ":" + balance.get(str));
		}
		System.out.println();
	}

}

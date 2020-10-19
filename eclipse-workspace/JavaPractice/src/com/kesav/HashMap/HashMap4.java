package com.kesav.HashMap;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMap4 {
	public static void main(String[] args) {
		Map<Integer, String> ex = new HashMap<Integer, String>();
		ex.put(10, "xyz");
		ex.put(20, "abc");
		ex.put(30, "klm");
		ex.put(40, "ghi");
		ex.put(40, ".net");
		ex.put(50, "sales");   
		ex.put(50, "fire");
		Set<Entry<Integer, String>> s = ex.entrySet();
		for(Entry<Integer, String> x : s){
		System.out.println(x.getKey());
		System.out.println(x.getValue());
		}
	}
}

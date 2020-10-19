package com.kesav.HashMap;

import java.util.HashMap;
import java.util.Map;

public class HashMap1 {
	public static void main(String[] args) {
		Map<Integer, String> ex = new HashMap<Integer, String>();
		ex.put(10, "xyz");
		ex.put(20, "abc");
		ex.put(30, "klm");
		ex.put(40, "ghi");
		ex.put(40, ".net");
		ex.put(50, "sales");   
		ex.put(50, "fire");
		System.out.println(ex);
	}
}

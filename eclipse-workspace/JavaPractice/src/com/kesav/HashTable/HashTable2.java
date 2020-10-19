package com.kesav.HashTable;

import java.util.Enumeration;
import java.util.Hashtable;

public class HashTable2 {
	public static void main(String[] args) {
		Enumeration name;
		String key;
		
		Hashtable<String, String>hashtable = new Hashtable<String, String>();
		
		hashtable.put("Key1","abc");
		hashtable.put("Key2","efg");
		hashtable.put("key3","hij");
		hashtable.put("key4","klm");
		
		name = hashtable.keys();
		while(name.hasMoreElements()) {
			key = (String) name.nextElement();
			System.out.println("Key :" + key + "value :" + hashtable.get(key));
		}
	}
}

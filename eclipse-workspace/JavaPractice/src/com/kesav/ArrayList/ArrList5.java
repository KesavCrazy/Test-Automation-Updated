package com.kesav.ArrayList;

import java.util.ArrayList;
import java.util.List;

public class ArrList5 {
	 public static void main(String[] args) {   
		 List<Integer> ex = new ArrayList<Integer>(); 
		 List<Integer> ex1 = new ArrayList<Integer>();  
		 ex.add(10);
		 ex.add(20); 
		 ex.add(30);  
		 ex.add(40);
		 ex.add(50); 
		 ex1.addAll(ex); 
		 ex.add(100); 
         ex.add(200); 
         ex.add(300); 
         ex1.add(1000);
         ex1.add(2000); 
         ex1.add(3000);
         System.out.println(ex); 
         System.out.println(ex1); 
         ex1.retainAll(ex);
         System.out.println(ex1);  
         } } 
	 
	

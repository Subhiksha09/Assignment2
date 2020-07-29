package com.capg.assignment;

import java.util.Arrays;

public class Anagrams {
	
	public static void main(String args[]) {
	      String s1 = "Astronomer";
	      String s2 = "Moon starer";

	      if (s1.length()==s2.length()) {
	    	  
	         char[] arr1 = s1.toCharArray();
	         Arrays.sort(arr1);
	         System.out.println(Arrays.toString(arr1));
	         
	         char[] arr2 = s2.toCharArray();
	         Arrays.sort(arr2);
	         System.out.println(Arrays.toString(arr2));
	         
	         System.out.println(Arrays.equals(arr1, arr2));
	         
	         if(arr1.equals(arr2))
	            System.out.println("Strings are anagrams");
	         else {
	            System.out.println("Strings are not anagrams");
	         }
	      }
	   }

}

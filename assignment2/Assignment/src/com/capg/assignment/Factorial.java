package com.capg.assignment;

import java.util.Scanner;

public class Factorial {
	
	public static void main(String args[]){  
		
		  int i,fact=1;  
		  Scanner scan=new Scanner(System.in);
		  int num = scan.nextInt();
		  scan.close();
		  
		  if(num > 1 && num < 18)
		  {
		  for(i=1; i<=num; i++){    
		      fact=fact*i;    
		  }
		  
		  System.out.println("Factorial of number is: "+fact);    
		 }
		  else
		  {
			  System.out.println("Invalid Input");
		  }
		 }

}

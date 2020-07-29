package com.capg.assignment;

import java.util.Scanner;

public class PrimeFactor {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num;
	      Scanner sc = new Scanner(System.in);
	      System.out.println("Enter a number :");
	      num = sc.nextInt();
	      sc.close();
	     
	      for(int i = 2; i < num; i++) {
	         while(num % i == 0) {
	            System.out.println(i+" ");
	            num = num / i;
	         }
	      }
	      if(num >2) {
	         System.out.println(num);
	      }
	}

}

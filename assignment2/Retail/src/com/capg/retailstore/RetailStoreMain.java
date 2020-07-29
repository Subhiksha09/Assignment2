package com.capg.retailstore;

import java.util.Scanner;




public class RetailStoreMain {
	
	private static String customerName;

	public static void main(String[] args) {
		
		Discounts discount = new Discounts();
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Select Customer type: ");
		System.out.println("1. Employee of the retail store");
        System.out.println("2. Affiliate of the retail store");
        System.out.println("3. Customer since 2 years ");
        System.out.println("4. None of the above");
        System.out.println("5. No discount on Groceries");
        
		int custType=sc.nextInt();
		System.out.println("Enter Your Name: ");
		customerName = sc.next();
		System.out.println("Enter your actual bill amount:");
		double billamount=sc.nextDouble();
		
		System.out.println("Total payable amount is :" + discount.getDiscount(billamount, custType));
		System.out.println("Thank you for Shopping " + customerName );
		sc.close();
			
		}
}

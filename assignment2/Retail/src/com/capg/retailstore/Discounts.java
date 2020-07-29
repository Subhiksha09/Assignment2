package com.capg.retailstore;

public class Discounts {
	
private double discountAmount;
	
	public double getDiscount(double amount, int type) {
		
		double totalCost=0;
		
		switch(type) {
		
		case 1:
			discountAmount= (amount*30)/100;
			totalCost=amount-discountAmount;
			break;
			
		case 2:
			discountAmount= (amount*10)/100;
			totalCost=amount-discountAmount;
			break;
			
		case 3:
			discountAmount= (amount*5)/100;
		    totalCost=amount-discountAmount;
		 break;
			
		case 4:
			int amt=(int) (amount/100);
			discountAmount=amt*5;
			totalCost=amount-discountAmount;
			break;
				
		case 5:
			totalCost=amount;
			break;
				
		default:  
		     System.out.println("Please select the proper action.");
		     System.exit(0);    
		}
			
		return totalCost;
	}

}

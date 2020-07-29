package com.capg.assignment;

public class LongestString {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	        String s = "Hello!!! Welcome to strings";
	        String[] word = s.split( " " );
	        //System.out.println(word.length);
	        String str = " ";

	        for ( int i = 0; i < word.length; i++ )
	        {
	            if ( word[i].length() > str.length() )
	                str = word[i];

	        }
	        System.out.println( str );
	    

	}

}

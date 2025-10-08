package com;



public class project_14 {

public static void main(String[] args) {
	int []arr= {10,17,7,18};
	int largest=Integer.MIN_VALUE;
	int second_largest=Integer.MIN_VALUE;
	
	for( int num:arr) {
		if(num>largest) {
			
			second_largest=largest;
			largest=num;
					
		}else if(num>second_largest && num!=largest) {
			second_largest=num;
		}
	}
	System.out.println("second largest: "+second_largest);
	
	
	
	
	
}
	
	
}

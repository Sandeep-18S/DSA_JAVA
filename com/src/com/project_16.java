package com;

public class project_16 {

	public static void main(String[] args) {

	int [][] arr= {{1,2,3,2},
					 {7,8,9,5}};
    
    
    
	for (int i = 0;  i<arr.length; i++)
	{
		int sum = 0;
		for ( int j = 0 ; j < arr[i].length; j++)
		{
			sum += arr[i][j];
			
		}System.out.println("Row:" + (i+1) + "sum:" + sum);
		
	}
		
		
	}
}

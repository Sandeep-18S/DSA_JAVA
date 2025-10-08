package exceptional_handling;

import java.util.Scanner;

public class recursion {
	public static void printDec(int n) 
	{
		if(n==1) 
		{
			System.out.print(n);
			return;
		}
		System.out.print(n + " ");
		printDec(n -1);
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the number 1:" );
		int n =  sc.nextInt();
		printDec(n);
		
	    
	}
	

}

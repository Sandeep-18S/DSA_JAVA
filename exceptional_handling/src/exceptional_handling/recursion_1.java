package exceptional_handling;

import java.util.Scanner;

public class recursion_1 {
	public static int factorial(int n) 
	{
		if(n==0 || n==1) 
		{
			return 1;
		}
		return n*factorial(n-1);
		
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the number :" );
		int n =  sc.nextInt();
		int result=factorial(n);
		System.out.println("factorial of " + n + " is : " + result);
	}
}

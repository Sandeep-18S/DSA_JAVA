package exceptional_handling;

import java.util.Scanner;

public class sum_of_numbers {
	
		public static int sum(int n) 
		{
			if(n==0 || n==1) 
			{
				return n;
			}
			return n+sum(n-1);
			
		}
		public static void main(String[] args) 
		{
			Scanner sc = new Scanner(System.in);
			System.out.print("enter the number :" );
			int n =  sc.nextInt();
			int result=sum(n);
			System.out.println("sum of " + n + " is : " + result);
		}
	}




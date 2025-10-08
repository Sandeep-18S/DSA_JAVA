package exceptional_handling;

import java.util.Scanner;

public class eh {
	public static void main(String[] args) {
		
		try {
			Scanner sc = new Scanner(System.in);
			System.out.print("enter the number 1:" );
			int num1 =  sc.nextInt();
			System.out.print("enter the number 2:" );
			int num2 =  sc.nextInt();
			int ans=num1/num2;
			System.out.println("the answer is : " +ans);
		
		}
		catch(ArithmeticException e)
		{
			System.out.println("error");
		}
		System.out.println("program continue");
		
	}

}

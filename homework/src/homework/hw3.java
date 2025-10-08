package homework;

import java.util.Scanner;

public class hw3 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("age :");
		int age = sc.nextInt();
		if(age>=18) {
			System.out.println("eligible for voting");
			
			
		}
		else
		{
			System.out.println("not eligible for voting");
			
		}
		
	}

}

package com;
import java.util.Scanner;
public class project_01
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the nuummber :");
		int num = sc.nextInt();
		int rev = 0;
		
		while (num !=0)
		{
			rev = rev * 10 + num  % 10;
			num = num/10;
		}
		System.out.println("the reverse number is :" +rev);
	}

}

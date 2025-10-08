package homework;

import java.util.Scanner;

public class hw5 {
	public static void main(String[] args) {
		
		Scanner sc  =  new  Scanner(System.in);
		System.out.println("enter the number:");
		int num= sc.nextInt();
		if(num<=12) {
			System.out.println("child");
		}
		else if(num>12 && num<=18)
		{
		System.out.println("teenager");
		
			
		}
		else {
			System.out.println("adult");
		}
	}

}

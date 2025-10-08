package homework;

import java.util.Scanner;

public class hw6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number:");
		int num= sc.nextInt();
		if(num%5==0 && num%11==0)
		{
			System.out.println("the number is divisable by both 5 and 11");
		}
		else {
			System.out.println("it is not divisible ");
		}
	
}
}





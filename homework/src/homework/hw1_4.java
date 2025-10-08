package homework;

import java.util.Scanner;

public class hw1_4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("enter the number:" );
		int num =  sc.nextInt();
		int smallest = Integer.MIN_VALUE ;
		
		for (int n = num; n > 0;n/=10 ) {
			int digit = n % 10;
			if(digit > smallest) {
				smallest = digit;
				
			}
		}
		System.out.println("smallest digit:" +smallest);
		sc.close();
		
		
	}

}

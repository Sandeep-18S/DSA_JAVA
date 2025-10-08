package com;
import java.util.Scanner;
public class project_07 {
	public static void main(String[] args) {
		
      Scanner sc = new Scanner(System.in);
      System.out.println("enter the value for n: ");
      int n = sc.nextInt();
      System.out.println("enter the value for m : ");
      int m = sc.nextInt();
      System.out.println("enter the operator : ");
      char operation= sc.next().charAt(0);//to take the input for a char
      
      //System.out.println("addition of two numbers = "+ (n+m)); 
      //System.out.println("subtraction of two numbers = "+ (n-m));
      //System.out.println("multiplication of two numbers = "+ (n*m));
      //System.out.println("division of two numbers = "+ (n/m));
      
      switch(operation)
      {
      case '+':
    	  System.out.println("addition of two numbers = "+ (n+m));
    	  break;
      case '-':
    	  System.out.println("sub of two numbers = "+ (n-m));
    	  break;
      case '*':
    	  System.out.println("mul of two numbers = "+ (n*m));
    	  break;
      case '/':
    	  System.out.println("div of two numbers = "+ (n/m));
    	  break;
      }
	}

}

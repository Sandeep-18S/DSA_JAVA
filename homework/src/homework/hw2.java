package homework;
import java.util.Scanner;
public class hw2 {
public static void main(String[] args) {
	
	Scanner sc  =  new  Scanner(System.in);
	System.out.println("enter the year:");
	int year= sc.nextInt();
	
	if(year%4==0 || year%400==0 && year%100!=0)
	{
		System.out.println("the year is leap year");
		
	}
	else
	{
		System.out.println("its not a leap year");
		
	}

	
}

}
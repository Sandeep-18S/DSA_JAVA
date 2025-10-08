package loops;

import java.util.Scanner;

public class nested_loops {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the n rows: ");
		int row= sc.nextInt();
		System.out.println("enter the n col : ");
		int col= sc.nextInt();

		for(int i=1; i<=row; i++)
		{
			for(int j = 1;  j <= col; j++)
			{
				if(i == 1 || i == row|| j == 1 || j == col) 
				{
					System.out.print(" D ");
					
				}
				else 
				{
					System.out.print("  ");

				}
			}System.out.println();
		}

	}

}

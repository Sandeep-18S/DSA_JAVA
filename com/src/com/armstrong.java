  package com;

public class armstrong {
    public static void main(String[] args) {
    	int num= 103;
	    int original = num;
	    int sum = 0;
	
	while (num >0)
	{
		int digit = num %10;
		sum = sum + (digit * digit * digit);
		num = num/10;
		}
	if (sum == original)
	{
		System.out.println("it is a armstrong number");
		}
	else
	{
		System.out.println("it is not a armstrong number");
	}
}

}

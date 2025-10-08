package homework;

public class hw2_4 {
public static void main(String[] args) {
	int [] arr= {1,2,4,17,7,18};
	int c_even=0;
	int c_odd=0;
	
	for(int i=0; i<arr.length; i++)
	{
		if(arr[i]%2==0)
		{
			c_even++;
			
		}
		else
		{
			c_odd++;
		}	
	}
	System.out.println("total even numbers : " + c_even);
	System.out.println("total odd  numbers :" + c_odd);
			
}
}



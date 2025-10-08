package searching;

public class smallestnumber {
	
	public static int getsmallest(int arr[]) 
	{
		int largest = Integer.MAX_VALUE;
		for (int i = 0; i < arr.length; i++)
		{
			if(largest > arr[i])
			{
				largest = arr[i];
				
			}
			
		}
		return largest;
		
		
	}
	public static void main(String[] args) 
	{
		int[] arr = {1,5,8,166,7,6};
		int largest = getsmallest(arr);
		System.out.println("the Smallest element is : "+largest);
		
		
	}
	

}
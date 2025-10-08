package searching;

public class largest_in_array {
	
	public static int getLargest(int arr[]) 
	{
		int largest = Integer.MIN_VALUE;
		for (int i = 0; i < arr.length; i++)
		{
			if(largest < arr[i])
			{
				largest = arr[i];
				
			}
			
		}
		return largest;
		
		
	}
	public static void main(String[] args) 
	{
		int[] arr = {1,5,8,166,7,6};
		int largest = getLargest(arr);
		System.out.println("the Largest element is : "+largest);
		
		
	}
	

}

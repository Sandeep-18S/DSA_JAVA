package searching;

public class linear_search {

	public static int  linearSearch (int[] arr,int key)
	{
		for(int i = 0 ; i < arr.length; i++)
		{
			if (key == arr[i])
			{
				return i;
				
			}
		}
		return -1;
		
	}
	public static void main(String[] args)
	{

		int[] arr = {1,5,8,9,7,2};
		int key = 5;
		
		int index = linearSearch(arr, key);
		
		if(index == -1) 
		   System.out.println("Element not found");
		
		else
		    System.out.println("Element found at :" +index);
					
		
	}
	
}

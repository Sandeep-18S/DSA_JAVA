package searching;

public class bubblesorting {
	public static void main(String[] args)
	{
		int []arr = {0,9,5,36,1,6};
		for (int i=0 ; i< arr.length ; i++)
		{
			for(int j=0 ; j< arr.length-1-i ; j++)
			{
				if(arr [j+1]< arr[j])
				{
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;

				}
			}
		}
		System.out.println("sorted elements are : ");
		for (int element : arr)
		{
			System.out.print(element+ ",");
		}
	}
}

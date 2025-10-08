package homework;

public class hw2_3 {
	public static void main(String[] args) {
		int [] arr= {1,2,6,7,4,4};
		boolean sorted=true;
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]>arr[i+1]) {
				sorted=false;
				break;
			}
			
		}if(sorted)
		{
			System.out.println("sorted");
		}
		else
		{
			System.out.println("the array is not sorted");
		}
	}
}

package homework;

public class hw2_1 {
	public static void main(String[] args) {
		int []arr= {10,24,25,17,7};
		int kutty=arr[0];
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]<kutty) {
				kutty=arr[i];


				System.out.println("the smallest number:  " + kutty);
			}
		}
	}
}



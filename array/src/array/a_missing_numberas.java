package array;

public class a_missing_numberas {
	
	public static void main(String[] args) {
		int [] arr= {1,2,3,4,5,6,8,9};
		int n=9;
		int  sum=n*(n+1)/2;
		
		int arrSum=0;
		
		for(int num:arr) {
			arrSum+=num;
		}
		System.out.println(" missing number :  "+(sum-arrSum));
		
	}

}

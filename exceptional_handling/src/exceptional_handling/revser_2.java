package exceptional_handling;

import java.util.Arrays;
import java.util.Collections;

public class revser_2
{
	public static void main(String[] args) {
		Integer [] arr= {7,8,4,3};
		Arrays.sort(arr,0,3,Collections.reverseOrder());
		System.out.println("the sorted array is : " +Arrays.toString(arr));
	}

}

package com;

import java.util.Arrays;

public class project_10 {
	public static void main(String[] args) {
		
		int[]arr = {1,2,3,4};
		
		System.out.println(Arrays.toString(arr));
		
		int start = 0;
		int end = arr.length-1;
		while ( start < end )
		{
			int temp = arr[end];
			arr[end] = arr[start];
			arr[start] = temp;
			start++;
			end--;
		}
        System.out.println(Arrays.toString(arr));
            
		
	}

}

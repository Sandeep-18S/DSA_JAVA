package com;

public class project_15 {
 public static void main(String[] args) {
	int[][] arr= {{1,2,3,2},
	              {4,5,6,4},
	              {7,8,9,5},
	              {7,8,9,5}};
	int sum=0;//sum=0
	for(int i=0; i < arr.length; i++)//i=0
	{
		//sum=sum+arr[i][i];//sum=0+(0,0=1)=0+1=1)
	                      //sum=1+(1,1=5)=1+5=6)
		                  //sum=6+(2,2=9)=6+9=15)
		sum+=arr[i][i];
		
	}
	System.out.println("sum of the diagonal elements is:" +sum);
}
}

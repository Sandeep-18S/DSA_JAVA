package com;

public class project_09 {
  public static void main(String[] args) {
	String a="sandeep";
	String b="mental";
	a=a+b;//devidharma
	b=a.substring(0,a.length()-b.length());// devidharma(0,(10-6=4))then (0,4)b=devi
	a=a.substring(b.length());//devidharma counts from the last length is 6 -0to -6 then dhrama will print in a
	//swapping over
	
	System.out.println("a : " +a);
	System.out.println("b : " +b);
	
}  
}

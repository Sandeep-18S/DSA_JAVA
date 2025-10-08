package com;

public class reverse {
	public static void main(String[] args) {
		String sentence = "java is fun";
		String reversed = "";
		
		String[] words = sentence.split(" ");
		for (int i =words.length - 1; i>=0; i--)
		{
			reversed += words[i] + " ";
		}
		
		System.out.println("Revesed string is: "+reversed);
		
	}
}


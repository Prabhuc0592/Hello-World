package com.greenswork.org;

public class ReverseString1 {
	
	public static void reverseSample() {

		String s = "Prabhu";
		String reverse = " ";
		for (int i=s.length()-1; i>=0; i--) {
			reverse = reverse + s.charAt(i);				
		}
		System.out.println("Reverse of word:"+reverse);
	}
	
	
	public static void reverseOfStringEachWord() {
		
		String s = "Welcome to java";
		String[] split = s.split(" ");
		String reverseString="";
		for (String x : split) {
			String reverseword="";
			for (int i=x.length()-1; i>=0; i--) {
				reverseword = reverseword + x.charAt(i);
			}
			reverseString = reverseString + reverseword + " ";
		}
			System.out.println("Original string: "+s);
			System.out.println("Reverse string: "+reverseString);
		}
	
	public static void main(String[] args) {
		
		reverseSample();
		reverseOfStringEachWord();
	}

}

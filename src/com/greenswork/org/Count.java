package com.greenswork.org;

public class Count {
	
	public static void main(String[] args) {
		
		String s = "abCdEF123@#%jhkSPR";
		
		int lowercase=0,uppercase=0,speclchar=0,num=0;
		
		for (int i = 0; i < s.length(); i++) {
			
			if ('a'<=s.charAt(i) && s.charAt(i)<='z') {
				lowercase++;
			}
			
			else if ('A'<s.charAt(i) && s.charAt(i)<='Z') {
				uppercase++;
			}
			
			else if ('0'<s.charAt(i) && s.charAt(i)<='9') {
				num++;
			}
			else {
				speclchar++;
			}			
			
		}
		
		System.out.println("Count of uppercase:"+uppercase);
		System.out.println("Count of lowercase:"+lowercase);
		System.out.println("Count of number:"+num);
		System.out.println("Count of spcialcharacter:"+speclchar);
	}

}

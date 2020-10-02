package com.greenswork.org;

public class Marriage extends Boy {
	
	@Override
	public void girlName() {
		
		super.girlName();
		System.out.println("Abi");
	}
	
	public static void main(String[] args) {
		
		Marriage m = new Marriage();
		m.girlName();
	}

}

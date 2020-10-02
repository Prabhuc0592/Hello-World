package com.greenswork.org;

public class MyChaining {
	
	public MyChaining() {
		System.out.println("Default Constrctor");
	}
	
	public MyChaining(int i) {
		this();
		System.out.println("Single Parameter Constrctor");
	}
	
	public MyChaining(int i,int j) {
		this(j);
		System.out.println("Multiple Parameter Constrctor");
	}
	
	public static void main(String[] args) {
		
		MyChaining mc = new MyChaining(10,20);
	}

}

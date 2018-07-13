package com.prac.java;

public class Demo {
	private static Demo d;
	private Demo() {
		System.out.println("object created");
	}
	public static Demo getInstance() {
		if(d==null) {
			d=new Demo();
		}
		return d;
	}
	
	public static void main(String[] args) {
		Demo d1=Demo.getInstance();
		Demo d2=Demo.getInstance();
		Demo d3=Demo.getInstance();
		Demo d4=Demo.getInstance();
	}

}



package com.prac.java;

public class Demo {
	
	public static void main(String[] args) {
		int nor=5;
		int row=1;
		for (int i = nor; i >0; i--) {
			for (int j = i; j >0; j--) {
				System.out.print(j+" ");
			}
			for (int j = 1; j <=row; j++) {
				System.out.print(" ");
			}
			System.out.println();
			row++;
		}
		System.out.println(row);
	}
}

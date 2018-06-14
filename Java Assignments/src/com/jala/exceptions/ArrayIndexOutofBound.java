package com.jala.exceptions;

public class ArrayIndexOutofBound {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]=new int[5];  
		a[10]=50; //ArrayIndexOutOfBoundsException 
		System.out.println(a[10]);
	}

}

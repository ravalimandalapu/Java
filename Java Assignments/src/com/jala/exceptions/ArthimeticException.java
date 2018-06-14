package com.jala.exceptions;

public class ArthimeticException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			
		
		int a=50/0;
		System.out.println(a);
		}catch(ArithmeticException e)
		{
			System.err.println(e);
		}
	}

}

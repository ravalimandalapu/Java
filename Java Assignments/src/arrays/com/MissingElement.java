package arrays.com;

import java.util.Arrays;
import java.util.Scanner;

public class MissingElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 /*
				int[] arr1={7,5,6,1,4,2};
				System.out.println("Missing number from array arr1: "+missingNumber(arr1));
				int[] arr2={5,3,1,2};
				System.out.println("Missing number from array arr2: "+missingNumber(arr2)); */
		 
			Scanner sc=new Scanner(System.in);
		int arr[]=new int[100];
		for(int i=0;i<100;i++)
		{
		    arr[i]=sc.nextInt();
		    System.out.println(arr[i]);
		}
		 
		int n=arr.length+1;
		int sum=n*(n+1)/2;
		int restSum=0;
		for (int i = 0; i < arr.length; i++) {
			restSum+=arr[i];
		}
		int missingNumber=sum-restSum;
		System.out.println(missingNumber);
		 
	}
			
		

	}




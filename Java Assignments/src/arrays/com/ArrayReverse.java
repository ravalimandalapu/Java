package arrays.com;

import java.util.Arrays;

public class ArrayReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {35,45,78,53,20,76,18,19};
		
		System.out.println("original  Array"+Arrays.toString(arr));
		int i;
		for( i=0;i<arr.length/2;i++);
		{
			
			
			int temp= arr[i];
			arr[i]=arr[arr.length-i-1];
			arr[arr.length-i-1]=temp;
		}
		System.out.println("reverse Array"+Arrays.toString(arr));
		

	}

}

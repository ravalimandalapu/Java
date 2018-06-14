package arrays.com;

import java.util.Arrays;

public class ArrayInsert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {10,11,12,13,15,16,17,18};
		int index=4;
		int newValue=14;
		System.out.println("Original Array"+Arrays.toString(arr));
		for(int i=arr.length-1;i>index;i--)
		{
			arr[i]=arr[i-1];
		}
		arr[index]=newValue;
		
		System.out.println("New Array"+Arrays.toString(arr));
	}

}

package arrays.com;

import java.util.Arrays;

public class EvenAndOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,2,4,6,6,9,5};
		System.out.println("Original Array"+Arrays.toString(arr));
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
			{
				count++;
			}
		}
		System.out.println("number of even numbers in array"+count);
		System.out.println("number of odd numbers in array"+(arr.length-count));
		
		}
	

}

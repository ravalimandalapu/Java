package arrays.com;

import java.util.Arrays;

public class SecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {10,11,12,13,17,28,30};
		int large=arr[0];
		int secondLarge=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Given array is"+Arrays.toString(arr));
		}
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>large)
			{
				secondLarge=large;
				large=arr[i];
			}
			else if(arr[i]>secondLarge)
			{
				secondLarge=arr[i];
			}
		}
		System.out.println("Printing largest number"+secondLarge);
	}

}

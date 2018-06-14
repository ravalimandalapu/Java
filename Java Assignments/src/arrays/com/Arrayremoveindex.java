package arrays.com;

import java.util.Arrays;

public class Arrayremoveindex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {1,32,16,15,12,13,19,17};
		System.out.println("Orininal Array"+Arrays.toString(arr));
		
		int removeIndex=2;
		for(int i=removeIndex;i<arr.length-1;i++)
		{
			arr[i]=arr[i+1];
		}
		
		System.out.println("Modified Array"+Arrays.toString(arr));

	}

}

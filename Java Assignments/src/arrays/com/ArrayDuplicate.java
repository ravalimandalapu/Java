package arrays.com;

public class ArrayDuplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,14,16,17,18,19,14,16,16};
		int i,j;
		for( i=0;i<arr.length;i++)
		{
			for( j=i+1;j<arr.length-1;j++)
			{
				if((arr[i]==arr[j]) && (i!=j))
				{
					System.out.println(arr[j]);
				}
			}
		}
		
	}

}

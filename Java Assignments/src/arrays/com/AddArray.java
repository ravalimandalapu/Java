package arrays.com;

public class AddArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]= {10,11,2};
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			// Adding Array values one by one
			sum+=arr[i];
		}
		//printing interger array values after adding
		System.out.println(sum);

	}

}

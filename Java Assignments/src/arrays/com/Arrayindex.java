package arrays.com;

public class Arrayindex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int arr[]= {10,11,12,13,14};
		int arrele=14;
		for(int i=0;i<arr.length;i++)
		{
			if(arrele==arr[i])
			{
				int index=i;
				System.out.println(index);
			}
		}
		

	}

}

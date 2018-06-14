package arrays.com;

public class ArrayCopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {10,20,30,40,50};
		int b[]=new int[a.length];
		//copy a[] array values to b[] array
		for(int i=0;i<a.length;i++)
		{
			b[i]=a[i];
		}
		// printing b[] array elements after copying
		for(int i=0;i<b.length;i++)
		{
			System.out.println(b[i]);
		}
	}

}

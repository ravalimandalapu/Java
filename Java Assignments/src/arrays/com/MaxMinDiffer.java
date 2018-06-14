package arrays.com;

public class MaxMinDiffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {1,3,5,7,9,10,16,18};
		int min=a[0];//assume 1st element is smallest number
		int max=a[0];//assume 1st element is large number
		for(int i=1;i<a.length;i++)//for iterate the array loop
		{

			
			if(a[i]>max)
			{
				max=a[i];
			}
			if(a[i]<min)
			{
				min=a[i];
			}
			
		}
		System.out.println("the largest no in the given array:"+max);
		System.out.println("the smallest no in the given array:"+min);
		System.out.println("Difference between max value and min value:"+(max-min));
		
		

	}

}

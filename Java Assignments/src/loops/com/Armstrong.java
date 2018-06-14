package loops.com;

public class Armstrong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=153,temp,sum=0;
		int r;
		temp=n;
		while(n>0) {
			r=n%10;
			sum=sum+(r*r*r);
			n=n/10;
			
		
		}
		temp=n;
		if(temp==sum)
		{
			System.out.println("no is armstrong");
			
		}
			
		else
			
		{
			System.out.println("no  is not armstrong");

			
		}
			
	}

}

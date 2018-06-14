package loops.com;

public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0,r,n=121;
	 int temp=n;
		while(n>0) {
		r=n%10;
		sum=sum*10+r;
		n=n/10;
	}
		n=temp;
	if(sum==n)
		System.out.println(" given no is palindrome");
	else
		System.out.println(" given no  is  not palindrome");

}
}

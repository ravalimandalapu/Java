package methodoverloading.com;

public class Overloading1 {
	void max(int a,int b)
	{
		if(a>b)
			System.out.println(a);
		else
			System.out.println(b);
	}
	void max(int a,int b,int c)
	{
		if(a>b && a>c)
			System.out.println(a);
		else if(b>a && b>c)
			System.out.println(b);
		else
			System.out.println(c);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Overloading1 ob=new Overloading1();
		ob.max(30, 78,23);
		ob.max(20, 30);

	}

}

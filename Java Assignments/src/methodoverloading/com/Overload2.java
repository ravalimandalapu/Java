package methodoverloading.com;

public class Overload2 {
	
	
	void display(int a,int b)
	{
		System.out.println(a+""+b);
	}
	void display(float a,double b,int c)
	{
		System.out.println(a+""+b+""+c);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Overload2 ob=new Overload2();
		ob.display(10,20);
		ob.display(2.0f,2.5587,5);
	}

}

package methodoverloading.com;

public class Overload3 {
	 static int add(int a,int b)
	{
		return a+b;
	}
	 static float add(float a,float b)
	{
		return a+b;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(add(10, 20));
		System.out.println(add(1.3f,1.7f));

	}

}

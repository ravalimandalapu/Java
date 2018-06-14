package Inheritance.com;

class A
{
	void show()
	{
		System.out.println("Show method");
	}
}
class B extends A
{
	 void display()
	 {
		 System.out.println("dispaly method");
	 }
}
class C extends B
{
	void print()
	{
		System.out.println("print method");
	}
}
public class Inheritance1  {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A ob1= new A();
		B ob2=new B();
		C ob3=new C();
		ob1.show();
		ob2.display();
		ob3.print();
		

	}

}

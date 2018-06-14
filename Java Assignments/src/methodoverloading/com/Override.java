package methodoverloading.com;

public class Override
{
	void show()
	{
		System.out.println(" Override class");
		
	}
	void print()
	{
			System.out.println("Print() method") ;
		
	
	}
}
class Over extends Override {
	 void show()
	 {
		 System.out.println(" Over class");
	 }
	 void display()
	{
				System.out.println("display() method") ;
			
		
	}
	 


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Over ob=new Over();
		ob.show();
		ob.print();
		ob.display();

	}

}

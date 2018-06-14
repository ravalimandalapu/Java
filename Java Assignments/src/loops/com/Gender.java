package loops.com;

import java.util.Scanner;

public class Gender {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Gender");
		String s=sc.next();
		char ch = s.charAt(0);
		switch(ch)
		{
		case 'M':
		case 'm': System.out.println("Male");
		break;
		case 'F':
		case 'f':System.out.println("FeMale");
		break;
		}
	}

}

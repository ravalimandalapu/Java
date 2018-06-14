package com.jala.java.io;

import java.io.FileInputStream;

public class InputStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {    
			
		
		FileInputStream fis=new FileInputStream("C:\\Users\\hp\\Desktop\\nCodeIt\\ravali.txt");
		int n=fis.available();
		 byte data[]=new byte[fis.available()];
         fis.read(data);
         fis.close();
         String str=new String(data);
         System.out.println(str);
		}catch(Exception e)
		{
			System.err.println(e);
		}
	}

}

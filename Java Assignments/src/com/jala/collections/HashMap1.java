package com.jala.collections;

import java.util.HashMap;
import java.util.Map;

public class HashMap1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 HashMap<Integer,String> hm=new HashMap<Integer,String>();  
		  hm.put(100,"ravali");  
		  hm.put(101,"krishna");  
		  hm.put(102,"sai");  
		  System.out.println(hm.remove(100));  
		  for(Map.Entry m:hm.entrySet()){  
		   System.out.println(m.getKey()+" "+m.getValue());  
		  
		   
	}

	}
}


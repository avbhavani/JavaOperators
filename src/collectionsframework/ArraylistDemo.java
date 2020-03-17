package collectionsframework;

import java.util.ArrayList; //java,util is a inbuilt package in java
import java.util.Iterator;

public class ArraylistDemo {
	
	

	public static void main(String[] args) {
		// noraml int Array:
		  
		  int [] arr1= new int[3];
		  arr1[0] = 10;
		  arr1[1] = 20;
		  arr1[2] = 30;
	System.out.println(arr1[2]); // printing single array value
	for (int i= 0; i<arr1.length; i++)
		System.out.println(arr1[i]); // multiple array values
	
	//normal string array
	String [] str1 = new String [5];// array name and length 
	       str1[0] = "hi";
	       str1[1] = "we";
	       str1[2] = "are";
	       str1[3] = "leraning";
	       str1[4] = "java";
	    for (int i =0; i<str1.length;i++)
	    System.out.println(str1[i]);
	     
	// ArrayList is a Dynamic Array class
	    //syntax: ArrayList<String> al=new ArrayList<String>();
		  
	// Intiger array
	    ArrayList<Integer> aList= new ArrayList<Integer>(); // aList is a object
		  // Adding values to the Array List
		  aList.add(100);
		  aList.add(200);
		  aList.add(300);
		  aList.add(400);
		 
		  //To print the array List values one at onetime
		  System.out.println(aList.get(0));// single array value
		  for (int i =0; i <aList.size() ;i++ )
			  System.out.println(aList.get(i));//multiple single array value
		 
	// String Array 
		  
		  ArrayList<String> sList = new   ArrayList<String>();
		  sList.add("ram");
		  sList.add("sam");
		  sList.add("mam");
		  sList.add("ham");
		  sList.add("tam");
		  
		  System.out.println(sList);// printing all in as one value
		  System.out.println(sList.get(1));// it will get 1st index value
		   
		  for (int j = 0; j<sList.size();j++ )
			  System.out.println(sList.get(j));// printing all values
			  
		   
		  // Or use iterator() method
		  
		  Iterator<Integer> itr = aList.iterator();// int value
		  
		  while(itr.hasNext())
		  {
		   System.out.println(itr.next());
		  }
		  
		  
		  Iterator <String > str = sList.iterator();// String value
		  while(str.hasNext())
		  {
			   System.out.println(str.next());
			  }
		  
		  
		  
		  
		  
		 }

		



	}



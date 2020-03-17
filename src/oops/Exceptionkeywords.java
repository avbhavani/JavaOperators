package oops;

import java.io.FileNotFoundException;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

//Throw keyword
public class Exceptionkeywords {
	
		  
		 public void driving( int age)
		 {
		 if(age <18)
		 {
		  // syntax : throw new Exceptionname("message")    of a throw keyword
		  throw new ArithmeticException("age should be less than 18");
		 }
		 else 
		 {
         System.out.println("age is right");
		    }
		 }
		 
		 
		 public static void ride(int weight)
		 {
			 if (weight >25)
			 {
		 throw new ArithmeticException ("weight is less to ride");
			 }
			 else 
			 {
				 System.out.println("weight is qualified");	 
			 }
		 }
		 
		 
		//throws keyword
		 public void time() throws InterruptedException 
		 {
		  Thread.sleep(3000);
		  //System.out.println("sleep error"); //  Thread.sleep(millsecondstime) - used to make the tool wait for particular
		 }
		 
		 public void read() throws FileNotFoundException
		 {
		  FileReader f= new FileReader("C:\\Users\\vishal mittal\\Desktop\\abc.txt");
		 
		 }
		 
		 public void write() throws IOException
		 {
		  FileWriter f1 = new FileWriter("C:\\Users\\vishal mittal\\Desktop\\abc.txt");
		  
		  }

		public static void main(String[] args)  {
		
		 ////Throw keyword 
			Exceptionkeywords obj= new Exceptionkeywords();
		  
		  // Use try and catch to handle throw exceptions
		  
		  obj.driving(19);// if I give age lessthan will through exception
		   ride(25);// will print weight is qualified
		   ride(26);// give exception saying weight is less to ride
			 //obj.driving(19);// if I give age morethan will ot an through exception// 
		
		  
		  
	//throws keyword
		   
		  
		   try {
			   obj.read();
			  } catch (FileNotFoundException e) 
		   
		        
		   {  e.printStackTrace();
			   System.out.println("filenotfoundmessage");
			   
			   try {
				obj.time();
			} catch (InterruptedException e1) {
				System.out.println("filenotfoundmessage");
				
				e1.printStackTrace();
			}
			   
			  }
		 
		}
}


		
		  
		
		




	
	
	
	
	
	
	
	
	
	


package practice;

public class Exceptionhandling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 100;
		//int b = a/0 ;  // for understanding
		//System.out.println(b);
//eg:1
		
		try   // in this block we will put all the lines which are failing with exception
		  {
		  int b=a/0;
		  }
		  catch(ArithmeticException e)   // correct code if required and put it in catch block or rest code of the program   
		  {
		   
		   int b=a/10;
		         System.out.println(b);
		  }
		  
		  System.out.println("is the correct output");
		  
//eg :2
int j =60;
//int k; = j/0;
//System.out.println(k);
	 
try
{   
	int k = j/0;
           }
catch(ArithmeticException e)
   {  
	int k = j/10;
	System.out.println(k);
                }
System.out.println("is the correct result");
//eg :3
try{  
    //code that may raise exception  
    //int data=100/0;  
 }catch(ArithmeticException e1)
{System.out.println(e1);
}  
 //rest code of the program   
 System.out.println("rest of the code...");  
 
 // Nullpointer exception//java.lang.NullPointerException
//eg:1  
 String n = null;
 
 //System.out.println(n.length());
 
try 
{   
	 
	System.out.println(n.length());
	
       }
catch(NullPointerException e)
{
	System.out.println("NullPointerException got caught");
	
}
	
 //eg:2
 String npe = null;
 
 try {
	 if ( npe.equals("hai") )
	 System.out.println("same");
	 
	 else
		 System.out.println("not equal");
                      }
 catch(NullPointerException e1 )
     {
	 System.out.println("NullPointerException caught");
     }
                    
 /*
    String ptr = null;
    
    
    // Checking if ptr.equals null or works fine. 
    try
    { 
        // This line of code throws NullPointerException 
        // because ptr is null 
        if (ptr.equals("gfg")) 
            System.out.print("Same"); 
        else 
            System.out.print("Not Same"); 
    } 
    catch(NullPointerException e) 
    { 
        System.out.print("NullPointerException Caught"); 
    } 
 */

 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
 
  
       
	}
}

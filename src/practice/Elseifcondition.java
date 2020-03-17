package practice;

public class Elseifcondition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//else if condition here when one of the condition( first condition is true) rest all will not get print
//until the condition is true it will get executed, when none of the conditions true it will go to else part.
		int a;
		a = 50;

	if (a<100)		//one condition //true condition rest all will not executed
	   {
		System.out.println("a is big number than 100");
			}
	
	else if (a<60) //two condition
	  {
		System.out.println("60 is a bigger than a");
	      }
	else if(a>100) // three condition
	     {
		System.out.println("a is less than 100");
	        }
	else if (a !=0) 
	     {
	       System.out.println("a is not equal to zero");	
	       }
	else
	{
		System.out.println("a is equal to zero");	
	   }
	
//second code// all the conditions false so else part will executed.
	int i;
	i= 50;
	if (i>100)
	{ 
	  System.out.println("line 38 will display");	
	      }
	else if(i==100)
	     {
		 System.out.println("print line 42");
	         }
	else if  (i>=100)
	    {
		System.out.println("print line 46");
	            }

	else
	      { 
		
		System.out.println(" a is 500");
	             }
	                     }
                             }
	
	
          
         






package practice;

public class Nestedifcondition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
// Nested if condition in this all the conditions has to be true to execute a block of code 
		
		int a,b,c,d;
	    a = 50; b =20; c= 30; d=40;
	    
	 if (a>d) //true
		 
	 {
	 if (d>b) //true
	  {
	   if (a>c) //true
	   {
		 if (c>b) //true
		 {
			 System.out.println("nested if condition true");
	 {
	 System.out.println("nested if condition false");
	} 
		 }
	         }
	               }
                        }

//eg 2

int nu , nu1, nu2;
nu = 100; nu1 = 200; nu2=300;
 if (nu<nu1 )
 System.out.println("nu is lesser");
 { 
 if(nu2>nu1)
 System.out.println("nu2 is grater");
 {
 if (nu1>nu)
 System.out.println("nu1 is grater");
 {
 System.out.println("netsred if got executed");	
   }
        }
                }
 {
 	System.out.println("netsted if not got executed");	
 }
   
            	}
                  }
 
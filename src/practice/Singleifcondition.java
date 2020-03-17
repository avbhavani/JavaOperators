package practice;

public class Singleifcondition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//3 types of if conditions
// 1.single if condition
 int a =100; int b =200;
 if (a<b) //true / block one code
 { int c;
  c = a+b;
  System.out.println("sum of a and b is:"+ c);
	 
 }
 
  System.out.println("single if condition not executed");
	
  if (b<a) //false / block 2 code
  {
	  System.out.println("  false condition ");
  }
  System.out.println("if condition is false");//when condition is false it will print this msg
  a= 10; b =10; int d= 20;
   
 if (a==b)//true/ block 3 code
 { int f = a+b;
 System.out.println("out put is sum of f&c:"+(f + d));
	 
 }
 System.out.println("print some of f is false");

	}

}

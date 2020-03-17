package practice;

public class Usermethods {
	static int x =25;
	
	 public int multiply()
	 {
	  // write code to multiply 2 number
	  
	  int a=10;    // local variables
	  int b=20;
	  
	  int mul= a*b;    // what is the output 200, dataype is going to be int
	  
	  return mul;
	 }

	 // methods with no return value
	 // Those methods are called void methods
	 
	 public void login()
	 
	 {
	  System.out.println("loginto the application");
	  System.out.println("logout the application");
	  
	 }
	 
	 
	 public static int sum()
	 {
	  int a =10;
	  int b=20;
	  int sum=a+b;
	  return sum;
	 }
	 
	 // if i want to call this method without an object i will add static modifier
	 public static void modify()
	 {
	  System.out.println("modify");
	  
	 }
	 
	 



	public static void main(String[] args) {
		// TODO Auto-generated method stub
	// calling the methods declared out side of main method
		//int a =10; 
		 //int c=a+x;
		  
		 // classname objectname= new classname();
		 
		 // created an object obj
	Usermethods obj= new Usermethods();
		 
		 // calling the multiply method
		 // when a method is returning a value, we need to store it in a varibale
		 
		 
		 int result= obj.multiply();   
		 
		 System.out.println(result);  
obj.login();

modify();
System.out.println(sum());
//System.out.println(sum);

	}

}

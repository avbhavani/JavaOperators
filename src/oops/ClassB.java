package oops;

public class ClassB extends ClassA{
	
	static int y = 300;
	
	public void sub()
	{
		int a = 10, b = 5;
		int c = a-b;
		System.out.println(c);
	          }
	public static void delete()
	{
	System.out.println("delete the char");	
	}
	
	public static void divide()
	{
		
		 int c1 = y/x;
		System.out.println(c1);
	          }
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// assinment // with parent class object we can able to call only parent class methods, 
		//if we call child class methods will give error and we can,t call with same obj name
		//ClassA obj1 = new ClassA(); // parent class object
		
		// or 
		  ClassA obj1 = new ClassB(); // refrering obj
		obj1.multiply();
	     login();
	  //////assinment
	  
	     ClassB obj = new ClassB(); // child class object	
		obj.sub();
		obj.sum();
	     obj.multiply();
	     
		login();
		open();
		divide();
		delete();
		
		
		

	}

}

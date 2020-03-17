package oops;

public class ClassA {
	static int x = 100;
	public void sum()
	{ 
		int a = 100;
		int b =200;
		int c = a+ b;
		
	System.out.println("result of a&b:"+ c);
		   
	                }
	public void multiply()
	{
	int i = 5, j = 2;
	int k = x*i;
	System.out.println("output of i&j"+ k);
	
	            }
	public static void login()
	
	{
		System.out.println("login into the page");
	          }
	
public static void open()
	
	{
		System.out.println("open the page");
	          }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassA obj = new ClassA();
		obj.sum();
		obj.multiply();
		login();
		open();

	}

}

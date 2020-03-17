package practice;

public class Parameters {

	
	public int multiply(int a, int b, int c ) // when we declare method along with parameters called "parameters"
	
	{
	int result;        //eg:1
	result = a*b*c;
	return result;
	
		}
	
	public double add(double m, double n)//eg:2
	{
		double output = m+n;
		return output;
	}
	public  static void login(String names)//eg:3
	{   
	System.out.println(names+ "ake");	
	}
	
// param assignment
	public static void add(int j,int k, int l,int m)//without object
	{
	  int optadd = j+k+l+m ;
	  
	  System.out.println("sum of optadd"+optadd);  
	}
	public static void division(int x,int y,int z,int o)//without object
	{
	  int optdivi = x/y;
	  int optdivi1 = z/o ;
	  System.out.println("divion of optadd"+optdivi);  
	  System.out.println("divion of optadd1"+optdivi1); 
	}
	
	
	public Object String (String str1,String str2)//without object
	{
		String food = str1+str2;
		return food;
	}
	
	
	public static void main(String[] args) {
		
		Parameters obj = new Parameters(); // instanciating obj// with return value
		obj.multiply(2, 5, 6); // passing value to parameter
		 int result = obj.multiply(2, 5, 6); // when we assign value to parameter after calling called "argument"
		 System.out.println(result);//output 60: eg1
		 
		 System.out.println("output of m&n"+obj.add(2.10,5.20 ));
		 
		 System.out.println(obj.multiply(2,5,6));//output 60: eg2
		 login("jasmi");
		 login("rishi");
		 login("venkat");
		add( 1,2,3,4);
		add( 2,2,2,2);
		division(10,5,20,2);
		division(30,10,40,2);
		 obj.String("orange", "juice");
		 obj.String("mango", "juice");
		 Object food = obj.String("orange", "juice");// how to pass parameters for methods with return value??
		 System.out.println(food);
	 
		 
	
		 
		 
		 
		 
		

	
	}

	private static void division(int i) {
		// TODO Auto-generated method stub
		
	}
}

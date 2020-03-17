package practice;

//  methods will return values
public class Usermethodsassin {
	static int x = 10;
	
	
	public int add () //with object
	{
		int a =20;
		int b =30;
		int add = a+b+x;
		
		return add;
	     }
	
	public static int division()//without object
	{
		int c = 40;
		int d =20;
		int division = c/d;
		return division;
	}
	

//  methods without  return values
	public void acess() // with object
	 {
		  System.out.println("open the eclipse");
		  System.out.println("compile the code");
		  
		 }


	public static void update() // without object
	 {
	  System.out.println("update");
	  
	 }
	 





	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//int a =20;
		//int c= a+x;
		
	//add// calling add method
		Usermethodsassin obj = new Usermethodsassin();
		int output = obj.add(); // called with obj for methods which return value
		System.out.println(output); 
		
  //division // calling divison method
		division(); //called without obj for methods which return value
		//System.out.println(division());// 
		obj.acess();// called with obj //called with obj for methods which don't return value
		update(); // called without obj// called without obj for methods which don't return value
		
		

	}

}

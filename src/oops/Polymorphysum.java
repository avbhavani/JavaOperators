package oops;

public class Polymorphysum {
	public  int sample(int a ,int b)
	{
	
	int c = a-b;
	return c;
	}
	/*public void sample()
	{
	double x = 5;
	double y = 2;
	double z = x*y;
	System.out.println("we can't print value with void methods"+z);
	}
	*/
	

	public static void main(String[] args) {
		
		Polymorphysum obj = new Polymorphysum();
		obj.sample(20, 10);
		//obj.sample();
		
		
		
		

	}

}

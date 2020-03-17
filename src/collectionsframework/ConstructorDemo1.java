package collectionsframework;

public class ConstructorDemo1 extends ConstructorDemo {
	 public ConstructorDemo1()
	 {
	  System.out.println("default constructor of child class");
	 }
	// i also want to call the constructor of parent class  - super keyword
	 public ConstructorDemo1(int i)
	 {
	  super(100);
	  System.out.println("parameter constructor of child class" + i);
	 }
	 
	 public ConstructorDemo1(int i, int x, int y)
	 {
	  super(10,20,30);
	 
	  System.out.println("parameter constructor of child class" + x +i);
	 }
	 
	  // TODO Auto-generated method stub

	  
	  // whenever we are using extends keyword and if an object is created with child class ,
	  //parent class constructor will be called first and than child class constructor will called (unlike methods, in methods child class will be called first then parent after creating a reference variable to parent class obj with child obj)
	  
	  // with same object we are calling 2 default constructors,parent class and child class
	  
	  // when an object is created in child class as default, constructors which are dafault in parent class and child class 
	  //will be clalled respectively
	  
	public static void main(String[] args) {
		ConstructorDemo1 obj = new ConstructorDemo1();  // default constrcutor
		  
		  ConstructorDemo1 obj2 = new ConstructorDemo1(50); 
		  ConstructorDemo1 obj3 = new ConstructorDemo1(10,20,30); // why here parent class value is different in output upon calling it should be 22?
		

	}

}

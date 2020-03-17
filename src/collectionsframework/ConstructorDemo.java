package collectionsframework;

public class ConstructorDemo {

	String name;
	int empid;
//Overloading of Constructors means method name should be same and parameters and variables should not be same
//Constructor name will always be same as classname
// Constructors will not have return statement
//default constructor - no parameters inside it
public  ConstructorDemo()
{
 System.out.println("default constructor");	
              }
// 
public  ConstructorDemo(int i)
{
 System.out.println(" constructor with one parameter");	
              }
// assign values to class variables
// 'this' keyword is used to assign values to class variables
public ConstructorDemo(String name, int empid) 
{
 // thiskeyword.classvariable=local parameter
 this.name=name;   // class variable name= TOM
 this.empid=empid;  // class variable empid =123
 System.out.println("assging values to class variable");
}

public ConstructorDemo(int i, int j, int k) {
	 //super(1,2,3);
	
	System.out.println("parameter constructor of parent class" + j+i*j);	
}
	public static void main(String[] args) {
//call a constructor by creating an obj
//calling default constructor
		 ConstructorDemo obj = new  ConstructorDemo();
		 
//call the construtor with params
		 ConstructorDemo obj1 = new  ConstructorDemo(100);
		 //System.out.println(obj1); it will give location of obj1
//values will get assgin to class variable
		 ConstructorDemo obj2 = new  ConstructorDemo("jam",01);
		 System.out.println(obj2.name+" "+obj2.empid);
		
		 ConstructorDemo obj3 = new  ConstructorDemo(1,2,3);
		 
		 
		 
	
		
		

	}

}

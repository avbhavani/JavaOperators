package oops;

public class ClassC extends ClassB {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassC obj2 = new ClassC();
		obj2.multiply();
		obj2.sub();
		obj2.sum();
		ClassA.login();//class name. Static method in case we are calling static method witout an obj
		open();
		ClassB.delete();
		ClassB.divide();
		

	}

}

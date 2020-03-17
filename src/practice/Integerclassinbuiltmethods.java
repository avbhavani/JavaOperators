package practice;

public class Integerclassinbuiltmethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 //Integer is not a Static class.
// method 1: compareTo() . The output of this method is going to be 
		  
		  // 0 : if 2 numbers are equal,
		  //1 if number 1 is greater than number 2
		  // -1 if  number 1 is less than number 2
		  // This method will compare 2 integer values
		  // These methods are part of Integer class of Java
		  // in order to call a method we need an object
		  // the object should point to Intger class
		/*Integer x=10;
		  int b=200;
		  
		  int output= x.compareTo(b);
		  
		  int output1= x.compareTo(9);
		  
		  int output2= x.compareTo(10);
		  
		  System.out.println(output);  // -1
		  
		  System.out.println(output1); // 1
		  System.out.println(output2); // 0
*/
		
	Integer in = 20;//creating object "in"//here we assiging value directly // we can do other way as well
	 int  k = 100; //assgining value to int variable
	 int result = in.compareTo(k);// storing value in int result variable 
	 int result1 = in.compareTo(50);
	 int result2 = in.compareTo(20);
	 System.out.println(result);// or // -1
	 System.out.println(in.compareTo(result1));// 1
	 System.out.println("resut of" + in.compareTo(20));//0
	 System.out.println(result2);//0
	 
// method 2//equals() : will return true or false 
	  
	  
	  System.out.println( in.equals(k));  // false
	  
	  System.out.println( in.equals(20)); // true

	 
	 
	}

}

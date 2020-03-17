package practice;

public class Mathinbuiltmethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//1. abs() method is part of Math class// abs(int a);
		// classname.methodname();//syntax: classname.a();
		  
		  double d= - 1.234;
		  int b = -10;
		  float a = - 1.00f;
		  //Integer c = -8;
System.out.println(Math.abs(d));
System.out.println(Math.abs(-9));
System.out.println(Math.abs(b));
System.out.println(Math.abs(a));


// 2.round() --> math class
// it rounds of the decimal value  to the nearest integer value
double m = 1.202;
System.out.println( Math.round(1.55));//2 
System.out.println( Math.round(2.19));//2
System.out.println( Math.round(m));//1

// 3.method// this method will comapre the 2 integers and whichever is minimum value ,, it will return that
//min(int a,int b);
int h=Math.min(10, 100);
System.out.println(Math.min(10.10 ,20.10));//10.1
System.out.println(h);//10
//4.Max method// this method will comapre the 2 integers and whichever is minimum value ,, it will return that
//max(int a,int b);
int j=Math.max(10, 100);
System.out.println(Math.max(10.10 ,20.10));
System.out.println(j);//10
//System.out.println(Math.random(j));// have a doubt about this

//4.Random// will just return some randomvalue
System.out.println(Math.random());
 
		  
		  
		  
	


	}

}

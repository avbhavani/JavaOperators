package practice;

public class Relationalexpression {

	public static void main(String[] args) {
//output of relational expression is Boolean
//==,!=,>,>=,<,<=
//equal to operator ==
		int a =10;
		int b =10;
		Boolean  result = a==b;
		a =20;
		b =30;
		System.out.println(result);
		System.out.println("result of a and b:"+(a==b));
//not equal to operator !=
		int c = 100; //or int c = 200;  
		int d = 100; // or int d = 100
		Boolean cd = c!=d;
		System.out.println(cd); //false
		System.out.println("out of c&d is:"+(c!=d));
// grater than operator >
		System.out.println(a>b);
//grater than or equal to >=  // one of the condition have to be true for true result
		int i = 100; //or i =200  
		int j = 100; // or j = 100
		Boolean ij = i >= j;
		System.out.println(ij);//true
		i =200;
		j = 100;
		System.out.println(ij);//true
	    i = 50;
	    j = 100;
        System.out.println("out put of ij is :"+(i>=j));//false
// less than operator <
		System.out.println(i<j);
//less than or equal to operator >= 
		System.out.println(i<=j);//true
		i = 15;
		j = 9;
		System.out.println("the out of lesstahn or equal to ope is:"+ (i<=j));//false
		
		
		

	}

}

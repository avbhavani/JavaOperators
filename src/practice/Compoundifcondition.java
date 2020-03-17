package practice;

public class Compoundifcondition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//compound if condition
// by using logical operators ( or,and, not(||,&&,!))when we execute block of code called compound if condition
	 
 int k,l,m;  // compound code 1
 k =10; l=20; m = 30;
 
 if ( (k<l)&& (l==m))// false bcz true && false
 {
 System.out.println("the out of compound condition true");
 }
 System.out.println("the out of compound condition false");
 
 // compound code 2
 if ((l>m)&& (m>l));
 { int klm = k+l+m;
 System.out.println("sum of klm and true condition:"+ (klm+m));
 
 // if compound condition with or(||) operator
 
 if (( k>l ) || (l<m))//true / code one 
 { int n = 40;
	System.out.println("result of or operator:"+n);
 }
 
 // code 2 with operator or
 if (( k>l ) || (l==m))//false / code two 
 { int n = 40;
	System.out.println("result of code 2 :"+n);	 
 }
System.out.println("false result ");

// not operator with compound if
if (( k>l ) || (l<m))//false / code two 
{ int o = 40;
	System.out.println("result of code 2 :"+ o);	 
}
System.out.println("false result ");


	}

}
	}
 
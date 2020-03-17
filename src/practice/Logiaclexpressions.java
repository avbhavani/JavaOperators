package practice;

public class Logiaclexpressions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// and operator 
	int x = 40;
	int y = 30;
	int z = 20;
	Boolean xyz = (x>y)&&(x>z);//true
	Boolean result = (x<y)&&(y<z);//false
	System.out.println(xyz);
	System.out.println(result);
	System.out.println("the result of x y z is:"+ (xyz)+(result));
	
// or operator ||...
// if one of the expression is true result will be true, if both are false result will be false
// it is opposite of and operator
	int m = 600;
	int n = 700;
	int o = 800;
	Boolean mno = (m>o) || (m<o);//true
	Boolean mno1 = (m<o) || (m<o);//true
	System.out.println(mno);//true
	System.out.println(mno1);//true
	System.out.println((m>n)||(n>o));//false
	System.out.println("the result of mno&mno1:"+(mno)+(mno1));
// Not operator  !  - if the original value of the expression is true, and if we use ! operator on it, 
//the output will be changed to False
	Boolean notop = m > n;// false
	Boolean notop1 = !(m>n); //true
	System.out.println(notop);
	System.out.println(notop1);
	System.out.println("result of not ope:"+ !(o<n) + !(n<o)+(notop)+(notop1));
	
	
	
	
	
	
	

	
	
	
	
	


	}

}

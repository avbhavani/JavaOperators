package practice;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//1.method one of creating an array
		String arry1[];//declaring array name//datatype arrayname[] //step 1
		arry1 = new String[3];//providing length of an array// step 2
		arry1[0]="java"; //Assigning values to array
		arry1[1]="c++";
		arry1[2]="php";
	System.out.println(arry1[1]);
		String arry[];
		arry = new String[2];
		arry[0] = "Hi";
		arry[1] = "welcome";
	System.out.println(arry[0]);
		
//2. method of creating array
	String[]arry2 = new String[2];// here we will declare array name and array length same time 
	arry2[0]="selenim" ;
	arry2[1]="java";
System.out.println(arry2[0]);
String[]arry3 = new String [2];
arry3[0]= "26";
arry3[1]= "27";
System.out.println(arry3[0]);

//3.method of creating array //in this we will declaring array and array length will be in one condition
String[]arr4 = {"he", "she","me","like","you"};// one
System.out.println(arr4[1]);
for(int i= 0;i<=4; i++)
     { System.out.println(arr4[i]);//it will print all assigned values in same array
     
         }

     String[]arr5 = { "ja", "ca","pa","ma","ba","ta"};//two
     for(int j=0;j<=5;j++)
     {
    	System.out.println(arr5[j]);// System.out.println("combination of two arrays:"+((arr5[j]+arr4[i])));can we combine two arrays
           }
     
 
	    }
               }
                         

	                    



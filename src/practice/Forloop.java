package practice;

public class Forloop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//for loop step will be executed until range has met
		
	for(int i=1; i<=15; i++ ) //Increment by one value with for
	
	{
		System.out.println(i);// will execute until the range has met
	}
System.out.println("executing next lines of code");// if range didn't met or rage has done it will print this

//second code increment by 2 numbers (j+=2)

for (int j = 2; j<=20;j+=2)
	
    {System.out.println(j);
	
               }
System.out.println("execute after line 23");

// third one with decrement operator

for (int k =10; k>=1;k--)
  {
	System.out.println(k);
	   }
System.out.println("execute after line 31");

// fourth scenario 

for (int m = 20; m>=2; m-=2)// here if u give m>=1 also result will be same
    {  
	
	System.out.println(m);
               }
System.out.println("execute after line 40");
	}

}

package practice;

public class InbuiltStringmethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
////ASCII values //should remember
		  // A to Z --- 65 to 90
		  // a to z---- 97 to 122
		  //0 to 9 -- 48 to 57
//inbuilt methods applicable to string//String is a static class
//1.comapre To() method:this method will compare two strings and will return out 
//as +ve,-ve,0 for equal.
		
	String str1 = "SELENIUM"; // it will calculate number according to ASCII value
	String str2 = "class"; 
	String str3 = "SELENIUM";
//We call a method using an Object
// whenver we write a varibale name along with a inbulit Java class than that variable will called as an Object
// objectname 
//1st example +ve/ grater than 	
 int result = str1.compareTo(str2);// -16 hence str2 is grater than str1 as per ASCII
 System.out.println(result);
 //2nd example 0 (equal) 
 int result1 = str1.compareTo(str3);
 System.out.println(result1); // will give 0 as equal result
 //or
 System.out.println("result of str1&str2:"+str1.compareTo(str3));
 //3rd example -ve/ lessthan
 String str4 = "Training";
 System.out.println("result of str4&str3 is"+str3.compareTo(str4));//-ve value
 
 ////2. equals() --- > this methods checks if 2 strings are equal or not
 // output is going to be boolean values true or false 
 Boolean result3 = str1.equals(str2);// example 1
 System.out.println(result3);
 //or
 System.out.println("Boolean result of str1&str2 is"+str1.equals(str2));//false
 System.out.println("result of str1&str3"+str1.equals(str3));//true//example 2
 
//3.concat() : it will just join 2 strings. output is going to be a String
  String s = "mercury login";
  System.out.println(s.concat("testcase passed"));// here we are giving value directly in print statement 
  //instead assging seperately
  
//4.charAT() : it will return the character at that particular index value mentioned by the user
 // it will return a character
  char c = str1.charAt(3);
  System.out.println(c);//here it will print 3rd index of str1 is E (SELENIUM)
  //or
  System.out.println(str1.charAt(3));

  //5.equalsIgnoreCase()
//it will first ignore the cases of the strings an just compare 2 strings and check if they are qual or not. 
// the output is going to be true or false
  Boolean E = str1.equalsIgnoreCase(str3);
  System.out.println(E);//true
  //or
  System.out.println("result of str1&4"+str1.equalsIgnoreCase(str4));//false example 2
  
  
  //6. toUppercase() : converts a lower case string into an uppercase String
  String str5 = "hai";
  System.out.println("covert to uppercase"+ str5.toUpperCase());// it will show HAI
  
  
  //7.toUppercase() : converts a lower case string into an uppercase String
  String str6 = "HAPPY";
  System.out.println("convert to lowercase"+str6.toLowerCase());//it will show happy
  
  //8.method trim() : this method will trim spaces from both sides of the string
   String str7 = "        registration             ";//with space
   System.out.println(str7);//or/System.out.println("trimming sides"  + str7.trim());
   String op = str7.trim();//
   System.out.println(op);//will print without space
   
  // //9. method :substring(startIndex value), beginindex - endindex
   String str8 = "lets learn java"; 
   System.out.println("output of"+str8.substring(2));// ts learn java
   
   //10. method :substring(startIndex value, end Index value), end index value should be given as n+1 or beginindex minus(-) endindex
   String x2= "Mercury page registration";
   System.out.println(x2);
   String x3= x2.substring(5, 25);//ry page registration
   System.out.println(x3);
   

  // 11.startsWith(), returns true if the prefix is same else returns false if prefix of methoned string are different//boolean result

   String pre = "Jasmi hi";
   System.out.println(pre.startsWith("Jasmi"));

  //12. Assignment: endsWith()
   String pre1 = "Jasmi";
   System.out.println(pre1.endsWith("i"));
 //13. method length()
   String le = "welcome";
   System.out.println(le.length());
 
   //14. method replace()
   
   String le1 = "weicome";
   System.out.println(le1.replace('i','l'));
   System.out.println(le1.replace('i','l')+le1.replace('e','o') );
   
  //15.contains
   String le2 = "   welcome to java session   ";
   System.out.println(le2.contains("to") );
   System.out.println(le2.contains("java"));
   
   /*
   System.out.println(Character.isLowerCase('a'));
   System.out.println(Character.isUpperCase('a'));*/
   
  //16. replace all// syntax: replaceAll("\\s+", "");//we need to remember here in space removing parameter we should keep double quotes 
   //very close else it will not remove space
   // we are using this method to remove leading and trailed spaces and also for replacing words or chars with another wordor char
   //syntax replaceall( String actual, String replace);
   String sr = "    replace all method         ";//eg 1
   sr = sr.replaceAll("\\s+", "");
   System.out.println( sr);
  
   
   String str = "      hello all welcome      "; // eg 
   
   // Call the replaceAll() method 
   str = str.replaceAll("\\s+", ""); 
  
   System.out.println(str); 
 // eg:3  
  String rpa = "slelenium is easy to learn";
  System.out.println(rpa.replaceAll("is", "was"));
 // eg:4
  System.out.println(rpa.replaceAll("s", "j"));
  
  
   
  
  
 
  
  
  

 
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  


	
		
	
		
		
		
		
		
		
		
		
		
		

	}

}

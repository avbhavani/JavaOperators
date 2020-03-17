package practice;

public class Charecterclassinbuiltmethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//1. isLetter()
//Determines whether the specified char value is a letter.

   
		System.out.println(Character.isLetterOrDigit('a'));//true
		System.out.println(Character.isLetter('1'));//false
//2. isDigit //This method returns true, if the passed character is really a digit.
		
		System.out.println(Character.isDigit('b'));//false 
		System.out.println(Character.isDigit('2'));//true
		
//3.isUppercase//This method determines whether the specified char value is uppercase.
//This method returns true, if the passed character is really an uppercase.
		
		System.out.println(Character.isUpperCase('c'));//false
		System.out.println(Character.isUpperCase('M'));//true
		  System.out.println(Character.isUpperCase('\t'));//false
//4.isLowercase//This method determines whether the specified char value is Lowercase.
		//This method returns true, if the passed character is really an lowercase.
			
			System.out.println(Character.isLowerCase('r'));//true
			System.out.println(Character.isLowerCase('B'));//false
			  System.out.println(Character.isLowerCase('\b'));//false
			  
/*String str = "today is monday";
System.out.println(str.substring(9, 15));
str = str.replaceAll("\\s+", "");
System.out.println(str);*/
			  
			  
	}
}
	


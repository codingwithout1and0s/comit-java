package org.comit.course._05_Strings;

public class Strings {

	public static void main(String[] args) {

		//A string is a data structure that holds a sequence of characters
				//Strings are immutable - cannot change
				
				char[] chars = {'J', 'A', 'V', 'A',};
				String str0 = new String(chars);
				System.out.println(str0);
				
				
				
				//Declare and initialize a String
				
				String str1 = "ComIT"; //Preferred way
				String str2 = new String("ComIT");
				
				//String size or length
				//We use the lengt() method.
				
				System.out.println(str1.length());
				
				//String concatenation - joining strings
				
				String str3 = "Hello";
				String str4 = "ComIT";
				String str5 = str3 + " " + str4;
				
				String strConcat = str3.concat(" ").concat(str2);
				
				System.out.println(str5);
				System.out.println(strConcat);
				
				//Grab a character from a String
				
				String str6 = "Hello";
				
				System.out.println(str6.charAt(0));
				
				//Check if a String is a substring of another String
				System.out.println(str6.contains("ell"));
				System.out.println(str6.contains("l"));
				
				//String comparison
				
				String str7 = "hello";
				System.out.println(str6.equals(str7));
				System.out.println(str6.equalsIgnoreCase(str7));
				
				//String replace
				
				System.out.println(str7.replace("ell", "aplen"));

	}

}

package org.comit.course._01_variables;

public class Variables {

	public static void main(String[] args) {
		
		//Single line comment
		/*
		 Multi-line comment
		 * */
		
		//Code must end with ;
		
		//Variables
		
		//Integer Variables
		
		//int is declaration. next is name. = value (initialization)
		int num1 = 4; //Ints are default
		
		long num2 = 2_147_483_648L; //to use a long in Java must append "L" at end of value // _ can be used for read ints easier
		
		byte num3 = 100;
		
		short num4 = 30_000;
		
		//We print out data in the console with: System.out.println();
		System.out.println("The number is " + num1);
		
		//Decimal Variables
		float num5 = 4.52f; //Append "F" at end of dec to accept the var
		
		double num6 = 5.14; //Default var for decimals
		
		//boolean variable - true or false
		
		boolean boo1 = false;
		boolean boo2 = true;
		System.out.println("The booleanis: " + boo1);
		
		//Text variables
		char character1 = 'A';
		System.out.println("The booleanis: " + character1);
		
		String str1 = "Java is nice";
		System.out.println("The string is: " + str1);
		
		/*Java has 2 set of variables
		 1. Primitive
		 2. Non-Primitives (Reference Types)
		*/
		
		String str2 = new String("Coffee");
		String str3 = new String("Cofee");
		
		System.out.println("str2: " + str2);
		System.out.println("str3: " + str3);
		
		int num7 = 100;
		int num8 = 100;
		
		if  (num7  ==  num8) { // == is comparison. = is assignment
			System.out.println("Equal");
		} else {
			System.out.println("Different");
		}
	
	if  (str2  ==  str3) { // == is comparison. = is assignment
		System.out.println("Equal");
	} else {
		System.out.println("Different");
	}
			

	// == operation should only be used for/with primitive data types
	// won't work for reference 
	
	//Primitives are faster but don't reuse memory
	//Non-Primitives are slower but can reuse memory
	
	//Compare reference type
	if  (str2.equals(str3)) {
		System.out.println("Equal");
	} else {
		System.out.println("Different");
	}

	}

}

package org.comit.course._02_operators;

public class _01_Arithmetic {

	public static void main(String[] args) {

		int a = 8;
		int b = 3;
		int c = 5;
		int d = 11;
		
		int sum = a + b; //Addition Operator
		int sub = a - b; //Subtraction
		double div = (double) a / b;  //Division //In Java, (double)a will treat a as a double.
		int mul = a * b; //Multiplication
		
		int mod = a %b; //returns division reminder
		
		System.out.println("Addition: "+ sum);
		System.out.println("Substraction:" + sub);
		System.out.println("Division: "+ div);
		System.out.println("Multiplication: " + mul);
		System.out.println("Modulus: " + mod);
		
		int exp = (a + c) * c / d;
				
		System.out.println(exp);

	}

}

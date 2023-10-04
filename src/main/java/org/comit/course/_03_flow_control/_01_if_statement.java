package org.comit.course._03_flow_control;

public class _01_if_statement {

	public static void main(String[] args) {

		int a = 28;
		int b = 30;
		
		if (a > b) {
			/*The If block runs if the condition evaluates to true*/
			System.out.println("a is greater than b");
		} else if (b < a) {
			/*The Else block runs if the condition evaluates to false*/
			System.out.println("b is greater than a");
		}
		else  {
			System.out.println("b is equal to a");
		}
		
		//Nested IF
		
		int c = 25;
		
		if (a > b) {
		            if (a < c ) {
		            	System.out.println("a is great than b but less than c");
		            }
		}
		
		//Ternary Operator
		
		String str = "";
		a = 10;
		b = 15; 
		
		if(a  > b) {
			str = "a greater than b";
		} else {
			str = "b is greater than a";
		}
		
		System.out.println(str);
		
		// (condition)? (return if true): (return if false)
		str = ( a > b) ? "a greater than b" : "b greater than a";
		System.out.println(str);

	}

}

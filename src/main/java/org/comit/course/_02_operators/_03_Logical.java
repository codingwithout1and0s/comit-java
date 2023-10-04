package org.comit.course._02_operators;

public class _03_Logical {

	public static void main(String[] args) {

		boolean a = true;
		boolean b =  true;
		
		boolean and = a && b; // AND - returns if both operands are true
		boolean or = a || b; // OR - returns true if any operand is true
		boolean not = !a; // NOT - returns the reverse
		
		System.out.println("AND"+ and)  ;
		System.out.println("OR" + or) ;
		System.out.println("NOT"+ not);

	}

}

package org.comit.course._03_flow_control;

public class _03_loops {

	public static void main(String[] args) {

		//A While loop executes a block of code while a condition is true.
		
		int i = 0;
		
		//		while (i <= 10) {
		//			System.out.println(i);
		//			i++; // Will get an infinite loop if we don't increment "i"
		//		}
		
		do {
			System.out.println(i);
			i++; 
		} while (i <= 10) ;

	}

}

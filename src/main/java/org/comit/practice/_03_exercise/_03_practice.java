package org.comit.practice._03_exercise;

public class _03_practice {

	public static void main(String[] args) {
		
		//1. 
		int num = 48;
		
		if (num > 0) {
			System.out.println("Num is a postiive number.");
		} else {
					System.out.println("Number is a negative number.");
		}
		
		//2.
		
		int gNum1 = 48;
		int gNum2= 12;
		int gNum3 = 37;
	
		if (gNum1 > gNum2 && gNum1 > gNum3) {
			System.out.println("gNum1 is the greastest number.");
		} else if (gNum2 > gNum1 && gNum2 > gNum3) {
			System.out.println("gNum2 is the greatest number");
		} else if (gNum3 > gNum1 && gNum3 > gNum2 ){
			System.out.println("gNum3 is the greatest number");
		}
		
		//3.
		
		int yrNum = 2001;
		
		if (yrNum % 4 == 0) {
			System.out.println("This is a leap year");
		} else {
			System.out.println("This is a not leap year");
		}

	}

}

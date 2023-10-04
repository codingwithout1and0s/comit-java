package org.comit.course._03_flow_control;

public class _04_for_loop {
	public static void main(String[] args) {
		
		//Classic For  Loop
		for (int j=0;  j <= 10; j++) {
			System.out.println(j);
		}
		
		//Enhanced For Loop
		//since Java 5
		//used to traverse (loop over), collections of elements like arrays.
		
		int [] array = {8, 3, 5, 6, 9 };
		
		for (int num: array) {
			System.out.println(num);
		}
		
	}

}

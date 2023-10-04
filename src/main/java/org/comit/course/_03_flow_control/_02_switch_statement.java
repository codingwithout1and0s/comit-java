package org.comit.course._03_flow_control;

public class _02_switch_statement {

	public static void main(String[] args) {

		//Switch Statement
				//Switch statements can except multiple case even on single case but cannot take ranges
				int day = 8;
				
				//Classic Switch Statement
				switch (day) {
					case 1: System.out.println("Today is Monday");
						break;
					case 2: System.out.println("Today is Tuesday");
						break;
					case 3: System.out.println("Today is Wednesday");
						break;
					default: System.out.println("Invalid code");
				}
				
				//Simplified Switch Statement
				switch (day) {
					case 1,8,9 -> { System.out.println("Today is Monday"); }
					case 2 -> {System.out.println("Today is Tuesday");}
					case 3 -> {System.out.println("Today is Wednesday");}
					default -> {System.out.println("Invalid code");}
				}
				
				
				//Assigning values with the Simplified Switch Statement
				String name = switch (day) {
					case 1,8,9 -> "Today is Monday"; 
					case 2 -> "Today is Tuesday";
					case 3 -> "Today is Wednesday";
					default -> "Invalid code";
				};
				System.out.println(name);

	}

}

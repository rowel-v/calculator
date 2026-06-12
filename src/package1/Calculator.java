package package1;

import java.util.Scanner;

public class Calculator {
	
	int operand1;
	int operand2;
	Operator operator;
	
	private Calculator(Operator operator) {
		this.operator = operator;
	}
	
	public static Calculator of(Operator operator) {	
		return switch (operator) {
			case ADDITION -> new Calculator(Operator.ADDITION);
			case SUBTRACTION -> new Calculator(Operator.SUBTRACTION);
			case MULTIPLICATION -> new Calculator(Operator.MULTIPLICATION);
			case DIVISION -> new Calculator(Operator.DIVISION);
			case EXPONENTATION -> new Calculator(Operator.EXPONENTATION);
		};
		
	}
	
	public int calculate(int x, int y) {
		return switch (operator) {
			case ADDITION -> Math.addExact(x, y);
			case SUBTRACTION -> Math.subtractExact(x, y);
			case MULTIPLICATION -> x * y;
			case DIVISION -> Math.divideExact(x, y);
			case EXPONENTATION -> (int) Math.pow(x, y);
		};
	}
	
	
	Scanner sc = new Scanner(System.in);
	
	public int input() {
		
		boolean valid = false;
		int x = 0;
		
		do {
			try {
				System.out.print("Enter a num: ");
				x = sc.nextInt();
				valid = true;
			} catch (Exception e) {
				sc.nextLine();
				System.out.println("Invalid input.\n");
			}
		} while (!valid);
		return x;
	}
	
	
	

}

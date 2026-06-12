package package1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Calculator addition = Calculator.of(Operator.MULTIPLICATION);
		
		int x = addition.input();
		int y = addition.input();
		
		System.out.println(addition.calculate(x, y));
		
		
		
	}

}

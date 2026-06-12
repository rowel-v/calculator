package package1;

public class Main {

	public static void main(String[] args) {
		
		Calculator addition = Calculator.of(Operator.EXPONENTATION);
		
		int x = addition.input();
		int y = addition.input();
		
		System.out.println(addition.calculate(x, y));
		
		
		
	}

}

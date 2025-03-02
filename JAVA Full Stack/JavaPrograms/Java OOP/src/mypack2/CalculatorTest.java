package mypack2;

import mypack1.Calculator;

public class CalculatorTest {

	public static void main(String[] args) {
		Calculator calc = new Calculator();
		System.out.println("Sum = "+calc.add(50, 40));
		System.out.println("Product = "+calc.multiply(50, 40));
	}

}

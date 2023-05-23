package org.ncu.lab.Calculator;

public class SubtractionService implements MathService {
	@Override
	public void operate(int x, int y) {
		double sub = x-y;
		System.out.println("Result: "+ sub);
	}
}

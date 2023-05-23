package org.ncu.lab.Calculator;

public class AdditionService implements MathService {
	@Override
	public void operate(int x, int y) {
		double add = x+y;
		System.out.println("Result: "+ add);
	}
}

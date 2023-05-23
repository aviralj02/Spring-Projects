package org.ncu.lab.Calculator;

public class MultiplicationService implements MathService {
	@Override
	public void operate(int x, int y) {
		double mul = x*y;
		System.out.println("Result: "+ mul);
	}
}

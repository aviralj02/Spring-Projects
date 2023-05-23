package org.ncu.lab.Calculator;

public class DivisionService implements MathService {
	@Override
	public void operate(int x, int y) {
		double div = x/y;
		System.out.println("Result: "+ div);
	}
}

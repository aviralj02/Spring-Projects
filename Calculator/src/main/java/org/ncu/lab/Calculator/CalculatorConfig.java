package org.ncu.lab.Calculator;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CalculatorConfig {
	// Java Based Configuration
	
	@Bean
	Calculator calc() {
		Calculator c = new Calculator();
		c.setAdd(add());
		c.setSub(sub());
		c.setMul(mul());
		c.setDiv(div());
		return c;
	}
	
	@Bean
	MathService add() {
		return new AdditionService();
	}
	@Bean
	MathService sub() {
		return new SubtractionService();
	}
	@Bean
	MathService mul() {
		return new MultiplicationService();
	}
	@Bean
	MathService div() {
		return new DivisionService();
	}
}

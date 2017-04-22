package com.xultaeculcis.codingChallenges.DesignPatterns.decorator;

/*
 * @author Sumith Puri
 */
public class Chicken extends ToppingDecorator {

	Pizza pizza;
	
	public Chicken(Pizza pizza) {
		
		this.pizza = pizza;
	}
	
	@Override
	public String getDescription() {
		
		return pizza.getDescription() + ", Chicken";
	}

	@Override
	public double cost() {
		
		return 0.45 + pizza.cost();
	}

	
}

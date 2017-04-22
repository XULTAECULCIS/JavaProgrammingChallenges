package com.xultaeculcis.codingChallenges.DesignPatterns.decorator;

/*
 * @author Sumith Puri
 */
public class Onion extends ToppingDecorator {

	Pizza pizza;
	
	public Onion(Pizza pizza) {
		
		this.pizza = pizza;
	}
	
	@Override
	public String getDescription() {
		
		return pizza.getDescription() + ", Onion";
	}

	@Override
	public double cost() {
		
		return (0.15 + pizza.cost());
	}

	
}

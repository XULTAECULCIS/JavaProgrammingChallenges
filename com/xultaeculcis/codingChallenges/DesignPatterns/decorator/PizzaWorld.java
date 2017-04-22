package com.xultaeculcis.codingChallenges.DesignPatterns.decorator;

/*
 * @author Sumith Puri
 */
public class PizzaWorld {

	public static void main(String args[]) {
		
		Pizza pizza = new Hawaiian("Veg Exotica");
		pizza = new Mushroom(pizza);
		pizza = new Mushroom(pizza);
		pizza = new Onion(pizza);
		
		Pizza pizza1 = new Italian("Non-Veg Supreme");
		pizza1 = new Chicken(pizza1);
		pizza1 = new Chicken(pizza1);
		pizza1 = new Onion(pizza1);
		pizza1 = new Onion(pizza1);
		
		System.out.println("Pizza World");
		System.out.println("===========");
		System.out.println("");
		System.out.println(pizza.getDescription() + " " + pizza.cost());
		System.out.println(pizza1.getDescription() + " " + pizza1.cost());
	}
}

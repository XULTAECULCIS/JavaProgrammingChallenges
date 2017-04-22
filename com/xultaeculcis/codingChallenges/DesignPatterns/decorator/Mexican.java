package com.xultaeculcis.codingChallenges.DesignPatterns.decorator;

/*
 * @author Sumith Puri
 */
public class Mexican extends Pizza {

	public Mexican(String description) {
		this.description = description  + ", Mexican";
	}
	
	@Override
	public double cost() {
		
		return 1.25;
	}

}

package com.xultaeculcis.codingChallenges.DesignPatterns.decorator;

/*
 * @author Sumith Puri
 */
public class Hawaiian extends Pizza {

	public Hawaiian(String description) {
		this.description = description + ", Hawaiian";
	}
	
	@Override
	public double cost() {
		
		return 1.50;
	}

}

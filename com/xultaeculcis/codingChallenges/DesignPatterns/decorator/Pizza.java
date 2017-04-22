package com.xultaeculcis.codingChallenges.DesignPatterns.decorator;

/*
 * @author Sumith Puri
 */
public abstract class Pizza {
	
	protected String description = null;
	
	public String getDescription() {
		return description;
	}

	public abstract double cost();
}

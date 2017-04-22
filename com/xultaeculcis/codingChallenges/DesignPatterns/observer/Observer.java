package com.xultaeculcis.codingChallenges.DesignPatterns.observer;

/**
 * Created by sicluceatlux on 2017-04-22.
 */
public interface Observer {
	
	public void update(String stockSymbol, Float stockValue, Integer stockUnits);
    
}

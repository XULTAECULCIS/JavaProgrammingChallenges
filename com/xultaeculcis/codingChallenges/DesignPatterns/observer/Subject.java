package com.xultaeculcis.codingChallenges.DesignPatterns.observer;

/**
 * Created by sicluceatlux on 2017-04-22.
 */
public interface Subject {

	public void addObserver(Observer o);
	public void removeObserver(Observer o);
	public void notifyObservers();
}

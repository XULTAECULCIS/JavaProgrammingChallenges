package com.xultaeculcis.codingChallenges.DesignPatterns.singleton;

/**
 * Created by sicluceatlux on 2017-04-22.
 */
public class DoubleLockingSingleton {
	private static DoubleLockingSingleton productionHouse = null;
	
	private DoubleLockingSingleton() {
	}
	
	public static DoubleLockingSingleton getInstance() {
		if (productionHouse == null) {
			synchronized (DoubleLockingSingleton.class) {
				if (productionHouse == null) {
					productionHouse = new DoubleLockingSingleton();
				}
			}
		}
		return productionHouse;
	}
}
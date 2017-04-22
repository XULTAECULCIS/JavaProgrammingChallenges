package com.xultaeculcis.codingChallenges.DesignPatterns.factory.simple;

/*
 * @author Sumith Puri
 */
public class SystemManager {
	
	public static void main(String args[]) {
		
		// Either instantiate here, or inject instance in a constructor
		SystemFactory systemFactory = new SystemFactory();
		
		System system = systemFactory.createSystem("MAC");
		
		system.provision();
		system.update();
		system.restart();
	}

}

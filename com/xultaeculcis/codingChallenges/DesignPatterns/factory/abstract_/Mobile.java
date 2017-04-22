package com.xultaeculcis.codingChallenges.DesignPatterns.factory.abstract_;

/*
 * @author Sumith Puri
 */
public abstract class Mobile {

	public void chassis() {
		System.out.println("Default Chassis Included.");
	}
	
	public void experience() {
		System.out.println("Default Experience Hardware.");
	}
	
	public void integrity() {
		System.out.println("Default Integrity Check.");
	}
	
	public void box() {
		System.out.println("Default Box Packaging.");
	}
	
	public void software() {
		System.out.println("Default Software Bundled.");	
	}
}

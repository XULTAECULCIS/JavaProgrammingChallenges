package com.xultaeculcis.codingChallenges.DesignPatterns.singleton;

/**
 * Created by sicluceatlux on 2017-04-22.
 */
public class DoubleLockingSingletonTest extends Thread{
	public void run() {
		getProductionHouse();
	}
	private void getProductionHouse() {
		DoubleLockingSingleton doubleLockingSingleton = DoubleLockingSingleton.getInstance();
		System.out.println(doubleLockingSingleton.toString());
	}
	public static void main(String args[]) {
		DoubleLockingSingletonTest thread01 = new DoubleLockingSingletonTest();
		thread01.start();
		DoubleLockingSingletonTest thread02 = new DoubleLockingSingletonTest();
		thread02.start();
	}
	
}

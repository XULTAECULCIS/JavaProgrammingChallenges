package com.xultaeculcis.codingChallenges.DesignPatterns.singleton;

/**
 * Created by sicluceatlux on 2017-04-22.
 */
public class Singleton {
	private static Singleton instance;
	
	private static Singleton getInstance(){
		if(instance == null){
			instance = new Singleton();
		}
		return instance;
	}
	
	public static void main(String[] args){
		Singleton s1 = Singleton.getInstance();
		Singleton s2 = Singleton.getInstance();
		if(s1 == s2){
			System.out.println("mamy to samo...");
		}
	}
}

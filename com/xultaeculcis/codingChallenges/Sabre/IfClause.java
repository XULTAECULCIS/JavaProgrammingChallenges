package com.xultaeculcis.codingChallenges.Sabre;

/**
 * Created by sicluceatlux on 2017-04-21.
 */
public class IfClause {
	static int i = 0;
	
	public static int increment() { return i++;}
	
	public static void main(String[] args) {
		if((increment() || increment()) || increment()){
			i++;
		}
		System.out.println(i);
	}
}
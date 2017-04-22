package com.xultaeculcis.codingChallenges.Sabre;

/**
 * Created by sicluceatlux on 2017-04-21.
 */
public class TryFinally {
	public static void main(String[] args) {
		
		System.out.println(getValue());
	}
	
	public static String getValue() {
		try {
			return "try";
		}
		finally {
			return "fin";
		}
	}
}

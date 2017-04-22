package com.xultaeculcis.codingChallenges.Sabre;

/**
 * Created by sicluceatlux on 2017-04-21.
 */
public class ThrowingErrors {
	public static void main(String[] args) {
		try {
			throwError();
			System.out.println("A");
		}
		catch (Exception ex) {
			System.out.println("B");
		}
		finally {
			System.out.println("C");
		}
		System.out.println("D");
	}
	public static void throwError(){
		throw new Error("Error occurred!");
	}
}
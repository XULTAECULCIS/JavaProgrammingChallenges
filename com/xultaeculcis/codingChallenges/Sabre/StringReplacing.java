package com.xultaeculcis.codingChallenges.Sabre;

/**
 * Created by sicluceatlux on 2017-04-21.
 */
public class StringReplacing {
	public static void main(String[] args) {
		String string = "I can do this!";
		string.replace("can","cannot");
		string.replaceAll("can.*","will");
		System.out.println(string);
	}
}

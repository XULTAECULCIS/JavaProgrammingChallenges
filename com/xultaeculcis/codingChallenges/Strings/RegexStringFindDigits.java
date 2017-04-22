package com.xultaeculcis.codingChallenges.Strings;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by sicluceatlux on 2017-04-15.
 */
public class RegexStringFindDigits {
	
	public static void main(String args[]) {
		
		// Regular expression pattern to test input
		String regex = "(.)*(\\d)(.)*";
		Pattern pattern = Pattern.compile(regex);
		
		Scanner reader = new Scanner(System.in);
		String input = "TEST";
		
		System.out.println("Please enter input, must contain at-least one digit");
		
		while (!input.equalsIgnoreCase("EXIT")) {
			
			input = reader.nextLine();
			
			// Pattern pattern = Pattern.compile(regex);  // Don't do this, creating Pattern is expensive
			Matcher matcher = pattern.matcher(input);
			
			boolean isMatched = matcher.matches();
			if (isMatched) {
				System.out.println("PASS");
				
			} else {
				System.out.println("FAIL, Incorrect input");
				
			}
		}
	}
	
}

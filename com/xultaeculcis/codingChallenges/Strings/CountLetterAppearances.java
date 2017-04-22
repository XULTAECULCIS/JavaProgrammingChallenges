package com.xultaeculcis.codingChallenges.Strings;

import java.util.Scanner;

/**
 * Created by sicluceatlux on 2017-04-16.
 */
public class CountLetterAppearances {
	public static void main(String args[]) {
		System.out.println("Please enter some text: ");
		Scanner reader = new Scanner(System.in);
		String input = reader.nextLine();
		
		System.out.println("Please enter character to be counted: ");
		char character = reader.next().charAt(0);
		int charCount = 0; //resetting character count
		for (char ch : input.toCharArray()) {
			if (ch == character) {
				charCount++;
			}
		}
		
		System.out.println("Number of occurrences in String [" + input + "] is : " + charCount);
	}
}

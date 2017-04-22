package com.xultaeculcis.codingChallenges.Strings;

import java.util.Scanner;

/**
 * Created by sicluceatlux on 2017-04-16.
 */
public class VowelsAndConsonantsCount {
	public static void main(String args[]) {
		System.out.println("Please enter some text");
		Scanner reader = new Scanner(System.in);
		String input = reader.nextLine();
		char[] letters = input.toCharArray();
		int countC = 0;
		int countV = 0;
		for (char c : letters) {
			switch (c) {
				case 'a':
				case 'e':
				case 'i':
				case 'o':
				case 'u':
					countV++;
					break;
				default:
					countC++;
			}
		}
		System.out.println("Number of vowels in String [" + input + "] is : " + countV);
		System.out.println("Number of consonants in String [" + input + "] is : " + countC);
	}
}

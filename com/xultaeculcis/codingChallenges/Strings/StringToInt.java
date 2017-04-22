package com.xultaeculcis.codingChallenges.Strings;

import java.util.Scanner;

/**
 * Created by sicluceatlux on 2017-04-15.
 */
public class StringToInt {
	public static void main(String args[]) {
		System.out.println("Please enter an integer number");
		Scanner scnr = new Scanner(System.in);
		String input = scnr.nextLine();
		int i = Integer.parseInt(input);
		System.out.println("String converted to int : " + i);
		System.out.println("Please enter another integer number");
		String str = scnr.nextLine();
		int j = Integer.valueOf(str); // can return cached value
		System.out.println("String to int using valueOf() : " + j);
	}
}

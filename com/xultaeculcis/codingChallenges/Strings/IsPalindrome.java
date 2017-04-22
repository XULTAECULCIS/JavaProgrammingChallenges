package com.xultaeculcis.codingChallenges.Strings;

import java.util.Scanner;

/**
 * Created by sicluceatlux on 2017-04-16.
 */
public class IsPalindrome {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter some text...");
		String someString = scanner.nextLine();
		char[] chars = someString.toCharArray();
		
		for(int i =0; i < chars.length/2; i++){
			if(chars[i] != chars[chars.length-1-i]){
				System.out.println(someString + " is not a palindrome!");
				System.exit(-1);
			}
		}
		
		System.out.println(someString + " is a palindrome");
	}
}

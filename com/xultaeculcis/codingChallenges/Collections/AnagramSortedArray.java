package com.xultaeculcis.codingChallenges.Collections;

import java.util.Arrays;

/**
 * Created by sicluceatlux on 2017-04-13.
 */
public class AnagramSortedArray {
	public static boolean isAcronymBetter(String s1, String s2) {
		char[] s1Chars = s1.toCharArray();
		char[] s2Chars = s2.toCharArray();
		Arrays.sort(s1Chars);
		Arrays.sort(s2Chars);
		return Arrays.equals(s1Chars, s2Chars);
	}
	
	public static void main(String[] args){
		String word = "sicluceatlux";
		String word2 = "xultaeculcis";
		
		System.out.println(isAcronymBetter(word,word2));
	}
}

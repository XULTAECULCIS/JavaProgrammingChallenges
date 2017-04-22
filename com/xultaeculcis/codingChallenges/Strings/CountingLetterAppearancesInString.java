package com.xultaeculcis.codingChallenges.Strings;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by sicluceatlux on 2017-04-13.
 */
public class CountingLetterAppearancesInString {
	
	public static void main(String[] args) {
		Map<Character, Integer> count = new HashMap<>();
		String word = "SicLuceatLux";
		for(int i = 0; i < word.length(); i++){
			if(count.containsKey(word.charAt(i))){
				count.put(word.charAt(i),count.get(word.charAt(i))+1);
			}
			else
				count.put(word.charAt(i),1);
		}
		
		System.out.println(Arrays.asList(count)); // method 1
	}
}
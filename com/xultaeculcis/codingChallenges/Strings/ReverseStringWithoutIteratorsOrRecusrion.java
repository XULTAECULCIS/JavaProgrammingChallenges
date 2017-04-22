package com.xultaeculcis.codingChallenges.Strings;

/**
 * Created by sicluceatlux on 2017-04-13.
 */
public class ReverseStringWithoutIteratorsOrRecusrion {
	
	public static void main(String[] args) {
		String givenString = "Java programming";
		System.out.println("reverse: " + new StringBuffer(givenString).reverse().toString());
		System.out.println("reverse = " + new StringBuilder(givenString).reverse());
		System.out.println(reverse(givenString));
	}
	
	public static String reverse(String source){
		if(source == null || source.isEmpty()){
			return source;
		}
		String reverse = "";
		for(int i = source.length() -1; i>=0; i--){
			reverse = reverse + source.charAt(i);
		}
		
		return reverse;
	}
	
}

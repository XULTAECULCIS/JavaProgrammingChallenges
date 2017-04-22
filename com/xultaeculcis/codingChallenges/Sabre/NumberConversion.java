package com.xultaeculcis.codingChallenges.Sabre;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by sicluceatlux on 2017-04-21.
 */
public class NumberConversion {
	public static void main(String[] args){
		Set<Integer> set = new HashSet<>();
		set.add(72);
		//set.add(72L);
		set.add(new Integer(88));
		//set.add(Integer.velueOf(123));
		System.out.println(set.toString());
	}
}

package com.xultaeculcis.codingChallenges.Sabre;

import java.sql.Array;
import java.util.*;

/**
 * Created by sicluceatlux on 2017-04-21.
 */
public class UniqueString {
	public static void main(String[] args){
		String str = new Scanner(System.in).nextLine();
		Map<Character, Integer> map = new HashMap<>();
		
		int retVal = 1;
		
		for(int i = 0; i < str.length(); i ++){
			if(map.containsKey(str.charAt(i))){
				map.put(str.charAt(i), map.get(str.charAt(i)) + 1);
			}
			else
				map.put(str.charAt(i), 1);
		}
		
		for(Integer val : map.values()){
			if(val > 1){
				retVal = 0;
				break;
			}
			else
				retVal = 1;
		}
		//System.out.println(map.toString());
		System.out.println(retVal);
	}
}

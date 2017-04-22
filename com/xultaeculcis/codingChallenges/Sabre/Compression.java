package com.xultaeculcis.codingChallenges.Sabre;

import java.util.*;

/**
 * Created by sicluceatlux on 2017-04-21.
 */
public class Compression {
	
	public static String compress(String str){
		char[] charArray = str.toCharArray();
		int count = 1;
		char previous = charArray[0];
		StringBuilder res = new StringBuilder();
		res.append(previous);
		for(int i = 1; i < charArray.length; i++){
			if((charArray[i] != previous) && count == 1){
				res.append(charArray[i]);
				previous = charArray[i];
			}
			else if(charArray[i] != previous && count > 1){
				res.append(count);
				res.append(charArray[i]);
				count = 1;
				previous = charArray[i];
			}
			else if(charArray[i] == previous){
				count++;
			}
			if(i == (charArray.length - 1) && charArray[i] != previous && count == 1){
				res.append(charArray[i]);
			}
			if(i == (charArray.length - 1)){
				if(count > 1)
					res.append(count);
			}
		}
		return res.toString();
	}
	
	public static void main(String [] args){
	
		System.out.println(compress("asaaaasddddddda"));
	}
}

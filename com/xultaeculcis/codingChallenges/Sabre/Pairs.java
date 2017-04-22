package com.xultaeculcis.codingChallenges.Sabre;

import java.util.*;

/**
 * Created by sicluceatlux on 2017-04-21.
 */
public class Pairs {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int n, k, count = 0;
		Set<Integer> set = new LinkedHashSet<>();
		
		n = scanner.nextInt();
		k = scanner.nextInt();
		
		for(int i = 0; i < n; i ++){
			set.add(scanner.nextInt());
		}
		Object[] array = set.toArray();
		for(int i = 0; i < n; i++){
			for(int j = i + 1; j < n; j++)
			if(Math.abs((Integer)array[i] - (Integer) array[j]) == k ){
				count++;
			}
		}
		
		System.out.println(count);
	}
}

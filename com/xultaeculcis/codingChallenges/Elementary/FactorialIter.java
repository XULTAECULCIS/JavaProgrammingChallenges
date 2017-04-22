package com.xultaeculcis.codingChallenges.Elementary;

import java.util.Scanner;

/**
 * Created by sicluceatlux on 2017-03-29.
 */
public class FactorialIter {
	
	private static long fact(int n){
		if(n<=0) return 0;
		else if(n==1) return 1;
		else {
			int returnVal = 1;
			for(int i = 1;i <= n; i++){
				returnVal *= i;
			}
			return returnVal;
		}
	}
	
	public static void main(String[] args) {
		System.out.println("Enter the number of which the factorial you want to know: ");
		Scanner scanner = new Scanner(System.in);
		long returnVal = fact(scanner.nextInt());
		System.out.println(returnVal);
	}
}

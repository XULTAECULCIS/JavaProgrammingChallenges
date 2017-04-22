package com.xultaeculcis.codingChallenges.Elementary;

import java.util.Scanner;

/**
 * Created by sicluceatlux on 2017-03-29.
 */
public class FibonacciRec {
	
	private static long fibo(int n){
		if(n<=0) return 0;
		else if(n==1) return 1;
		else return fibo(n-1)+fibo(n-2);
	}
	
	public static void main(String[] args) {
		System.out.println("Enter number of the element of fibonacci sequence to be printed: ");
		Scanner scanner = new Scanner(System.in);
		long returnVal = fibo(scanner.nextInt());
		System.out.println(returnVal);
	}
}

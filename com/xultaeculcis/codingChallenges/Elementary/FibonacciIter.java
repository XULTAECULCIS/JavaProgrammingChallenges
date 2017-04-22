package com.xultaeculcis.codingChallenges.Elementary;

import java.util.Scanner;

/**
 * Created by sicluceatlux on 2017-03-29.
 */
public class FibonacciIter {
	
	private static long fibo(int n){
		if(n<=0) return 0;
		else if(n==1) return 1;
		else{
			int returnVal = 0;
			int a,b;
			a = 0;
			b = 1;
			for(int i = 2; i <= n; i++){
				returnVal = a + b;
				a = b;
				b = returnVal;
			}
			return returnVal;
		}
	}
	
	public static void main(String[] args) {
		System.out.println("Enter number of the element of fibonacci sequence to be printed: ");
		Scanner scanner = new Scanner(System.in);
		long returnVal = fibo(scanner.nextInt());
		System.out.println(returnVal);
	}
}

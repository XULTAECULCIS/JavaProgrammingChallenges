package com.xultaeculcis.codingChallenges.Elementary;

/**
 * Created by sicluceatlux on 2017-04-13.
 */
public class TailRec {
	public static int sumFromOneToN(int n, int a) {
		if (n < 1) {
			return a;
		}
		
		return sumFromOneToN(n - 1, a + n);
	}
	
	public static int sumFromOneToN2(int n) {
		if (n < 1) {
			return 0;
		}
		
		return n + sumFromOneToN2(n - 1);
	}
	public static void main(String[] args) {
		System.out.println(sumFromOneToN(55, 1));
		System.out.println(sumFromOneToN2(55));
	}
}

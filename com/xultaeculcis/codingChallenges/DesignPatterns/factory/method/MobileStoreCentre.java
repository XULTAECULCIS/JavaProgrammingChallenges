package com.xultaeculcis.codingChallenges.DesignPatterns.factory.method;

/*
 * @author Sumith Puri
 */
public class MobileStoreCentre {

	public static void main(String args[]) {
		
		MobileStore mobileStore01 = new NokiaStore();
		MobileStore mobileStore02 = new SonyStore();

		Mobile mobile01 = mobileStore01.assemble("ASeries");
		Mobile mobile02 = mobileStore02.assemble("BSeries");
	}
}

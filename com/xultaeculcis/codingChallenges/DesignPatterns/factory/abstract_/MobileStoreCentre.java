package com.xultaeculcis.codingChallenges.DesignPatterns.factory.abstract_;

/*
 * @author Sumith Puri
 */
public class MobileStoreCentre {

	public static void main(String args[]) {
		
		MobileStore mobileStore = MobileStoreFactory.getMobileStore("Nokia");
		Mobile mobile = mobileStore.assemble("ASeries");
		mobile.experience();

		System.out.println("");
		
		mobileStore = MobileStoreFactory.getMobileStore("Sony");
		mobile = mobileStore.assemble("BSeries");
		mobile.experience();
	}
}

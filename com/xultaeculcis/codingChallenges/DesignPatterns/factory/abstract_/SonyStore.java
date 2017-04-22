package com.xultaeculcis.codingChallenges.DesignPatterns.factory.abstract_;

/*
 * @author Sumith Puri
 */
public class SonyStore extends MobileStore {

	@Override
	protected Mobile createMobile(String make) {
		Mobile mobile = null;
		
		if(make.equals("ASeries")) {
			mobile = new SonyASeries();
		} else if(make.equals("BSeries")) {
			mobile = new SonyBSeries();
		} else if(make.equals("CSeries")) {
			mobile = new SonyCSeries();
		}
		
		return mobile;
	}
}

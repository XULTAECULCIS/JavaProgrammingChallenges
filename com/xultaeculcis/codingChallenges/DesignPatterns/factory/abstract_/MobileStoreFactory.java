/**
 * 
 */
package com.xultaeculcis.codingChallenges.DesignPatterns.factory.abstract_;

/**
 * @author sumith_puri
 *
 * The Abstract Factory Design Pattern will instantiate the appropriate abstract
 * factory.
 */
public class MobileStoreFactory {

	// Get Abstract Factory
	public static MobileStore getMobileStore(String mobileStore) {

		MobileStore mStore = null;
		if ("Nokia".equalsIgnoreCase(mobileStore))
			mStore = new NokiaStore();
		else if ("Sony".equalsIgnoreCase(mobileStore))
			mStore = new SonyStore();
		return mStore;
	}
}

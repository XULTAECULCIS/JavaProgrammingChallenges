package com.xultaeculcis.codingChallenges.Collections;

import java.util.Comparator;

/**
 * Created by sicluceatlux on 2017-04-15.
 */
public class CountrySortByIdComparator implements Comparator {
	
	@Override
	public int compare(Object c1, Object c2) {
		Country country1 = (Country)c1;
		Country country2 = (Country)c2;
		return (country1.getCountryId() < country2.getCountryId() ) ? -1: (country1.getCountryId() > country2.getCountryId() ) ? 1:0 ;
	}
	
}

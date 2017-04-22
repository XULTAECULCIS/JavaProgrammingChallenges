package com.xultaeculcis.codingChallenges.Collections;

/**
 * Created by sicluceatlux on 2017-04-15.
 */
public class Country implements Comparable{
	int countryId;
	String countryName;
	
	
	public Country(int countryId, String countryName) {
		super();
		this.countryId = countryId;
		this.countryName = countryName;
	}
	
	@Override
	public int compareTo(Object c) {
		Country country =(Country) c;
		return (this.countryId < country.countryId ) ? -1: (this.countryId > country.countryId ) ? 1:0 ;
	}
	
	
	public int getCountryId() {
		return countryId;
	}
	
	
	public void setCountryId(int countryId) {
		this.countryId = countryId;
	}
	
	
	public String getCountryName() {
		return countryName;
	}
	
	
	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}
	
}
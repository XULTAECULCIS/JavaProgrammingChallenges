package com.xultaeculcis.codingChallenges.Collections;

/**
 * Created by sicluceatlux on 2017-04-15.
 */
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorMain {

	public static void main(String[] args) {
		Country indiaCountry=new Country(1, "India");
		Country chinaCountry=new Country(4, "China");
		Country nepalCountry=new Country(3, "Nepal");
		Country bhutanCountry=new Country(2, "Bhutan");
		
		List listOfCountries = new ArrayList();
		listOfCountries.add(indiaCountry);
		listOfCountries.add(chinaCountry);
		listOfCountries.add(nepalCountry);
		listOfCountries.add(bhutanCountry);
		
		System.out.println("Before Sort by id : ");
		for (int i = 0; i < listOfCountries.size(); i++) {
			Country country=(Country) listOfCountries.get(i);
			System.out.println("Country Id: "+country.getCountryId()+"||"+"Country name: "+country.getCountryName());
		}
		Collections.sort(listOfCountries,new CountrySortByIdComparator());
		
		System.out.println("After Sort by id: ");
		for (int i = 0; i < listOfCountries.size(); i++) {
			Country country=(Country) listOfCountries.get(i);
			System.out.println("Country Id: "+country.getCountryId()+"|| "+"Country name: "+country.getCountryName());
			
		}
	}
	
}

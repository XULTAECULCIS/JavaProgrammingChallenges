package com.xultaeculcis.codingChallenges.Collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;

/**
 * Created by sicluceatlux on 2017-04-15.
 */
public class RemovingDuplicatesFromArrayList {
	public static void main(String[] args) {
		ArrayList employeeNameList = new ArrayList();
		employeeNameList.add("John");
		employeeNameList.add("Ankit");
		employeeNameList.add("Rohan");
		employeeNameList.add("John");
		employeeNameList.add("Amit");
		employeeNameList.add("Ankit");
		
		System.out.println("Removing duplicates from list:");
		// Using iterative approach
		ArrayList uniqueElements = new ArrayList();
		for (Object empName : employeeNameList) {
			
			if (!uniqueElements.contains(empName)) {
				uniqueElements.add(empName);
			}
		}
		
		System.out.println("Using iterative approach:");
		for (Object uniqElem : uniqueElements) {
			System.out.println(uniqElem);
		}
		System.out.println("*******************************");
		System.out.println("Using HashSet :");
		// using HashSet but does not maintain order
		uniqueElements = new ArrayList(new HashSet(
				employeeNameList));
		for (Object uniqElem : uniqueElements) {
			System.out.println(uniqElem);
		}
		System.out.println("*******************************");
		System.out.println("Using LinkedHashSet :");
		// using LinkedHashSet maintaining order
		uniqueElements = new ArrayList(new LinkedHashSet(
				employeeNameList));
		for (Object uniqElem : uniqueElements) {
			System.out.println(uniqElem);
		}
		
	}
}

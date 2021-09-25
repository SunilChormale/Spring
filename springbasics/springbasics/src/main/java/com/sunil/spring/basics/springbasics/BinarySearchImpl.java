package com.sunil.spring.basics.springbasics;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

// Setter Injection and (No Setter and No Constructor Injection)

@Component
public class BinarySearchImpl {
	
	@Autowired
	private SortAlgorithm sortAlgorithm;


	//SETTER INJECTION
	/*
	 * public void setSortAlgorithm(SortAlgorithm sortAlgorithm) {
	 * this.sortAlgorithm = sortAlgorithm; }
	 */

	//In the (No Setter and No Constructor Injection) we don't need a constructor or setter function
	
	public int binarySearch(int[] numbers, int numberToSearchFor) {
		
		sortAlgorithm.sort(numbers);
		System.out.println(sortAlgorithm);
		return 1;
	}
}
